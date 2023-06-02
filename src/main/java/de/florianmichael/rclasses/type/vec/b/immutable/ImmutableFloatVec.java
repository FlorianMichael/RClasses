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

import de.florianmichael.rclasses.type.vec.b.FloatVec;

public final class ImmutableFloatVec extends FloatVec {
    private final float x, y, z;

    ImmutableFloatVec() {
        this(0, 0, 0);
    }

    public ImmutableFloatVec(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public float getZ() {
        return this.z;
    }

    @Override
    public void setX(final float x) {
    }

    @Override
    public void setY(final float y) {
    }

    @Override
    public void setZ(final float z) {
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutableFloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
