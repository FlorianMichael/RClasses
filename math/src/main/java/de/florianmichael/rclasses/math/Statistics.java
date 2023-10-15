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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics {

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final short... data) {
        return (short) Arithmetics.clamp(Math.round((float) Arithmetics.sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final int... data) {
        return (short) Arithmetics.clamp(Math.round((float) Arithmetics.sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final long... data) {
        return (short) Arithmetics.clamp(Math.round((float) Arithmetics.sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final float... data) {
        return (short) Arithmetics.clamp(Math.round(Arithmetics.sum(data) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as short.
     */
    public static short averageShort(final double... data) {
        return (short) Arithmetics.clamp(Math.round(Arithmetics.clamp(Arithmetics.sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length), Short.MIN_VALUE, Short.MAX_VALUE);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final short... data) {
        return Math.round((float) Arithmetics.sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final int... data) {
        return Math.round((float) Arithmetics.sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final long... data) {
        return Math.round((float) Arithmetics.sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final float... data) {
        return Math.round(Arithmetics.sum(data) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as int.
     */
    public static int averageInt(final double... data) {
        return (int) Math.round(Arithmetics.clamp(Arithmetics.sum(data), Integer.MIN_VALUE, Integer.MAX_VALUE) / data.length);
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final short... data) {
        return Arithmetics.sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final int... data) {
        return Arithmetics.sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final long... data) {
        return Arithmetics.sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final float... data) {
        return Arithmetics.sum(data) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as float.
     */
    public static float averageFloat(final double... data) {
        return Math.round(Arithmetics.sum(data)) / (float) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final short... data) {
        return Arithmetics.sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final int... data) {
        return Arithmetics.sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final long... data) {
        return Arithmetics.sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final float... data) {
        return Arithmetics.sum(data) / (double) data.length;
    }

    /**
     * @param data The data to average.
     * @return The average of the given data as double.
     */
    public static double averageDouble(final double... data) {
        return Math.round(Arithmetics.sum(data)) / (double) data.length;
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
        final float sum = Arithmetics.sum(data);

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
        final double sum = Arithmetics.sum(data);

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
        final double sum = Arithmetics.sum(data);
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
        final double sum = Arithmetics.sum(data);
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
        final double sum = Arithmetics.sum(data);
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
}
