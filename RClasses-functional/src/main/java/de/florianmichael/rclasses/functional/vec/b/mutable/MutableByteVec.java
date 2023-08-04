/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.functional.vec.b.mutable;

import de.florianmichael.rclasses.functional.vec.b.ShortVec;

public final class MutableByteVec extends ShortVec {
    private short x;
    private short y;
    private final short z;

    MutableByteVec() {
        this((short) 0, (short) 0, (short) 0);
    }

    public MutableByteVec(final short x, final short y, final short z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public short getX() {
        return this.x;
    }

    @Override
    public void setX(final short x) {
        this.x = x;
    }

    @Override
    public short getY() {
        return this.y;
    }

    @Override
    public void setY(final short y) {
        this.y = y;
    }

    @Override
    public short getZ() {
        return this.z;
    }

    @Override
    public void setZ(final short z) {
        this.y = z;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
