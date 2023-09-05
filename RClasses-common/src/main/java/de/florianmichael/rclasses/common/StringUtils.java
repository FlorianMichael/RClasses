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
import java.util.regex.Pattern;

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
     * @param name The name to normalize
     * @return The normalized name
     */
    public static String normalizeEnumName(String name) {
        if (name.length() < 2) return name;

        name = name.replace("_", " ");
        name = name.replace("$", "");

        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    /**
     * Replaces the last occurrence of a substring in a string with another substring.
     * @param string The input string.
     * @param target The substring to be replaced.
     * @param replacement The substring to replace the last occurrence of the target.
     * @return The modified string with the last occurrence replaced.
     */
    public static String replaceLast(final String string, final String target, final String replacement) {
        if (string == null || target == null || replacement == null) {
            return string;
        }
        return string.replaceFirst("(?s)(.*)" + target, "$1" + replacement);
    }

    /**
     * Replaces all occurrences of a substring in a string, ignoring case sensitivity.
     * @param string The input string.
     * @param sequence The substring to be replaced.
     * @param replacement The substring to replace all occurrences of the target.
     * @return The modified string with all occurrences replaced.
     */
    public static String replaceIgnoreCase(final String string, final String sequence, final String replacement) {
        if (string == null || sequence == null || replacement == null) return string;

        return Pattern.compile(sequence, Pattern.CASE_INSENSITIVE).matcher(string).replaceAll(replacement);
    }

    /**
     * Checks if a string contains another string, ignoring case sensitivity.
     * @param string The input string.
     * @param sequence The string to check for containment.
     * @return True if the input string contains the target string (case-insensitive), otherwise false.
     */
    public static boolean contains(final String string, final String sequence) {
        if (string == null || sequence == null) return false;

        return string.toLowerCase().contains(sequence.toLowerCase());
    }

    /**
     * Checks if a string ends with another string, ignoring case sensitivity.
     * @param string The input string.
     * @param suffix The string to check for at the end.
     * @return True if the input string ends with the target string (case-insensitive), otherwise false.
     */
    public static boolean endsWith(final String string, final String suffix) {
        if (string == null || suffix == null) return false;

        return string.toLowerCase().endsWith(suffix.toLowerCase());
    }

    /**
     * Checks if a string starts with another string, ignoring case sensitivity.
     * @param input The input string.
     * @param prefix The string to check for at the beginning.
     * @return True if the input string starts with the target string (case-insensitive), otherwise false.
     */
    public static boolean startsWith(final String input, final String prefix) {
        if (input == null || prefix == null) return false;

        return input.toLowerCase().startsWith(prefix.toLowerCase());
    }
}
