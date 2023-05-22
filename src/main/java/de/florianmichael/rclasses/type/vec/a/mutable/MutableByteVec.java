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

package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.ByteVec;

public final class MutableByteVec extends ByteVec {
    private byte x, y;

    MutableByteVec() {
        this((byte) 0, (byte) 0);
    }

    public MutableByteVec(final byte x, final byte y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public byte getX() {
        return this.x;
    }

    @Override
    public byte getY() {
        return this.y;
    }

    @Override
    public void setX(final byte x) {
        this.x = x;
    }

    @Override
    public void setY(final byte y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableByteVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
