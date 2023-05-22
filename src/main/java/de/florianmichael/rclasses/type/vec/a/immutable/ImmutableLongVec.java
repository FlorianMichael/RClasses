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

package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.LongVec;

public final class ImmutableLongVec extends LongVec {
    private final long x, y;


    @SuppressWarnings("all")
    ImmutableLongVec() {
        this(0L, 0L);
    }


    public ImmutableLongVec(final long x, final long y) {
        this.x = x;
        this.y = y;
    }


    public @Override long getX() {
        return this.x;
    }

    public @Override long getY() {
        return this.y;
    }

    public @Override void setX(final long x) {
    }

    public @Override void setY(final long y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableLongVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
