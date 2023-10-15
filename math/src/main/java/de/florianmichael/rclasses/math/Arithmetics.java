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

package de.florianmichael.rclasses.math;

/**
 * Implementation of a math utility.
 */
public class Arithmetics {

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
}
