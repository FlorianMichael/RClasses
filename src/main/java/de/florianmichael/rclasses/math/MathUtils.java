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

package de.florianmichael.rclasses.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;

public class MathUtils {
    public static float interpolate(final float start, final float end, final float progress) {
        return (1 - progress) * start + progress * end;
    }

    public static double interpolate(final double start, final double end, final double progress) {
        return (1 - progress) * start + progress * end;
    }

    public static short conjugate(short value) {
        if (value == Short.MIN_VALUE) return Short.MAX_VALUE;
        if (value == Short.MAX_VALUE) return Short.MIN_VALUE;
        return (short) -value;
    }

    public static int conjugate(int value) {
        if (value == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if (value == Integer.MAX_VALUE) return Integer.MIN_VALUE;
        return -value;
    }

    public static long conjugate(long value) {
        if (value == Long.MIN_VALUE) return Long.MAX_VALUE;
        if (value == Long.MAX_VALUE) return Long.MIN_VALUE;
        return -value;
    }

    public static float conjugate(float value) {
        if (value == Float.MIN_VALUE) return Float.MAX_VALUE;
        if (value == Float.MAX_VALUE) return Float.MIN_VALUE;
        return -value;
    }

    public static double conjugate(double value) {
        if (value == Double.MIN_VALUE) return Double.MAX_VALUE;
        if (value == Double.MAX_VALUE) return Double.MIN_VALUE;
        return -value;
    }

    public static boolean isInBounds(final short x, final short y, final short left, final short up, final short right, final short down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    public static boolean isInBounds(final int x, final int y, final int left, final int up, final int right, final int down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    public static boolean isInBounds(final long x, final long y, final long left, final long up, final long right, final long down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }
    
    public static boolean isInBounds(final float x, final float y, final float left, final float up, final float right, final float down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    public static boolean isInBounds(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    public static boolean isInBoundsAbsolute(final short x, final short y, final short left, final short up, final short right, final short down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }

    public static boolean isInBoundsAbsolute(final int x, final int y, final int left, final int up, final int right, final int down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }

    public static boolean isInBoundsAbsolute(final long x, final long y, final long left, final long up, final long right, final long down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }

    public static boolean isInBoundsAbsolute(final float x, final float y, final float left, final float up, final float right, final float down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }
    
    public static boolean isInBoundsAbsolute(final double x, final double y, final double left, final double up, final double right, final double down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }

    public static short sum(final short... values) {
        short value = 0;
        for (final short i : values) value += i;
        return value;
    }

    public static int sum(final int... values) {
        int value = 0;
        for (final int i : values) value += i;
        return value;
    }

    public static long sum(final long... values) {
        long value = 0;
        for (final long i : values) value += i;
        return value;
    }

    public static float sum(final float... values) {
        float value = 0;
        for (final float f : values) value += f;
        return value;
    }

    public static double sum(final double... values) {
        double value = 0;
        for (final double d : values) value += d;
        return value;
    }

    public static short avgS(final short... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static short avgS(final int... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static short avgS(final long... data) {
        return (short) clamp(Math.round((float) sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static short avgS(final float... data) {
        return (short) clamp(Math.round(sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static short avgS(final double... data) {
        return (short) clamp(Math.round(clamp(sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static int avgI(final short... data) {
        return Math.round((float) sum(data) / data.length);
    }

    public static int avgI(final int... data) {
        return Math.round((float) sum(data) / data.length);
    }

    public static int avgI(final long... data) {
        return Math.round((float) sum(data) / data.length);
    }

    public static int avgI(final float... data) {
        return Math.round(sum(data) / data.length);
    }

    public static int avgI(final double... data) {
        return (int) Math.round(clamp(sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length);
    }

    public static float avgF(final short... data) {
        return sum(data) / (float) data.length;
    }

    public static float avgF(final int... data) {
        return sum(data) / (float) data.length;
    }

    public static float avgF(final long... data) {
        return sum(data) / (float) data.length;
    }

    public static float avgF(final float... data) {
        return sum(data) / (float) data.length;
    }

    public static float avgF(final double... data) {
        return Math.round(sum(data)) / (float) data.length;
    }

    public static double avgD(final short... data) {
        return sum(data) / (double) data.length;
    }

    public static double avgD(final int... data) {
        return sum(data) / (double) data.length;
    }

    public static double avgD(final long... data) {
        return sum(data) / (double) data.length;
    }

    public static double avgD(final float... data) {
        return sum(data) / (double) data.length;
    }

    public static double avgD(final double... data) {
        return Math.round(sum(data)) / (double) data.length;
    }

    public static short clamp(final short value, final short minimum, final short maximum) {
        return (short) Math.max(minimum, Math.min(maximum, value));
    }

    public static int clamp(final int value, final int minimum, final int maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    public static long clamp(final long value, final long minimum, final long maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    public static float clamp(final float value, final float minimum, final float maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    public static double clamp(final double value, final double minimum, final double maximum) {
        return Math.max(minimum, Math.min(maximum, value));
    }

    public static float median(final float... data) {
        return ((data.length % 2) == 0 ?
                ((data[(int) (data.length * 0.5F)] + data[(int) (data.length * 0.5F) - 1]) * 0.5F) :
                data[(int) (data.length * 0.5F)]);
    }

    public static double median(final double... data) {
        return ((data.length % 2) == 0 ?
                ((data[(int) (data.length * 0.5D)] + data[(int) (data.length * 0.5D) - 1]) * 0.5D) :
                data[(int) (data.length * 0.5D)]);
    }

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
            variance += Math.pow(average - number, 2.0D);
            varianceSquared += Math.pow(average - number, 4.0D);
        }

        return efficiencyFirst * (varianceSquared / (float) Math.pow(variance / sum, 2.0D)) - efficiencySecond;
    }

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

    public static float skewness(final float... data) {
        return skewness(ArrayList::new, data);
    }

    public static float skewness(final IntFunction<List<Float>> type, final float... data) {
        final int count = data.length;
        final List<Float> numbers = type.apply(data.length);

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

    public static double skewness(final double... data) {
        return skewness(ArrayList::new, data);
    }


    public static double skewness(final IntFunction<List<Double>> type, final double... data) {
        final int count = data.length;
        final List<Double> numbers = type.apply(data.length);

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

    public static float variance(final float... data) {
        final int count = data.length;
        final double sum = sum(data);
        final double average = sum / count;
        float variance = 0.0F;
        for (final float number : data) variance += Math.pow(number - average, 2.0D);
        return variance / count;
    }

    public static double variance(final double... data) {
        final int count = data.length;
        final double sum = sum(data);
        final double average = sum / count;
        double variance = 0.0D;
        for (final double number : data) variance += Math.pow(number - average, 2.0D);
        return variance / count;
    }

    public static float standardDeviation(final float... data) {
        return (float) Math.sqrt(variance(data));
    }

    public static double standardDeviation(final double... data) {
        return Math.sqrt(variance(data));
    }
}
