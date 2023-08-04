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

package de.florianmichael.rclasses.functional.vec.a.mutable;

import de.florianmichael.rclasses.functional.vec.a.DoubleVec;

public final class MutableDoubleVec extends DoubleVec {
    private double x, y;

    MutableDoubleVec() {
        this(0.0D, 0.0D);
    }

    public MutableDoubleVec(final double x, final double y) {
        this.x = x;
        this.y = y;
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
    public void setX(final double x) {
        this.x = x;
    }

    @Override
    public void setY(final double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format(
                "MutableDoubleVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
