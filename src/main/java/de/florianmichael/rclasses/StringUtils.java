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

package de.florianmichael.rclasses;

import java.util.List;

public final class StringUtils {
    public final static String UPPER_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public final static String LOWER_CHARS = "abdcefghijklmnopqrstuvwxyz";
    public final static String SPECIAL_CHARS = "!@#$%&*()_+-=[]|,./?><";
    public final static String NUMBER_CHARS = "0123456789";

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
