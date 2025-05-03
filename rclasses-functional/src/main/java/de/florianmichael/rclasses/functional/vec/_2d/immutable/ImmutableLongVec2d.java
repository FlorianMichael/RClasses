/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.functional.vec._2d.immutable;

import de.florianmichael.rclasses.functional.vec._2d.LongVec2d;

import java.util.Objects;

public class ImmutableLongVec2d extends LongVec2d {

    private final long x, y;

    public ImmutableLongVec2d() {
        this(0L, 0L);
    }

    public ImmutableLongVec2d(final long x, final long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public long getX() {
        return this.x;
    }

    @Override
    public long getY() {
        return this.y;
    }

    @Override
    public void setX(final long x) {
    }

    @Override
    public void setY(final long y) {
    }

    @Override
    public String toString() {
        return "ImmutableLongVec2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableLongVec2d that = (ImmutableLongVec2d) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
