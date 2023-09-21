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

package de.florianmichael.rclasses.common.collection;

import java.util.Objects;
import java.util.function.IntFunction;

public class ArrayUtils {

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static boolean[] remove(final boolean[] array, final int index) {
        final int length = array.length - 1;
        final boolean[] objs = new boolean[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static short[] remove(final short[] array, final int index) {
        final int length = array.length - 1;
        final short[] objs = new short[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static int[] remove(final int[] array, final int index) {
        final int length = array.length - 1;
        final int[] objs = new int[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static long[] remove(final long[] array, final int index) {
        final int length = array.length - 1;
        final long[] objs = new long[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static float[] remove(final float[] array, final int index) {
        final int length = array.length - 1;
        final float[] objs = new float[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static double[] remove(final double[] array, final int index) {
        final int length = array.length - 1;
        final double[] objs = new double[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static byte[] remove(final byte[] array, final int index) {
        final int length = array.length - 1;
        final byte[] objs = new byte[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array the array
     * @param index the index of the element to remove
     * @return      A new array containing the existing elements except the element at the specified position.
     */
    public static char[] remove(final char[] array, final int index) {
        final int length = array.length - 1;
        final char[] objs = new char[length];
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Removes the element at the specified position in the specified array.
     *
     * @param array   the array
     * @param index   the index of the element to remove
     * @param factory the array constructor
     * @return        A new array containing the existing elements except the element at the specified position.
     * @param <T>     the type of the array
     */
    public static <T> T[] remove(final T[] array, final int index, final IntFunction<T[]> factory) {
        final int length = array.length - 1;
        final T[] objs = factory.apply(length);
        if (index > 0) System.arraycopy(array, 0, objs, 0, index);
        if (index < array.length - 1) System.arraycopy(array, index + 1, objs, index, array.length - index - 1);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static boolean[] add(final boolean[] array, final boolean adding) {
        final int length = array.length + 1;
        final boolean[] objs = new boolean[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static short[] add(final short[] array, final short adding) {
        final int length = array.length + 1;
        final short[] objs = new short[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static int[] add(final int[] array, final int adding) {
        final int length = array.length + 1;
        final int[] objs = new int[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static long[] add(final long[] array, final long adding) {
        final int length = array.length + 1;
        final long[] objs = new long[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static float[] add(final float[] array, final float adding) {
        final int length = array.length + 1;
        final float[] objs = new float[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static double[] add(final double[] array, final double adding) {
        final int length = array.length + 1;
        final double[] objs = new double[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static byte[] add(final byte[] array, final byte adding) {
        final int length = array.length + 1;
        final byte[] objs = new byte[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static char[] add(final char[] array, final char adding) {
        final int length = array.length + 1;
        final char[] objs = new char[length];
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static boolean[] add(final boolean[] array, int index, final boolean adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final boolean[] objs = new boolean[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static short[] add(final short[] array, int index, final short adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final short[] objs = new short[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static int[] add(final int[] array, int index, final int adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final int[] objs = new int[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static long[] add(final long[] array, int index, final long adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final long[] objs = new long[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static float[] add(final float[] array, int index, final float adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final float[] objs = new float[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static double[] add(final double[] array, int index, final double adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final double[] objs = new double[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static byte[] add(final byte[] array, int index, final byte adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final byte[] objs = new byte[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array  the array
     * @param index  the index to add the element at
     * @param adding the element to add
     * @return       A new array containing the existing elements plus the element to add.
     */
    public static char[] add(final char[] array, int index, final char adding) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final char[] objs = new char[array.length + 1];
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array   the array
     * @param adding  the element to add
     * @param factory the array constructor
     * @return        A new array containing the existing elements plus the element to add.
     * @param <T>     the type of the array
     */
    public static <T> T[] add(final T[] array, final T adding, final IntFunction<T[]> factory) {
        final int length = array.length + 1;
        final T[] objs = factory.apply(length);
        System.arraycopy(array, 0, objs, 0, array.length);
        objs[length - 1] = adding;
        return objs;
    }

    /**
     * Adds the specified element to the specified array.
     *
     * @param array   the array
     * @param index   the index to add the element at
     * @param adding  the element to add
     * @param factory the array constructor
     * @return        A new array containing the existing elements plus the element to add.
     * @param <T>     the type of the array
     */
    public static <T> T[] add(final T[] array, int index, final T adding, final IntFunction<T[]> factory) {
        index = Math.max(0, Math.min(array.length - 1, index));
        final T[] objs = factory.apply(array.length + 1);
        objs[index] = adding;
        System.arraycopy(array, 0, objs, 0, index);
        System.arraycopy(array, index, objs, index + 1, array.length - index);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static boolean[] sub(final boolean[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final boolean[] objs = new boolean[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static short[] sub(final short[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final short[] objs = new short[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static int[] sub(final int[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final int[] objs = new int[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static long[] sub(final long[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final long[] objs = new long[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static float[] sub(final float[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final float[] objs = new float[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static double[] sub(final double[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final double[] objs = new double[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static byte[] sub(final byte[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final byte[] objs = new byte[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static char[] sub(final char[] array, final int start, final int end) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final char[] objs = new char[length];
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Cuts the specified array from the start index to the end index.
     *
     * @param array the array
     * @param start the start index
     * @param end   the end index
     * @return      A new array containing the elements from the start index to the end index.
     */
    public static <T> T[] sub(final T[] array, final int start, final int end, final IntFunction<T[]> factory) {
        final int min = Math.min(start, end), max = Math.max(start, end);
        if (min == array.length || array.length <= 1) return array.clone();
        final int length = (max - min) + 1;
        final T[] objs = factory.apply(length);
        System.arraycopy(array, min, objs, 0, length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static boolean[] merge(final boolean[] array1, final boolean[] array2) {
        final boolean[] objs = new boolean[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static short[] merge(final short[] array1, final short[] array2) {
        final short[] objs = new short[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static int[] merge(final int[] array1, final int[] array2) {
        final int[] objs = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static long[] merge(final long[] array1, final long[] array2) {
        final long[] objs = new long[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static float[] merge(final float[] array1, final float[] array2) {
        final float[] objs = new float[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static double[] merge(final double[] array1, final double[] array2) {
        final double[] objs = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static byte[] merge(final byte[] array1, final byte[] array2) {
        final byte[] objs = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1 the first array
     * @param array2 the second array
     * @return       A new array containing the elements of the first array and the second array.
     */
    public static char[] merge(final char[] array1, final char[] array2) {
        final char[] objs = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merges the specified arrays into one array.
     *
     * @param array1  the first array
     * @param array2  the second array
     * @param factory the array constructor
     * @return        A new array containing the elements of the first array and the second array.
     * @param <T>     the type of the array
     */
    public static <T> T[] merge(final T[] array1, final T[] array2, final IntFunction<T[]> factory) {
        final T[] objs = factory.apply(array1.length + array2.length);
        System.arraycopy(array1, 0, objs, 0, array1.length);
        System.arraycopy(array2, 0, objs, array1.length, array2.length);
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static boolean[] merge(final boolean[][] array, final IntFunction<boolean[]> factory) {
        int length = 0;
        for (final boolean[] objects : array) length += objects.length;
        final boolean[] objs = factory.apply(length);
        int index = 0;
        for (final boolean[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static short[] merge(final short[][] array, final IntFunction<short[]> factory) {
        int length = 0;
        for (final short[] objects : array) length += objects.length;
        final short[] objs = factory.apply(length);
        int index = 0;
        for (final short[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static int[] merge(final int[][] array, final IntFunction<int[]> factory) {
        int length = 0;
        for (final int[] objects : array) length += objects.length;
        final int[] objs = factory.apply(length);
        int index = 0;
        for (final int[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static long[] merge(final long[][] array, final IntFunction<long[]> factory) {
        int length = 0;
        for (final long[] objects : array) length += objects.length;
        final long[] objs = factory.apply(length);
        int index = 0;
        for (final long[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static float[] merge(final float[][] array, final IntFunction<float[]> factory) {
        int length = 0;
        for (final float[] objects : array) length += objects.length;
        final float[] objs = factory.apply(length);
        int index = 0;
        for (final float[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static double[] merge(final double[][] array, final IntFunction<double[]> factory) {
        int length = 0;
        for (final double[] objects : array) length += objects.length;
        final double[] objs = factory.apply(length);
        int index = 0;
        for (final double[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static byte[] merge(final byte[][] array, final IntFunction<byte[]> factory) {
        int length = 0;
        for (final byte[] objects : array) length += objects.length;
        final byte[] objs = factory.apply(length);
        int index = 0;
        for (final byte[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merged the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     */
    public static char[] merge(final char[][] array, final IntFunction<char[]> factory) {
        int length = 0;
        for (final char[] objects : array) length += objects.length;
        final char[] objs = factory.apply(length);
        int index = 0;
        for (final char[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Merges the specified two-dimensional arrays into one array.
     *
     * @param array   the two-dimensional array
     * @param factory the array constructor
     * @return        A new array containing the elements of the two-dimensional array.
     * @param <T>     the type of the array
     */
    public static <T> T[] merge(final T[][] array, final IntFunction<T[]> factory) {
        int length = 0;
        for (final T[] objects : array) length += objects.length;
        final T[] objs = factory.apply(length);
        int index = 0;
        for (final T[] objects : array) {
            System.arraycopy(objects, 0, objs, index, objects.length);
            index += objects.length;
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static boolean[] reverse(final boolean[] array) {
        if (array.length <= 1) return array;
        final boolean[] objs = new boolean[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static short[] reverse(final short[] array) {
        if (array.length <= 1) return array;
        final short[] objs = new short[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static int[] reverse(final int[] array) {
        if (array.length <= 1) return array;
        final int[] objs = new int[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static long[] reverse(final long[] array) {
        if (array.length <= 1) return array;
        final long[] objs = new long[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static float[] reverse(final float[] array) {
        if (array.length <= 1) return array;
        final float[] objs = new float[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static double[] reverse(final double[] array) {
        if (array.length <= 1) return array;
        final double[] objs = new double[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static byte[] reverse(final byte[] array) {
        if (array.length <= 1) return array;
        final byte[] objs = new byte[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array the array
     * @return      the reversed array
     */
    public static char[] reverse(final char[] array) {
        if (array.length <= 1) return array;
        final char[] objs = new char[array.length];
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Reverses all indices of the specified array.
     *
     * @param array   the array
     * @param factory the array factory
     * @return        the reversed array
     * @param <T>     the array type
     */
    public static <T> T[] reverse(final T[] array, final IntFunction<T[]> factory) {
        if (array.length <= 1) return array;
        final T[] objs = factory.apply(array.length);
        int index = 0;
        for (int i = Math.max(objs.length - 1, 0); i >= 0; i--) {
            objs[index++] = array[i];
        }
        return objs;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final boolean[] array, final boolean find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final boolean[] array, final boolean find, int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final short[] array, final short find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final short[] array, final short find, int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final int[] array, final int find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final int[] array, final int find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final long[] array, final long find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final long[] array, final long find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final float[] array, final float find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final float[] array, final float find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final double[] array, final double find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final double[] array, final double find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final byte[] array, final byte find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final byte[] array, final byte find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final char[] array, final char find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     */
    public static int indexOf(final char[] array, final char find, final int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      the index of the specified object in the array, or -1 if not found
     * @param <T>   the type of the array
     */
    public static <T> int indexOf(final T[] array, final T find) {
        return indexOf(array, find, 0);
    }

    /**
     * Returns the index of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           the index of the specified object in the array, or -1 if not found
     * @param <T>        the type of the array
     */
    public static <T> int indexOf(final T[] array, final T find, int startIndex) {
        if (array.length == 0) return -1;
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            return i;
        }
        return -1;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final boolean[] array, final boolean find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final boolean[] array, final boolean find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final short[] array, final short find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final short[] array, final short find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final int[] array, final int find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final int[] array, final int find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final long[] array, final long find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final long[] array, final long find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final float[] array, final float find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final float[] array, final float find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final double[] array, final double find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final double[] array, final double find, final int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final byte[] array, final byte find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final byte[] array, final byte find, int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     */
    public static int[] indicesOf(final char[] array, final char find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     */
    public static int[] indicesOf(final char[] array, final char find, int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array the array
     * @param find  the object to find
     * @return      all indices of the specified object in the array
     * @param <T>   the type of the array
     */
    public static <T> int[] indicesOf(final T[] array, final T find) {
        return indicesOf(array, find, 0);
    }

    /**
     * Returns all indices of the specified object in the array.
     *
     * @param array      the array
     * @param find       the object to find
     * @param startIndex the start index
     * @return           all indices of the specified object in the array
     * @param <T>        the type of the array
     */
    public static <T> int[] indicesOf(final T[] array, final T find, int startIndex) {
        if (array.length == 0) return new int[0];
        int[] indices = new int[0];
        for (int i = startIndex; i < array.length; i++) {
            if (!Objects.equals(find, array[i])) continue;
            indices = add(indices, i);
        }
        return indices;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final boolean[] array, final boolean value) {
        for (final boolean obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final short[] array, final short value) {
        for (final short obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final int[] array, final int value) {
        for (final int obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final long[] array, final long value) {
        for (final long obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final float[] array, final float value) {
        for (final float obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final double[] array, final double value) {
        for (final double obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final byte[] array, final byte value) {
        for (final byte obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     */
    public static boolean contains(final char[] array, final char value) {
        for (final char obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }

    /**
     * Returns whenever the array contains the specified object.
     *
     * @param array the array
     * @param value the object to find
     * @return      whenever the array contains the specified object
     * @param <T>   the type of the array
     */
    public static <T> boolean contains(final T[] array, final T value) {
        for (final T obj : array) {
            if (!Objects.equals(obj, value)) continue;
            return true;
        }
        return false;
    }
}
