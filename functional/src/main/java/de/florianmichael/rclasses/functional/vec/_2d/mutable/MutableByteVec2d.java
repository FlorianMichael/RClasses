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

import de.florianmichael.rclasses.functional.vec._2d.ByteVec2d;

import java.util.Objects;

public final class MutableByteVec2d extends ByteVec2d {

    private byte x, y;

    public MutableByteVec2d() {
        this((byte) 0, (byte) 0);
    }

    public MutableByteVec2d(final byte x, final byte y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public byte getX() {
        return this.x;
    }

    @Override
    public byte getY() {
        return this.y;
    }

    @Override
    public void setX(final byte x) {
        this.x = x;
    }

    @Override
    public void setY(final byte y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MutableByteVec2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableByteVec2d that = (MutableByteVec2d) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
