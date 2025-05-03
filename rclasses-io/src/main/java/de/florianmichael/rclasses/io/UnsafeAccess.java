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

package de.florianmichael.rclasses.io;

import java.lang.reflect.Field;

/**
 * Utility methods for IO.
 */
public class UnsafeAccess {

    /**
     * The unsafe instance.
     */
    public static final sun.misc.Unsafe UNSAFE = getUnsafe();

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

}
