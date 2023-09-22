/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.math;

import de.florianmichael.rclasses.math.trigonometry.TrigonometryFunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Implementation of a math utility.
 */
public class MathUtils {
    public final static float TAU = (float) Math.PI * 2;

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
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final short x, final short y, final short left, final short up, final short right, final short down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final int x, final int y, final int left, final int up, final int right, final int down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final long x, final long y, final long left, final long up, final long right, final long down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final float x, final float y, final float left, final float up, final float right, final float down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final short x, final short y, final short left, final short up, final short right, final short down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final int x, final int y, final int left, final int up, final int right, final int down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final long x, final long y, final long left, final long up, final long right, final long down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final float x, final float y, final float left, final float up, final float right, final float down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= right && y >= up && y <= down;
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
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final short... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final int... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final long... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final float... data) {
        return (short) clamp(Math.round(sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final double... data) {
        return (short) clamp(Math.round(clamp(sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final short... data) {
        return Math.round((float) sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final int... data) {
        return Math.round((float) sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final long... data) {
        return Math.round((float) sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final float... data) {
        return Math.round(sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final double... data) {
        return (int) Math.round(clamp(sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final short... data) {
        return sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final int... data) {
        return sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final long... data) {
        return sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final float... data) {
        return sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final double... data) {
        return Math.round(sum(data)) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final short... data) {
        return sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final int... data) {
        return sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final long... data) {
        return sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final float... data) {
        return sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final double... data) {
        return Math.round(sum(data)) / (double) data.length;
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
     * @param data The data to calculate the median from.
     * @return The median of the given data.
     */
    public static float median(final float... data) {
        return ((data.length % 2) == 0 ?
                ((data[(int) (data.length * 0.5F)] + data[(int) (data.length * 0.5F) - 1]) * 0.5F) :
                data[(int) (data.length * 0.5F)]);
    }

    /**
     * @param data The data to calculate the median from.
     * @return The median of the given data.
     */
    public static double median(final double... data) {
        return ((data.length % 2) == 0 ?
                ((data[(int) (data.length * 0.5D)] + data[(int) (data.length * 0.5D) - 1]) * 0.5D) :
                data[(int) (data.length * 0.5D)]);
    }

    /**
     * @param data The data to calculate the kurtosis from.
     * @return The kurtosis of the given data.
     */
    public static float kurtosis(final float... data) {
        final int count = data.length;
        if (count < 3.0F) return 0.0F;
        final float sum = sum(data);

        final float efficiencyFirst = count * (count + 1.0F) / ((count - 1.0F) * (count - 2.0F) * (count - 3.0F));
        final float efficiencySecond = 3.0F * (float) Math.pow(count - 1.0F, 2.0F) / ((count - 2.0F) * (count - 3.0F));
        final float average = sum / count;

        float variance = 0.0F;
        float varianceSquared = 0.0F;

        for (final float number : data) {
            variance += (float) Math.pow(average - number, 2.0D);
            varianceSquared += (float) Math.pow(average - number, 4.0D);
        }

        return efficiencyFirst * (varianceSquared / (float) Math.pow(variance / sum, 2.0D)) - efficiencySecond;
    }

    /**
     * @param data The data to calculate the kurtosis from.
     * @return The kurtosis of the given data.
     */
    public static double kurtosis(final double... data) {
        final int count = data.length;
        if (count < 3.0D) return 0.0D;
        final double sum = sum(data);

        final double efficiencyFirst = count * (count + 1.0D) / ((count - 1.0D) * (count - 2.0D) * (count - 3.0D));
        final double efficiencySecond = 3.0 * Math.pow(count - 1.0D, 2.0D) / ((count - 2.0D) * (count - 3.0D));
        final double average = sum / count;

        double variance = 0.0D;
        double varianceSquared = 0.0D;

        for (final double number : data) {
            variance += Math.pow(average - number, 2.0D);
            varianceSquared += Math.pow(average - number, 4.0D);
        }

        return efficiencyFirst * (varianceSquared / Math.pow(variance / sum, 2.0D)) - efficiencySecond;
    }

    /**
     * @param data The data to calculate the skewness from.
     * @return The skewness of the given data.
     */
    public static float skewness(final float... data) {
        final int count = data.length;
        final List<Float> numbers = new ArrayList<>(data.length);

        float sum = 0.0F;

        for (final float number : data) {
            sum += number;
            numbers.add(number);
        }

        Collections.sort(numbers);

        final float mean = sum / count;
        final float median = (count % 2 != 0) ?
                numbers.get(count / 2) :
                (numbers.get((count - 1) / 2)
                        + numbers.get(count / 2)) / 2;
        final float variance = variance(data);

        return 3 * (mean - median) / variance;
    }

    /**
     * @param data The data to calculate the skewness from.
     * @return The skewness of the given data.
     */
    public static double skewness(final double... data) {
        final int count = data.length;
        final List<Double> numbers = new ArrayList<>(data.length);

        double sum = 0.0;

        for (final double number : data) {
            sum += number;
            numbers.add(number);
        }

        Collections.sort(numbers);

        final double mean = sum / count;
        final double median = (count % 2 != 0) ?
                numbers.get(count / 2) :
                (numbers.get((count - 1) / 2)
                        + numbers.get(count / 2)) / 2;
        final double variance = variance(data);

        return 3 * (mean - median) / variance;
    }

    /**
     * @param data The data to calculate the variance from.
     * @return The variance of the given data.
     */
    public static float variance(final float... data) {
        final int count = data.length;
        final double sum = sum(data);
        final double average = sum / count;
        float variance = 0.0F;
        for (final float number : data) variance += (float) Math.pow(number - average, 2.0D);
        return variance / count;
    }

    /**
     * @param data The data to calculate the variance from.
     * @return The variance of the given data.
     */
    public static double variance(final double... data) {
        final int count = data.length;
        final double sum = sum(data);
        final double average = sum / count;
        double variance = 0.0D;
        for (final double number : data) variance += Math.pow(number - average, 2.0D);
        return variance / count;
    }

    /**
     * @param data The data to calculate the variance from.
     * @return The variance of the given data.
     */
    public static double variance(final long... data) {
        final int count = data.length;
        final double sum = sum(data);
        final double average = sum / count;
        double variance = 0.0D;
        for (final double number : data) variance += Math.pow(number - average, 2.0D);
        return variance / count;
    }

    /**
     * @param data The data to calculate the standard deviation from.
     * @return The standard deviation of the given data.
     */
    public static float standardDeviation(final float... data) {
        return (float) Math.sqrt(variance(data));
    }

    /**
     * @param data The data to calculate the standard deviation from.
     * @return The standard deviation of the given data.
     */
    public static double standardDeviation(final double... data) {
        return Math.sqrt(variance(data));
    }

    /**
     * @param data The data to calculate the standard deviation from.
     * @return The standard deviation of the given data.
     */
    public static double standardDeviation(final long... data) {
        return Math.sqrt(variance(data));
    }

    /**
     * @param x The number to round.
     * @return The rounded number. If the number is negative, it will be rounded down. If the number is positive, it will be rounded up.
     */
    public static double roundAwayFromZero(final double x) {
        return x < 0 ? Math.floor(x) : x > 0 ? Math.ceil(x) : x;
    }

    /**
     * @param random The random object to use.
     * @param min    The minimum value.
     * @param max    The maximum value.
     * @param mean   The mean value.
     * @param sigma  The sigma value.
     * @return A random number between the minimum and maximum value, with the given mean and sigma.
     */
    public static float boxMuellerDistribution(final Random random, final float min, final float max, final float mean, final float sigma) {
        float u1, u2;
        float z0;

        do {
            u1 = random.nextFloat();
            u2 = random.nextFloat();
            z0 = (float) Math.sqrt(-2.0F * (float) Math.log(u1)) * TrigonometryFunctions.MINECRAFT.cos(TAU * u2);
        } while ((int) (z0 * sigma + mean) < min || (int) (z0 * sigma + mean) > max);

        return mean + sigma * z0;
    }

    /**
     * @param random The random object to use.
     * @param min    The minimum value.
     * @param max    The maximum value.
     * @param mean   The mean value.
     * @param sigma  The sigma value.
     * @return A random number between the minimum and maximum value, with the given mean and sigma.
     */
    public static double boxMuellerDistribution(final Random random, final double min, final double max, final double mean, final double sigma) {
        double u1, u2;
        double z0;

        do {
            u1 = random.nextFloat();
            u2 = random.nextFloat();
            z0 = Math.sqrt(-2.0F * (float) Math.log(u1)) * TrigonometryFunctions.MINECRAFT.cos((float) (TAU * u2));
        } while ((int) (z0 * sigma + mean) < min || (int) (z0 * sigma + mean) > max);

        return mean + sigma * z0;
    }
}
