/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.functional.vec._3d.mutable;

import de.florianmichael.rclasses.functional.vec._3d.ShortVec3d;

import java.util.Objects;

public class MutableShortVec3d extends ShortVec3d {

    private short x, y, z;

    public MutableShortVec3d() {
        this((short) 0, (short) 0, (short) 0);
    }

    public MutableShortVec3d(final short x, final short y, final short z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
    public short getZ() {
        return this.z;
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
    public void setZ(final short z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "MutableShortVec3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableShortVec3d that = (MutableShortVec3d) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

}
