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

package de.florianmichael.rclasses.functional.vec._2d.mutable;

import de.florianmichael.rclasses.functional.vec._2d.ShortVec2d;

import java.util.Objects;

public class MutableShortVec2d extends ShortVec2d {

    private short x, y;

    public MutableShortVec2d() {
        this((short) 0, (short) 0);
    }

    public MutableShortVec2d(final short x, final short y) {
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
        return "MutableShortVec2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableShortVec2d that = (MutableShortVec2d) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
