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

package de.florianmichael.rclasses.common.access;

import java.util.Arrays;

public class ObjectArrayWrapper {
	private final Object[] input;

	public ObjectArrayWrapper(final Object[] input) {
		this.input = input;
	}

	public int length() {
		return input.length;
	}

	public boolean isLength(final int length) {
		return input.length == length;
	}

	public boolean isSmaller(final int length) {
		return input.length < length;
	}

	public boolean isSmallerOrEqual(final int length) {
		return input.length <= length;
	}

	public boolean isGreater(final int length) {
		return input.length > length;
	}

	public boolean isGreaterOrEqual(final int length) {
		return input.length >= length;
	}

	public boolean isEmpty() {
		return input.length == 0;
	}

	public boolean isIndexValid(final int index) {
		return index >= 0 && index < input.length;
	}

	public boolean isIndexInvalid(final int index) {
		return index < 0 || index >= input.length;
	}

	public Object get(final int index) {
		if (isIndexInvalid(index)) {
			return null;
		}
		return input[index];
	}

	public boolean isString(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof String;
	}

	public String getString(final int index) {
		if (isIndexInvalid(index)) {
			return null;
		}
		return (String) input[index];
	}

	public boolean isBoolean(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Boolean;
	}

	public boolean getBoolean(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return (Boolean) input[index];
	}

	public boolean isByte(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Byte;
	}

	public byte getByte(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Byte) input[index];
	}

	public boolean isShort(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Short;
	}

	public short getShort(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Short) input[index];
	}

	public boolean isInteger(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Integer;
	}

	public int getInteger(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Integer) input[index];
	}

	public boolean isLong(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Long;
	}

	public long getLong(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Long) input[index];
	}

	public boolean isFloat(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Float;
	}

	public float getFloat(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Float) input[index];
	}

	public boolean isDouble(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Double;
	}

	public double getDouble(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Double) input[index];
	}

	public boolean isCharacter(final int index) {
		if (isIndexInvalid(index)) {
			return false;
		}
		return input[index] instanceof Character;
	}

	public char getCharacter(final int index) {
		if (isIndexInvalid(index)) {
			return 0;
		}
		return (Character) input[index];
	}

	public Object[] getInput() {
		return input;
	}

	@Override
	public String toString() {
		return "ObjectArrayWrapper{" +
				"input=" + Arrays.toString(input) +
				'}';
	}

	public static ObjectArrayWrapper createEmpty() {
		return new ObjectArrayWrapper(new Object[0]);
	}
}
