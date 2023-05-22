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

import de.florianmichael.rclasses.type.vec.a.DoubleVec;

public final class ImmutableDoubleVec extends DoubleVec {
    private final double x, y;


    @SuppressWarnings("all")
    ImmutableDoubleVec() {
        this(0.0D, 0.0D);
    }


    public ImmutableDoubleVec(final double x, final double y) {
        this.x = x;
        this.y = y;
    }


    public @Override double getX() {
        return this.x;
    }

    public @Override double getY() {
        return this.y;
    }

    public @Override void setX(final double x) {
    }

    public @Override void setY(final double y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableDoubleVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
