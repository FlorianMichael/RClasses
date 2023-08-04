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

import java.util.Objects;
import java.util.function.IntFunction;

public final class ArrayUtils {

    public static boolean[] remove(final boolean[] array, final int index) {
        final int length = array.length - 1;
        final boolean[] objs = new boolean[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static short[] remove(final short[] array, final int index) {
        final int length = array.length - 1;
        final short[] objs = new short[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static int[] remove(final int[] array, final int index) {
        final int length = array.length - 1;
        final int[] objs = new int[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static long[] remove(final long[] array, final int index) {
        final int length = array.length - 1;
        final long[] objs = new long[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static float[] remove(final float[] array, final int index) {
        final int length = array.length - 1;
        final float[] objs = new float[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static double[] remove(final double[] array, final int index) {
        final int length = array.length - 1;
        final double[] objs = new double[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static byte[] remove(final byte[] array, final int index) {
        final int length = array.length - 1;
        final byte[] objs = new byte[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static char[] remove(final char[] array, final int index) {
        final int length = array.length - 1;
        final char[] objs = new char[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static <T> T[] remove(final T[] array, final int index, final IntFunction<T[]> factory) {
        final int length = array.length - 1;
        final T[] objs = factory.apply(length);
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    public static boolean[] add(final boolean[] array, final boolean adding) {
        final int length = array.length + 1;
        final boolean[] objs = new boolean[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static short[] add(final short[] array, final short adding) {
        final int length = array.length + 1;
        final short[] objs = new short[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static int[] add(final int[] array, final int adding) {
        final int length = array.length + 1;
        final int[] objs = new int[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static long[] add(final long[] array, final long adding) {
        final int length = array.length + 1;
        final long[] objs = new long[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static float[] add(final float[] array, final float adding) {
        final int length = array.length + 1;
        final float[] objs = new float[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static double[] add(final double[] array, final double adding) {
        final int length = array.length + 1;
        final double[] objs = new double[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static byte[] add(final byte[] array, final byte adding) {
        final int length = array.length + 1;
        final byte[] objs = new byte[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static char[] add(final char[] array, final char adding) {
        final int length = array.length + 1;
        final char[] objs = new char[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static boolean[] add(final boolean[] array, int index, final boolean adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final boolean[] objs = new boolean[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static short[] add(final short[] array, int index, final short adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final short[] objs = new short[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static int[] add(final int[] array, int index, final int adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final int[] objs = new int[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static long[] add(final long[] array, int index, final long adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final long[] objs = new long[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static float[] add(final float[] array, int index, final float adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final float[] objs = new float[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static double[] add(final double[] array, int index, final double adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final double[] objs = new double[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static byte[] add(final byte[] array, int index, final byte adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final byte[] objs = new byte[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static char[] add(final char[] array, int index, final char adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final char[] objs = new char[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static <T> T[] add(final T[] array, final T adding, final IntFunction<T[]> factory) {
        final int length = array.length + 1;
        final T[] objs = factory.apply(length);
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    public static <T> T[] add(final T[] array, int index, final T adding, final IntFunction<T[]> factory) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final T[] objs = factory.apply(array.length + 1);
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    public static boolean[] sub(final boolean[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final boolean[] objs = new boolean[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static short[] sub(final short[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final short[] objs = new short[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static int[] sub(final int[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final int[] objs = new int[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static long[] sub(final long[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final long[] objs = new long[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static float[] sub(final float[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final float[] objs = new float[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static double[] sub(final double[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final double[] objs = new double[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static byte[] sub(final byte[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final byte[] objs = new byte[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static char[] sub(final char[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final char[] objs = new char[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static <T> T[] sub(final T[] array, final int start, final int end, final IntFunction<T[]> factory) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final T[] objs = factory.apply(length);
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    public static boolean[] merge(final boolean[] array1, final boolean[] array2) {
        final boolean[] objs = new boolean[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static short[] merge(final short[] array1, final short[] array2) {
        final short[] objs = new short[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static int[] merge(final int[] array1, final int[] array2) {
        final int[] objs = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static long[] merge(final long[] array1, final long[] array2) {
        final long[] objs = new long[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static float[] merge(final float[] array1, final float[] array2) {
        final float[] objs = new float[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static double[] merge(final double[] array1, final double[] array2) {
        final double[] objs = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static byte[] merge(final byte[] array1, final byte[] array2) {
        final byte[] objs = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static char[] merge(final char[] array1, final char[] array2) {
        final char[] objs = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static <T> T[] merge(final T[] array1, final T[] array2, final IntFunction<T[]> factory) {
        final T[] objs = factory.apply(array1.length + array2.length);
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    public static int indexOf(final boolean[] array, final boolean find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final boolean[] array, final boolean find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final short[] array, final short find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final short[] array, final short find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final int[] array, final int find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final int[] array, final int find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final long[] array, final long find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final long[] array, final long find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final float[] array, final float find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final float[] array, final float find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final double[] array, final double find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final double[] array, final double find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final byte[] array, final byte find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final byte[] array, final byte find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static int indexOf(final char[] array, final char find) {
        return indexOf(array, find, 0);
    }

    public static int indexOf(final char[] array, final char find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static <T> int indexOf(final T[] array, final  T find) {
        return indexOf(array, find, 0);
    }

    public static <T> int indexOf(final T[] array, final  T find, int startIndex) {
        if (array.length == 0) return -1;
        if (startIndex < 0) startIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    public static boolean contains(final boolean[] array, final boolean value) {
        for (final boolean obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final short[] array, final short value) {
        for (final short obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final int[] array, final int value) {
        for (final int obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final long[] array, final long value) {
        for (final long obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final float[] array, final float value) {
        for (final float obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final double[] array, final double value) {
        for (final double obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final byte[] array, final byte value) {
        for (final byte obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static boolean contains(final char[] array, final char value) {
        for (final char obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    public static <T> boolean contains(final T[] array, final T value) {
        for (final T obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }
}
