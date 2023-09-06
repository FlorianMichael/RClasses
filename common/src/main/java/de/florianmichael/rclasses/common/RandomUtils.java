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

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class contains some useful methods for generating random numbers.
 */
public class RandomUtils {
    public final static Random RANDOM = new Random();
    public final static SecureRandom SECURE_RANDOM = new SecureRandom();
    public final static ThreadLocalRandom MAIN_THREAD_RANDOM = ThreadLocalRandom.current();

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random integer between min and max.
     */
    public static int randomInt(final int min, final int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random double between min and max.
     */
    public static double randomDouble(final double min, final double max) {
        return Math.random() * (max - min + 1) + min;
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random float between min and max.
     */
    public static float randomFloat(final float min, final float max) {
        return (float) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random long between min and max.
     */
    public static long randomLong(final long min, final long max) {
        return (long) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random short between min and max.
     */
    public static short randomShort(final short min, final short max) {
        return (short) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random byte between min and max.
     */
    public static byte randomByte(final byte min, final byte max) {
        return (byte) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random char between min and max.
     */
    public static char randomChar(final char min, final char max) {
        return (char) (Math.random() * (max - min + 1) + min);
    }

    /**
     * @param min The minimum value.
     * @param max The maximum value.
     *
     * @return A random boolean between min and max.
     */
    public static boolean randomBoolean(final boolean min, final boolean max) {
        return Math.random() < 0.5;
    }
}
