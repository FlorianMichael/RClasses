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

package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.ShortVec;

public final class MutableByteVec extends ShortVec {
    private short x;
    private short y;
    private final short z;

    MutableByteVec() {
        this((short) 0, (short) 0, (short) 0);
    }

    public MutableByteVec(final short x, final short y, final short z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public short getX() {
        return this.x;
    }

    @Override
    public void setX(final short x) {
        this.x = x;
    }

    @Override
    public short getY() {
        return this.y;
    }

    @Override
    public void setY(final short y) {
        this.y = y;
    }

    @Override
    public short getZ() {
        return this.z;
    }

    @Override
    public void setZ(final short z) {
        this.y = z;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
