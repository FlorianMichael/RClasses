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

package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.ShortVec;

public final class ImmutableShortVec extends ShortVec {
    private final short x, y, z;

    ImmutableShortVec() {
        this((short) 0, (short) 0, (short) 0);
    }

    public ImmutableShortVec(final short x, final short y, final short z) {
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
    }

    @Override
    public void setY(final short y) {
    }

    @Override
    public void setZ(final short z) {
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutableShortVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
