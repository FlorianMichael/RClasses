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

import de.florianmichael.rclasses.common.StringUtils;

import java.math.BigInteger;
import java.util.UUID;

/**
 * This file contains methods to check the data type of string.
 */
public class DataTypeChecker {
    private final static int DEFAULT_RADIX = 10;

    private final static int MAX_INTEGER_STRING_LENGTH = StringUtils.maximumStringSize(DEFAULT_RADIX, Integer.MAX_VALUE);
    private final static int MAX_LONG_STRING_LENGTH = StringUtils.maximumStringSize(DEFAULT_RADIX, Long.MAX_VALUE);
    private final static int MAX_SHORT_STRING_LENGTH = StringUtils.maximumStringSize(DEFAULT_RADIX, Short.MAX_VALUE);
    private final static int MAX_BYTE_STRING_LENGTH = StringUtils.maximumStringSize(DEFAULT_RADIX, Byte.MAX_VALUE);

    /**
     * Checks if the given string is an integer.
     * @param input The string to check.
     * @return True if the string is an integer, false otherwise.
     */
    public static boolean isInteger(final String input) {
        if (input.isEmpty() || input.length() > MAX_INTEGER_STRING_LENGTH) return false;
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is an integer.
     * @param input The string to check.
     * @param radix The radix used while parsing the input.
     * @return True if the string is an integer, false otherwise.
     */
    public static boolean isInteger(final String input, final int radix) {
        if (input.isEmpty() || input.length() > StringUtils.maximumStringSize(radix, Integer.MAX_VALUE)) return false;
        try {
            Integer.parseInt(input, radix);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a long.
     * @param input The string to check.
     * @return True if the string is a long, false otherwise.
     */
    public static boolean isLong(final String input) {
        if (input.isEmpty() || input.length() > MAX_LONG_STRING_LENGTH) return false;
        try {
            Long.parseLong(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a long.
     * @param input The string to check.
     * @param radix The radix used while parsing the input.
     * @return True if the string is a long, false otherwise.
     */
    public static boolean isLong(final String input, final int radix) {
        if (input.isEmpty() || input.length() > StringUtils.maximumStringSize(radix, Long.MAX_VALUE)) return false;
        try {
            Long.parseLong(input, radix);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a float.
     * @param input The string to check.
     * @return True if the string is a float, false otherwise.
     */
    public static boolean isFloat(final String input) {
        if (input.isEmpty()) return false;
        try {
            Float.parseFloat(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a double.
     * @param input The string to check.
     * @return True if the string is a double, false otherwise.
     */
    public static boolean isDouble(final String input) {
        if (input.isEmpty()) return false;
        try {
            Double.parseDouble(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a boolean.
     * @param input The string to check.
     * @return True if the string is a boolean, false otherwise.
     */
    public static boolean isBoolean(final String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    /**
     * Checks if the given string is a byte.
     * @param input The string to check.
     * @return True if the string is a byte, false otherwise.
     */
    public static boolean isByte(final String input) {
        if (input.isEmpty() || input.length() > MAX_BYTE_STRING_LENGTH) return false;
        try {
            Byte.parseByte(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a byte.
     * @param input The string to check.
     * @param radix The radix used while parsing the input.
     * @return True if the string is a byte, false otherwise.
     */
    public static boolean isByte(final String input, final int radix) {
        if (input.isEmpty() || input.length() > StringUtils.maximumStringSize(radix, Byte.MAX_VALUE)) return false;
        try {
            Byte.parseByte(input, radix);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a short.
     * @param input The string to check.
     * @return True if the string is a short, false otherwise.
     */
    public static boolean isShort(final String input) {
        if (input.isEmpty() || input.length() > MAX_SHORT_STRING_LENGTH) return false;
        try {
            Short.parseShort(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a short.
     * @param input The string to check.
     * @param radix The radix used while parsing the input.
     * @return True if the string is a short, false otherwise.
     */
    public static boolean isShort(final String input, final int radix) {
        if (input.isEmpty() || input.length() > StringUtils.maximumStringSize(radix, Short.MAX_VALUE)) return false;
        try {
            Short.parseShort(input, radix);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a character.
     * @param input The string to check.
     * @return True if the string is a character, false otherwise.
     */
    public static boolean isCharacter(final String input) {
        return input.length() == 1;
    }

    /**
     * Checks if a given string is a UUID.
     * @param input The string to check.
     * @return True if the string is a UUID, false otherwise.
     */
    public static boolean isUUID(final String input) {
        if (input.length() != 36) return false;
        try {
            UUID.fromString(input);
            return true;
        } catch (final IllegalArgumentException e) {
            return false;
        }
    }

    /**
     * Checks if the given string is a {@link BigInteger}
     * @param input The string to check.
     * @return True if the string is a BigInteger, false otherwise.
     */
    public static boolean isBigInteger(final String input) {
        return isBigInteger(input, DEFAULT_RADIX);
    }

    /**
     * Checks if the given string is a {@link BigInteger}
     * @param input The string to check.
     * @param radix The radix used while parsing the input.
     * @return True if the string is a BigInteger, false otherwise.
     */
    public static boolean isBigInteger(final String input, final int radix) {
        if (input.isEmpty()) return false;
        try {
            new BigInteger(input, radix);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
}
