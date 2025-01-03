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

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class contains some useful methods for generating random numbers.
 */
public final class RandomUtils {

    public static final Random RANDOM = new Random();
    public static final SecureRandom SECURE_RANDOM = new SecureRandom();
    public static final ThreadLocalRandom MAIN_THREAD_RANDOM = ThreadLocalRandom.current();

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random integer between min (inclusive) and bound (exclusive).
     */
    public static int randomInt(final int min, final int bound) {
        if (min >= bound) return min;
        return ThreadLocalRandom.current().nextInt(min, bound);
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random double between min (inclusive) and bound (exclusive).
     */
    public static double randomDouble(final double min, final double bound) {
        if (min >= bound) return min;
        return ThreadLocalRandom.current().nextDouble(min, bound);
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random float between min (inclusive) and bound (exclusive).
     */
    public static float randomFloat(final float min, final float bound) {
        if (min >= bound) return min;
        return min + ThreadLocalRandom.current().nextFloat() * (bound - min); // Java 8 support
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random long between min (inclusive) and bound (exclusive).
     */
    public static long randomLong(final long min, final long bound) {
        if (min >= bound) return min;
        return ThreadLocalRandom.current().nextLong(min, bound);
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random short between min (inclusive) and bound (exclusive).
     */
    public static short randomShort(final short min, final short bound) {
        if (min >= bound) return min;
        return (short) ThreadLocalRandom.current().nextInt(min, bound);
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random byte between min (inclusive) and bound (exclusive).
     */
    public static byte randomByte(final byte min, final byte bound) {
        if (min >= bound) return min;
        return (byte) ThreadLocalRandom.current().nextInt(min, bound);
    }

    /**
     * @param min The minimum value.
     * @param bound The upper bound value.
     * @return A random char between min (inclusive) and bound (exclusive).
     */
    public static char randomChar(final char min, final char bound) {
        if (min >= bound) return min;
        return (char) ThreadLocalRandom.current().nextInt(min, bound);
    }

    /**
     * @return A random boolean (either true or false).
     */
    public static boolean randomBoolean() {
        return ThreadLocalRandom.current().nextBoolean();
    }

    /**
     * @param array The array to get the random element from.
     * @param <T>   The type of the array.
     * @return A random element from the given array.
     */
    public static <T> T randomElement(final T[] array) {
        if (array.length == 0) return null;
        return array[randomInt(0, array.length)];
    }

    /**
     * @param list The list to get the random element from.
     * @param <T>  The type of the list.
     * @return A random element from the given list.
     */
    public static <T> T randomElement(final List<T> list) {
        if (list.isEmpty()) return null;
        return list.get(randomInt(0, list.size()));
    }

    /**
     * @param length The length of the byte array.
     * @return A random byte array with the specified length.
     */
    public static byte[] randomBytes(final int length) {
        return randomBytes(length, length);
    }

    /**
     * @param minLength The minimum length of the byte array.
     * @param boundLength The upper bound length of the byte array.
     * @return A random byte array with a random length between minLength (inclusive) and boundLength (exclusive).
     */
    public static byte[] randomBytes(final int minLength, final int boundLength) {
        final byte[] bytes = new byte[randomInt(minLength, boundLength)];
        SECURE_RANDOM.nextBytes(bytes);
        return bytes;
    }

    /**
     * Generates a random string with the specified length and characters. If all the boolean parameters are false, lowercase will be set to true.
     *
     * @param minLength The minimum length of the string.
     * @param boundLength The upper bound length of the string.
     * @param lowercase Whether to include lowercase characters.
     * @param uppercase Whether to include uppercase characters.
     * @param number    Whether to include number characters.
     * @param special   Whether to include special characters.
     * @return A random string with a random length between minLength (inclusive) and boundLength (exclusive) and characters.
     */
    public static String randomString(final int minLength, final int boundLength, final boolean lowercase, final boolean uppercase, final boolean number, final boolean special) {
        return randomString(randomInt(minLength, boundLength), lowercase, uppercase, number, special);
    }

    /**
     * Generates a random string with the specified length and characters. If all the boolean parameters are false, lowercase will be set to true.
     *
     * @param length    The length of the string.
     * @param lowercase Whether to include lowercase characters.
     * @param uppercase Whether to include uppercase characters.
     * @param number    Whether to include number characters.
     * @param special   Whether to include special characters.
     * @return A random string with the specified length and characters.
     */
    public static String randomString(final int length, boolean lowercase, boolean uppercase, boolean number, boolean special) {
        if (length < 1) {
            return "";
        }
        if (!lowercase && !uppercase && !number && !special) {
            lowercase = true;
        }
        final StringBuilder builder = new StringBuilder();
        while (builder.length() < length) {
            final char character = (char) ThreadLocalRandom.current().nextInt(256);
            if (lowercase && character >= 'a' && character <= 'z') {
                builder.append(character);
            } else if (uppercase && character >= 'A' && character <= 'Z') {
                builder.append(character);
            } else if (number && character >= '0' && character <= '9') {
                builder.append(character);
            } else if (special) {
                builder.append(character);
            }
        }
        return builder.toString();
    }

}
