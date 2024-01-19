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

package de.florianmichael.rclasses.common.array;

import java.util.Arrays;

/**
 * This files wraps an object array and provides methods to check the length and the index.
 */
public class ObjectArrayWrapper<T> {
    private final T[] input;

    /**
     * Creates a new instance of this class.
     *
     * @param input The array to wrap.
     */
    public ObjectArrayWrapper(final T[] input) {
        this.input = input;
    }

    /**
     * @return The length of the wrapped array.
     */
    public int length() {
        return input.length;
    }

    /**
     * @param length The length to check.
     * @return True if the length of the wrapped array is equal to the given length.
     */
    public boolean isLength(final int length) {
        return input.length == length;
    }

    /**
     * @param length The length to check.
     * @return True if the length of the wrapped array is smaller than the given length.
     */
    public boolean isSmaller(final int length) {
        return input.length < length;
    }

    /**
     * @param length The length to check.
     * @return True if the length of the wrapped array is smaller or equal to the given length.
     */
    public boolean isSmallerOrEqual(final int length) {
        return input.length <= length;
    }

    /**
     * @param length The length to check.
     * @return True if the length of the wrapped array is greater than the given length.
     */
    public boolean isGreater(final int length) {
        return input.length > length;
    }

    /**
     * @param length The length to check.
     * @return True if the length of the wrapped array is greater or equal to the given length.
     */
    public boolean isGreaterOrEqual(final int length) {
        return input.length >= length;
    }

    /**
     * @return True if the length of the wrapped array is 0.
     */
    public boolean isEmpty() {
        return input.length == 0;
    }

    /**
     * @param index The index to check.
     * @return True if the index is valid, false otherwise.
     */
    public boolean isIndexValid(final int index) {
        return index >= 0 && index < input.length;
    }

    /**
     * @param index The index to check.
     * @return True if the index is invalid, false otherwise.
     */
    public boolean isIndexInvalid(final int index) {
        return index < 0 || index >= input.length;
    }

    public T[] getSlice(final int start, final int end) {
        return Arrays.copyOfRange(this.input, start, end);
    }

    /**
     * @param index The index to get.
     * @return The object at the given index or null if the index is invalid.
     */
    public T get(final int index) {
        if (isIndexInvalid(index)) {
            return null;
        }
        return input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a String, false otherwise.
     */
    public boolean isString(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof String;
    }

    /**
     * @param index The index to get.
     * @return The string at the given index or null if the index is invalid.
     */
    public String getString(final int index) {
        if (isIndexInvalid(index)) {
            return null;
        }
        return (String) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Boolean, false otherwise.
     */
    public boolean isBoolean(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Boolean;
    }

    /**
     * @param index The index to get.
     * @return The boolean at the given index or false if the index is invalid.
     */
    public boolean getBoolean(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return (Boolean) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Byte, false otherwise.
     */
    public boolean isByte(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Byte;
    }

    /**
     * @param index The index to get.
     * @return The byte at the given index or 0 if the index is invalid.
     */
    public byte getByte(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Byte) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Short, false otherwise.
     */
    public boolean isShort(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Short;
    }

    /**
     * @param index The index to get.
     * @return The short at the given index or 0 if the index is invalid.
     */
    public short getShort(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Short) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and an Integer, false otherwise.
     */
    public boolean isInteger(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Integer;
    }

    /**
     * @param index The index to get.
     * @return The integer at the given index or 0 if the index is invalid.
     */
    public int getInteger(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Integer) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Long, false otherwise.
     */
    public boolean isLong(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Long;
    }

    /**
     * @param index The index to get.
     * @return The long at the given index or 0 if the index is invalid.
     */
    public long getLong(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Long) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Float, false otherwise.
     */
    public boolean isFloat(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Float;
    }

    /**
     * @param index The index to get.
     * @return The float at the given index or 0 if the index is invalid.
     */
    public float getFloat(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Float) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Double, false otherwise.
     */
    public boolean isDouble(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Double;
    }

    /**
     * @param index The index to get.
     * @return The double at the given index or 0 if the index is invalid.
     */
    public double getDouble(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Double) input[index];
    }

    /**
     * @param index The index to check.
     * @return True if the object at the given index is not null and a Character, false otherwise.
     */
    public boolean isCharacter(final int index) {
        if (isIndexInvalid(index)) {
            return false;
        }
        return input[index] instanceof Character;
    }

    /**
     * @param index The index to get.
     * @return The character at the given index or 0 if the index is invalid.
     */
    public char getCharacter(final int index) {
        if (isIndexInvalid(index)) {
            return 0;
        }
        return (Character) input[index];
    }

    /**
     * @return The wrapped array.
     */
    public T[] getInput() {
        return input;
    }

    @Override
    public String toString() {
        return "ObjectArrayWrapper{" +
                "input=" + Arrays.toString(input) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ObjectArrayWrapper<?> that = (ObjectArrayWrapper<?>) object;
        return Arrays.equals(input, that.input);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(input);
    }

    /**
     * @return An empty wrapper.
     */
    public static ObjectArrayWrapper<Object> createEmpty() {
        return new ObjectArrayWrapper<>(new Object[0]);
    }

}
