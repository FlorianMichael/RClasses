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

package de.florianmichael.rclasses.io;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.util.Collections;

/**
 * Utility methods for IO.
 */
public class IOUtils {

    /**
     * The unsafe instance.
     */
    public final static sun.misc.Unsafe UNSAFE = getUnsafe();

    /**
     * @return the unsafe instance
     */
    public static sun.misc.Unsafe getUnsafe() {
        try {
            for (Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
                if (field.getType().equals(sun.misc.Unsafe.class)) {
                    field.setAccessible(true);
                    return (sun.misc.Unsafe) field.get(null);
                }
            }
        } catch (Throwable ignored) {
        }
        throw new IllegalStateException("Unable to get Unsafe instance");
    }

    /**
     * Gets a file system for the given URI or create one.
     *
     * @param uri the URI
     * @return the file system
     * @throws IOException if creating the file system fails
     */
    private FileSystem getFileSystem(final URI uri) throws IOException {
        FileSystem fileSystem;
        try {
            fileSystem = FileSystems.getFileSystem(uri);
        } catch (FileSystemNotFoundException e) {
            fileSystem = FileSystems.newFileSystem(uri, Collections.emptyMap());
        }
        return fileSystem;
    }
}
