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
    public final static String NEW_LINE = ESCAPED_CHARACTERS.get(2);
    private final static String[] BYTES_UNIT = {"B", "KiB", "MiB", "GiB", "TiB"}; // IEC 60027-2
    private final static DecimalFormat OPTIONAL_FORMAT = new DecimalFormat("#.##");

    public static String formatBytes(final long value) {
        int index = (int) (Math.log(value) / Math.log(1024.0));
        double data = value / Math.pow(1024.0, index);
        if (index < 0) index = 0;
        if (Double.isNaN(data)) data = 0;

        return OPTIONAL_FORMAT.format(data) + " " + BYTES_UNIT[index];
    }

    public static String whitespace(final int count) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append("\u0009");
        }
        return builder.toString();
    }

    public static String space(final int count) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append("\u0020");
        }
        return builder.toString();
    }

    public static String longestOf(final List<String> strings) {
        return longestOf(strings.toArray(new String[0]));
    }

    public static String longestOf(final String... strings) {
        String longestString = "";
        int max = 0;
        for (final String string : strings) {
            if (string.length() > max)
                max = (longestString = string).length();
        }
        return longestString;
    }

    public static String smallestOf(final List<String> strings) {
        return smallestOf(strings.toArray(new String[0]));
    }

    public static String smallestOf(final String... strings) {
        String smallestString = "";
        long min = Long.MAX_VALUE;
        for (final String string : strings) if (string.length() < min) min = (smallestString = string).length();
        return smallestString;
    }
}
