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

import de.florianmichael.rclasses.functional.vec.b.DoubleVec;

public final class ImmutableDoubleVec extends DoubleVec {
    private final double x, y, z;

    ImmutableDoubleVec() {
        this(0, 0, 0);
    }

    public ImmutableDoubleVec(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public double getZ() {
        return this.z;
    }

    @Override
    public void setX(final double x) {
    }

    @Override
    public void setY(final double y) {
    }

    @Override
    public void setZ(final double z) {
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutableDoubleVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
