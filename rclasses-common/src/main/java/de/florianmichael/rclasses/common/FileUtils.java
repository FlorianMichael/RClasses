/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.common;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.FileSystem;
import java.nio.file.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static java.nio.file.Files.*;

public final class FileUtils {

    /**
     * Gets a file system for the given URI or create one.
     *
     * @param uri the URI
     * @return the file system
     * @throws IOException if creating the file system fails
     */
    public static FileSystem getFileSystem(final URI uri) throws IOException {
        FileSystem fileSystem;
        try {
            fileSystem = FileSystems.getFileSystem(uri);
        } catch (FileSystemNotFoundException e) {
            fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
        }
        return fileSystem;
    }

    /**
     * Downloads a file from the internet and saves it to the given output file.
     *
     * @param url    The url to download the file from.
     * @param output The file to save the downloaded file to.
     * @return The output file.
     * @throws Throwable If an error occurs while downloading the file.
     */
    public static File downloadFile(final String url, final File output) throws Throwable {
        return downloadFile(url, SimpleHTTPClient.DEFAULT_AGENT, output);
    }

    /**
     * Downloads a file from the internet and saves it to the given output file.
     *
     * @param url    The url to download the file from.
     * @param agent  The user agent to use.
     * @param output The file to save the downloaded file to.
     * @return The output file.
     * @throws Throwable If an error occurs while downloading the file.
     */
    public static File downloadFile(final String url, final String agent, final File output) throws Throwable {
        final URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.setRequestProperty("User-Agent", agent);
        urlConnection.connect();
        try (final ReadableByteChannel channel = Channels.newChannel(urlConnection.getInputStream())) {
            try (final FileOutputStream fileOutputStream = new FileOutputStream(output)) {
                fileOutputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);
            }
        }
        return output;
    }

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

    /**
     * Copies a resource to the given path.
     *
     * @param resource The resource path to copy
     * @param name     The name of the output file
     * @param path     The path to copy the resource to
     */
    public static void copyResource(final String resource, final String name, final Path path) throws IOException {
        try (final InputStream inputStream = FileUtils.class.getResourceAsStream(resource)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Resource not found: " + resource);
            }

            final File outputFile = path.resolve(name).toFile();
            try (final OutputStream outputStream = newOutputStream(outputFile.toPath())) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, length);
                }
            }
        }
    }

    /**
     * Creates a folder if it does not exist.
     *
     * @param path the folder path
     */
    public static void createFolder(final Path path) {
        if (Files.exists(path)) {
            return;
        }

        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads a file to a byte array.
     *
     * @param path the file path
     * @return the byte array
     */
    public static byte[] readFile(final Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes a folder and all its content
     *
     * @param folder the folder to delete
     * @throws IOException if an I/O error occurs
     */
    public static void deleteFolder(final File folder) throws IOException {
        Files.walk(folder.toPath()).sorted(Comparator.reverseOrder()).forEach(path -> {
            try {
                Files.delete(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
