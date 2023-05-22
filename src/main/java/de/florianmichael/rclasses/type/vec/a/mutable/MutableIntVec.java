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

import de.florianmichael.rclasses.type.vec.a.IntVec;

public final class MutableIntVec extends IntVec {
    private int x, y;


    @SuppressWarnings("all")
    MutableIntVec() {
        this(0, 0);
    }


    public MutableIntVec(final int x, final int y) {
        this.x = x;
        this.y = y;
    }


    public @Override int getX() {
        return this.x;
    }

    public @Override int getY() {
        return this.y;
    }

    public @Override void setX(final int x) {
        this.x = x;
    }

    public @Override void setY(final int y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableIntVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
