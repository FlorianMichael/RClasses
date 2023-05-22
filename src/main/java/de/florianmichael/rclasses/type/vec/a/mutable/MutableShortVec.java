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

import de.florianmichael.rclasses.type.vec.a.ShortVec;

public final class MutableShortVec extends ShortVec {
    private short x, y;

    MutableShortVec() {
        this((short) 0, (short) 0);
    }

    public MutableShortVec(final short x, final short y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public short getX() {
        return this.x;
    }

    @Override
    public short getY() {
        return this.y;
    }

    @Override
    public void setX(final short x) {
        this.x = x;
    }

    @Override
    public void setY(final short y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableShortVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
