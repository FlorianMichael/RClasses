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


    @SuppressWarnings("all")
    MutableByteVec() {
        this((short) 0, (short) 0, (short) 0);
    }

    public MutableByteVec(final short x, final short y, final short z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public @Override short getX() {
        return this.x;
    }

    public @Override void setX(final short x) {
        this.x = x;
    }

    public @Override short getY() {
        return this.y;
    }

    public @Override void setY(final short y) {
        this.y = y;
    }

    public @Override short getZ() {
        return this.z;
    }

    public @Override void setZ(final short z) {
        this.y = z;
    }


    public @Override String toString() {
        return String.format(
                "MutableByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
