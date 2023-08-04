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

package de.florianmichael.rclasses.functional.vec.b.immutable;

import de.florianmichael.rclasses.functional.vec.b.LongVec;

public final class ImmutableLongVec extends LongVec {
    private final long x, y, z;

    ImmutableLongVec() {
        this(0, 0, 0);
    }

    public ImmutableLongVec(final long x, final long y, final long z) {
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
    }

    @Override
    public void setY(final long y) {
    }

    @Override
    public void setZ(final long z) {
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutableLongVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
