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

package de.florianmichael.rclasses.common;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public final class StringUtils {
    public final static String UPPER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final static String LOWER_CHARS = "abdcefghijklmnopqrstuvwxyz";
    public final static String SPECIAL_CHARS = "!@#$%&*()_+-=[]|,./?><";
    public final static String NUMBER_CHARS = "0123456789";

    public final static List<String> ESCAPED_CHARACTERS = Arrays.asList("\t", "\b", "\n", "\r");

    /**
     * Convention: IEC 60027-2
     */
    private final static String[] BYTES_UNIT = { "B", "KiB", "MiB", "GiB", "TiB" };
    private final static DecimalFormat OPTIONAL_FORMAT = new DecimalFormat("#.##");

    /**
     * Formats a value in bytes to a human-readable format
     * @param value The raw value in bytes
     * @return The formatted value in bytes
     */
    public static String formatBytes(final long value) {
        int index = (int) (Math.log(value) / Math.log(1024.0));
        double data = value / Math.pow(1024.0, index);
        if (index < 0) index = 0;
        if (Double.isNaN(data)) data = 0;

        return OPTIONAL_FORMAT.format(data) + " " + BYTES_UNIT[index];
    }

    /**
     * Uppercase the first letter of the string .
     * @param string The string to uppercase
     * @return The uppercase string
     */
    public static String uppercaseFirst(final String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    /**
     * Reverses the given string
     * @param string The string to reverse
     * @return The reversed string
     */
    public static String reverse(final String string) {
        final char[] characters = string.toCharArray();
        final char[] reversed = new char[characters.length];
        for (int i = 0; i < characters.length; i++)
            reversed[i] = characters[characters.length - i - 1];
        return new String(reversed);
    }

    /**
     * Generates a string of whitespaces
     * @param count The count of whitespaces
     * @return The generated string
     */
    public static String whitespace(final int count) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++)
            builder.append("	");
        return builder.toString();
    }

    /**
     * Generates a string of spaces
     * @param count The count of spaces
     * @return The generated string
     */
    public static String space(final int count) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++)
            builder.append(" ");
        return builder.toString();
    }

    /**
     * Returns the longest string of the given strings
     * @param strings The strings to check
     * @return The longest string
     */
    public static String longestOf(final List<String> strings) {
        return longestOf(strings.toArray(new String[0]));
    }

    /**
     * Returns the longest string of the given strings
     * @param strings The strings to check
     * @return The longest string
     */
    public static String longestOf(final String... strings) {
        String longestString = "";
        int max = 0;
        for (final String string : strings) {
            if (string.length() > max)
                max = (longestString = string).length();
        }
        return longestString;
    }

    /**
     * Returns the smallest string of the given strings
     * @param strings The strings to check
     * @return The smallest string
     */
    public static String smallestOf(final List<String> strings) {
        return smallestOf(strings.toArray(new String[0]));
    }

    /**
     * Returns the smallest string of the given strings
     * @param strings The strings to check
     * @return The smallest string
     */
    public static String smallestOf(final String... strings) {
        String smallestString = "";
        long min = Long.MAX_VALUE;
        for (final String string : strings) {
            if (string.length() < min)
                min = (smallestString = string).length();
        }
        return smallestString;
    }

    /**
     * Normalizes the given enum name to a readable string (e.g. "TEST_ENUM" -> "Test enum"). This method is used to
     * generate a readable name for the enum. "$" will be removed, "_" will be replaced with " ",
     * and the first letter will be uppercase.
     *
     * @param name The name to normalize
     * @return The normalized name
     */
    public static String normalizeEnumName(String name) {
        if (name.length() < 2) return name;

        name = name.replace("_", " ");
        name = name.replace("$", "");

        return name.charAt(0) + name.substring(1).toLowerCase();
    }
}
