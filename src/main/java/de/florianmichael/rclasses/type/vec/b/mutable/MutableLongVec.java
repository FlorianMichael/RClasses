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

package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.LongVec;

public final class MutableLongVec extends LongVec {
    private long x, y, z;

    MutableLongVec() {
        this(0L, 0L, 0L);
    }

    public MutableLongVec(final long x, final long y, final long z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
    public long getZ() {
        return this.z;
    }

    @Override
    public void setX(final long x) {
        this.x = x;
    }

    @Override
    public void setY(final long y) {
        this.y = y;
    }

    @Override
    public void setZ(final long z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableLongVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
