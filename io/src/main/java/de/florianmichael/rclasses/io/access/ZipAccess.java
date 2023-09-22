/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.io.access;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static java.nio.file.Files.*;

/**
 * Utility class for accessing zip files.
 */
public class ZipAccess {

    /**
     * Unzips the given zip file to the given target directory.
     *
     * @param source the zip file
     * @param target the target directory
     * @throws IOException if an I/O error occurs
     */
    public static void unzipFolder(final File source, final Path target) throws IOException {
        try (final ZipInputStream zis = new ZipInputStream(newInputStream(source.toPath()))) {
            ZipEntry zipEntry = zis.getNextEntry();

            while (zipEntry != null) {
                final boolean isDirectory = zipEntry.getName().endsWith(File.separator);
                final Path newPath = zipSlipProtect(zipEntry, target);
                if (isDirectory) {
                    createDirectories(newPath);
                } else {
                    if (newPath.getParent() != null && notExists(newPath.getParent()))
                        createDirectories(newPath.getParent());
                    copy(zis, newPath, StandardCopyOption.REPLACE_EXISTING);
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
        }
    }

    /**
     * Unzips the given zip file to the given target directory.
     *
     * @param zipFilePath   the zip file
     * @param destDirectory the target directory
     * @throws IOException if an I/O error occurs
     */
    public static void unzip(final String zipFilePath, final String destDirectory) throws IOException {
        final File destDir = new File(destDirectory);
        if (!destDir.exists()) destDir.mkdir();
        final ZipInputStream zipIn = new ZipInputStream(newInputStream(Paths.get(zipFilePath)));
        ZipEntry entry = zipIn.getNextEntry();
        while (entry != null) {
            final String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                extractFile(zipIn, filePath);
            } else {
                new File(filePath).mkdirs();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }

    /**
     * Extracts a file from the given zip input stream to the given file path.
     *
     * @param zipIn    the zip input stream
     * @param filePath the file path
     * @throws IOException if an I/O error occurs
     */
    public static void extractFile(final ZipInputStream zipIn, final String filePath) throws IOException {
        final BufferedOutputStream bos = new BufferedOutputStream(newOutputStream(Paths.get(filePath)));
        final byte[] bytesIn = new byte[8192];
        int read;
        while ((read = zipIn.read(bytesIn)) != -1) bos.write(bytesIn, 0, read);
        bos.close();
    }

    /**
     * Protects against zip slip vulnerability.
     *
     * @param zipEntry  the zip entry
     * @param targetDir the target directory
     * @return the normalized path
     * @throws IOException if an I/O error occurs
     */
    public static Path zipSlipProtect(final ZipEntry zipEntry, final Path targetDir) throws IOException {
        final Path targetDirResolved = targetDir.resolve(zipEntry.getName());
        final Path normalizePath = targetDirResolved.normalize();

        if (!normalizePath.startsWith(targetDir)) {
            throw new IOException(String.format("Invalid zip file: %s", zipEntry.getName()));
        }
        return normalizePath;
    }
}
