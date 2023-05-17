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

public class MathUtils {

    public static double interpolate(final double start, final double end, final double progress) {
        return start + (end - start) * progress;
    }

    public static int conjugate(int value) {
        if (value == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if (value == Integer.MAX_VALUE) return Integer.MIN_VALUE;

        return -value;
    }

    public static boolean isInBounds(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    public static boolean isInBoundsAbsolute(final double x, final double y, final double left, final double up, final double right, final double down) {
        return isInBounds(x, y, left, right, up - left, down - right);
    }

    public static float variance(final float[] data) {
        float average = average(data);
        float temp = 0.0F;
        for (double datum : data) temp += (datum - average) * (datum - average);

        return temp / data.length;
    }

    public static double variance(final double[] data) {
        double average = average(data);
        double temp = 0.0;
        for (double datum : data) temp += (datum - average) * (datum - average);

        return temp / data.length;
    }

    public static int variance(final int[] data) {
        int average = average(data);
        int temp = 0;
        for (int datum : data) temp += (datum - average) * (datum - average);

        return temp / data.length;
    }

    public static float average(final float[] data) {
        float sum = 0.0F;
        for (float datum : data) sum += datum;

        return sum / data.length;
    }

    public static double average(final double[] data) {
        double sum = 0.0;
        for (double datum : data) sum += datum;

        return sum / data.length;
    }

    public static int average(final int[] data) {
        int sum = 0;
        for (int datum : data) sum += datum;

        return sum / data.length;
    }
}
