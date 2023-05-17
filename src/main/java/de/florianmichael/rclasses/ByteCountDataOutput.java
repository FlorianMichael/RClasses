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

package de.florianmichael.rclasses;

import java.io.DataOutput;

public class ByteCountDataOutput implements DataOutput {
    public static final ByteCountDataOutput INSTANCE = new ByteCountDataOutput();

    private int count = 0;

    public void reset() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void write(int b) {
        count++;
    }

    @Override
    public void write(byte[] b) {
        count += b.length;
    }

    @Override
    public void write(byte[] b, int off, int len) {
        count += len;
    }

    @Override
    public void writeBoolean(boolean v) {
        count++;
    }

    @Override
    public void writeByte(int v) {
        count++;
    }

    @Override
    public void writeShort(int v) {
        count += 2;
    }

    @Override
    public void writeChar(int v) {
        count += 2;
    }

    @Override
    public void writeInt(int v) {
        count += 4;
    }

    @Override
    public void writeLong(long v) {
        count += 8;
    }

    @Override
    public void writeFloat(float v) {
        count += 4;
    }

    @Override
    public void writeDouble(double v) {
        count += 8;
    }

    @Override
    public void writeBytes(String s) {
        count += s.length();
    }

    @Override
    public void writeChars(String s) {
        count += s.length() * 2;
    }

    @Override
    public void writeUTF(String s) {
        count += (2 + this.utfLength(s));
    }

    public long utfLength(final String s) {
        long utfLength = 0;

        for (int cpos = 0; cpos < s.length(); cpos++) {
            char c = s.charAt(cpos);
            if (c >= 0x0001 && c <= 0x007F)
                utfLength++;
            else if (c > 0x07FF)
                utfLength += 3;
            else
                utfLength += 2;
        }

        return utfLength;
    }
}
