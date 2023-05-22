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

package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.IntVec;

public final class ImmutableIntVec extends IntVec {
    private final int x, y, z;


    @SuppressWarnings("all")
    ImmutableIntVec() {
        this(0, 0, 0);
    }


    public ImmutableIntVec(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override int getX() {
        return this.x;
    }

    public @Override int getY() {
        return this.y;
    }

    public @Override int getZ() {
        return this.z;
    }

    public @Override void setX(final int x) {
    }

    public @Override void setY(final int y) {
    }

    public @Override void setZ(final int z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableIntVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
