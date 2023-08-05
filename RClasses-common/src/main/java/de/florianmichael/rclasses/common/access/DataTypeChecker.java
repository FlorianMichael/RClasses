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

package de.florianmichael.rclasses.common.access;

public class DataTypeChecker {

    public static boolean isInteger(final String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isLong(final String input) {
        try {
            Long.parseLong(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isFloat(final String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDouble(final String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBoolean(final String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    public static boolean isByte(final String input) {
        try {
            Byte.parseByte(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isShort(final String input) {
        try {
            Short.parseShort(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    public static boolean isCharacter(final String input) {
        return input.length() == 1;
    }
}
