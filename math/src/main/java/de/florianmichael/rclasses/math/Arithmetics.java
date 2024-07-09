/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.math;

/**
 * Implementation of basic arithmetics and math functions.
 */
public class Arithmetics {

    /**
     * The value of PI as a float. Equivalent to {@link Math#PI}.
     */
    public static final float PI = 3.14159265358979323846F;

    /**
     * Interpolates between two values with the given progress.
     *
     * @param start    The start value.
     * @param end      The end value.
     * @param progress The progress.
     * @return The interpolated value.
     */
    public static float interpolate(final float start, final float end, final float progress) {
        return (1 - progress) * start + progress * end;
    }

    /**
     * Interpolates between two values with the given progress.
     *
     * @param start    The start value.
     * @param end      The end value.
     * @param progress The progress.
     * @return The interpolated value.
     */
    public static double interpolate(final double start, final double end, final double progress) {
        return (1 - progress) * start + progress * end;
    }

    /**
     * @param value The value to be conjugated.
     * @return the reciprocal value of the given value.
     */
    public static short conjugate(short value) {
        if (value == Short.MIN_VALUE) return Short.MAX_VALUE;
        if (value == Short.MAX_VALUE) return Short.MIN_VALUE;
        return (short) -value;
    }

    /**
     * @param value The value to be conjugated.
     * @return the reciprocal value of the given value.
     */
    public static int conjugate(int value) {
        if (value == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if (value == Integer.MAX_VALUE) return Integer.MIN_VALUE;
        return -value;
    }

    /**
     * @param value The value to be conjugated.
     * @return the reciprocal value of the given value.
     */
    public static long conjugate(long value) {
        if (value == Long.MIN_VALUE) return Long.MAX_VALUE;
        if (value == Long.MAX_VALUE) return Long.MIN_VALUE;
        return -value;
    }

    /**
     * @param value The value to be conjugated.
     * @return the reciprocal value of the given value.
     */
    public static float conjugate(float value) {
        if (value == Float.MIN_VALUE) return Float.MAX_VALUE;
        if (value == Float.MAX_VALUE) return Float.MIN_VALUE;
        return -value;
    }

    /**
     * @param value The value to be conjugated.
     * @return the reciprocal value of the given value.
     */
    public static double conjugate(double value) {
        if (value == Double.MIN_VALUE) return Double.MAX_VALUE;
        if (value == Double.MAX_VALUE) return Double.MIN_VALUE;
        return -value;
    }

    /**
     * Equivalent to {@link Math#toRadians(double)} for floats.
     *
     * @param angleDegrees The angle in degrees.
     * @return The angle in radians.
     */
    public static float toRadians(final float angleDegrees) {
        return angleDegrees / 180F * PI;
    }

    /**
     * Equivalent to {@link Math#toDegrees(double)} for floats.
     *
     * @param angleRadians The angle in radians.
     * @return The angle in degrees.
     */
    public static float toDegrees(final float angleRadians) {
        return angleRadians * 180F / PI;
    }

    /**
     * @param values The values to sum.
     * @return The sum of the given values.
     */
    public static short sum(final short... values) {
        short value = 0;
        for (final short i : values) value += i;
        return value;
    }

    /**
     * @param values The values to sum.
     * @return The sum of the given values.
     */
    public static int sum(final int... values) {
        int value = 0;
        for (final int i : values) value += i;
        return value;
    }

    /**
     * @param values The values to sum.
     * @return The sum of the given values.
     */
    public static long sum(final long... values) {
        long value = 0;
        for (final long i : values) value += i;
        return value;
    }

    /**
     * @param values The values to sum.
     * @return The sum of the given values.
     */
    public static float sum(final float... values) {
        float value = 0;
        for (final float f : values) value += f;
        return value;
    }

    /**
     * @param values The values to sum.
     * @return The sum of the given values.
     */
    public static double sum(final double... values) {
        double value = 0;
        for (final double d : values) value += d;
        return value;
    }

    /**
     * @param value   The value to clamp.
     * @param minimum The minimum value.
     * @param maximum The maximum value.
     * @return The clamped value. If the value is smaller than the minimum, the minimum is returned. If the value is greater than the maximum, the maximum is returned. Otherwise, the value is returned.
     */
    public static short clamp(final short value, final short minimum, final short maximum) {
        return (short) Math.max(minimum, Math.min(maximum, value));
    }

    /**
     * @param value   The value to clamp.
     * @param minimum The minimum value.
     * @param maximum The maximum value.
     * @return The clamped value. If the value is smaller than the minimum, the minimum is returned. If the value is greater than the maximum, the maximum is returned. Otherwise, the value is returned.
     */
    public static int clamp(final int value, final int minimum, final int maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    /**
     * @param value   The value to clamp.
     * @param minimum The minimum value.
     * @param maximum The maximum value.
     * @return The clamped value. If the value is smaller than the minimum, the minimum is returned. If the value is greater than the maximum, the maximum is returned. Otherwise, the value is returned.
     */
    public static long clamp(final long value, final long minimum, final long maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    /**
     * @param value   The value to clamp.
     * @param minimum The minimum value.
     * @param maximum The maximum value.
     * @return The clamped value. If the value is smaller than the minimum, the minimum is returned. If the value is greater than the maximum, the maximum is returned. Otherwise, the value is returned.
     */
    public static float clamp(final float value, final float minimum, final float maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    /**
     * @param value   The value to clamp.
     * @param minimum The minimum value.
     * @param maximum The maximum value.
     * @return The clamped value. If the value is smaller than the minimum, the minimum is returned. If the value is greater than the maximum, the maximum is returned. Otherwise, the value is returned.
     */
    public static double clamp(final double value, final double minimum, final double maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    /**
     * @param x The number to round.
     * @return The rounded number. If the number is negative, it will be rounded down. If the number is positive, it will be rounded up.
     */
    public static double roundAwayFromZero(final double x) {
        return x < 0 ? Math.floor(x) : x > 0 ? Math.ceil(x) : x;
    }

    /**
     * @param value  The value to round.
     * @param places The number of places to round to.
     * @return The given value rounded to the given number of places.
     */
    public static double roundAvoid(final double value, final int places) {
        final double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**
     * @param value  The value to round.
     * @param places The number of places to round to.
     * @return The given value rounded to the given number of places.
     */
    public static float roundAvoid(final float value, final int places) {
        final float scale = (float) Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    /**
     * @param value The value to check.
     * @return Whether the given value is a decimal.
     */
    public static boolean isDecimal(final float value) {
        return value % 1 != 0;
    }

    /**
     * @param value The value to check.
     * @return Whether the given value is a decimal.
     */
    public static boolean isDecimal(final double value) {
        return value % 1 != 0;
    }

    /**
     * @param u The first value
     * @param v The second value
     * @return The greatest common divisor of u and v
     */
    public static long gcd(long u, long v) {
        // Java re-write of the Binary GCD algorithm rust implementation on https://en.wikipedia.org/wiki/Binary_GCD_algorithm
        if (u < 0 || v < 0) {
            throw new UnsupportedOperationException("Both values must be positive");
        }

        // A rule is that if u == 0 then v is the greatest common divisor and vice versa
        if (u == 0) {
            return v;
        } else if (v == 0) {
            return u;
        }

        // gcd(pow(2, uTrailingZeroes) u, pow(v, vTrailingZeroes v) = pow(2, zeroes)  gcd(u, v) with u, v odd and k = min(i, j)
        // pow(2. zeroes) is the greatest power of two that divides both pow(2, uTrailingZeroes) u and pow(2, vTrailingZeroes) v
        final int uTrailingZeroes = Long.numberOfTrailingZeros(u);
        u >>= uTrailingZeroes;
        final int vTrailingZeroes = Long.numberOfTrailingZeros(v);
        v >>= vTrailingZeroes;
        final long zeroes = Math.min(uTrailingZeroes, vTrailingZeroes);

        while (true) {
            // Check that both variables aren't even
            if (u % 2 == 0 || v % 2 == 0)
                throw new IllegalStateException("'u' and 'v' should not be even at this point");

            // Swap if necessary so u <= v
            if (u > v) {
                u = u + v;
                v = u - v;
                u = u - v;
            }

            // gcd(u, v) = gcd(u, v-u) as u <= v and u, v are both odd
            v -= u;

            // v is now even
            if (v == 0) {
                // Shift is necessary to add back the factor that was removed before the loop
                return u << zeroes;
            }

            // gcd(u, pow(2, zeroes) v) = gcd(u, v) as u is odd
            v >>= Long.numberOfTrailingZeros(v);
        }
    }

}
