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

package de.florianmichael.rclasses.sio;

import java.lang.reflect.Field;

public class Unsafe {
    public final static sun.misc.Unsafe UNSAFE = getUnsafe();

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
