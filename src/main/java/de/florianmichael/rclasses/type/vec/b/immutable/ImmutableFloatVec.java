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

import de.florianmichael.rclasses.type.vec.b.FloatVec;

public final class ImmutableFloatVec extends FloatVec {
    private final float x, y, z;


    @SuppressWarnings("all")
    ImmutableFloatVec() {
        this(0, 0, 0);
    }


    public ImmutableFloatVec(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override float getX() {
        return this.x;
    }

    public @Override float getY() {
        return this.y;
    }

    public @Override float getZ() {
        return this.z;
    }

    public @Override void setX(final float x) {
    }

    public @Override void setY(final float y) {
    }

    public @Override void setZ(final float z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableFloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
