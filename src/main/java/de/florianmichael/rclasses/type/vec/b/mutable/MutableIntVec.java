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

import de.florianmichael.rclasses.type.vec.b.IntVec;

public final class MutableIntVec extends IntVec {
    private int x, y, z;

    MutableIntVec() {
        this(0, 0, 0);
    }

    public MutableIntVec(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getZ() {
        return this.z;
    }

    @Override
    public void setX(final int x) {
        this.x = x;
    }

    @Override
    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public void setZ(final int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableIntVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
