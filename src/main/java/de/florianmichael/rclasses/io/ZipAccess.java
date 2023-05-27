/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.rclasses.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static java.nio.file.Files.*;

public class ZipAccess {

    public static void unzipFolder(final File source, final Path target) throws IOException {
        try (final ZipInputStream zis = new ZipInputStream(newInputStream(source.toPath()))) {
            ZipEntry zipEntry = zis.getNextEntry();

            while (zipEntry != null) {
                final boolean isDirectory = zipEntry.getName().endsWith(File.separator);
                final Path newPath = zipSlipProtect(zipEntry, target);
                if (isDirectory) {
                    createDirectories(newPath);
                } else {
                    if (newPath.getParent() != null && notExists(newPath.getParent())) createDirectories(newPath.getParent());
                    copy(zis, newPath, StandardCopyOption.REPLACE_EXISTING);
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
        }
    }

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

    public static void extractFile(final ZipInputStream zipIn, final String filePath) throws IOException {
        final BufferedOutputStream bos = new BufferedOutputStream(newOutputStream(Paths.get(filePath)));
        final byte[] bytesIn = new byte[8192];
        int read;
        while ((read = zipIn.read(bytesIn)) != -1) bos.write(bytesIn, 0, read);
        bos.close();
    }

    public static Path zipSlipProtect(final ZipEntry zipEntry, final Path targetDir) throws IOException {
        final Path targetDirResolved = targetDir.resolve(zipEntry.getName());
        final Path normalizePath = targetDirResolved.normalize();

        if (!normalizePath.startsWith(targetDir)) {
            throw new IOException(String.format("Invalid zip file: %s", zipEntry.getName()));
        }
        return normalizePath;
    }
}
