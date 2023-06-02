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

package de.florianmichael.rclasses.type.vec.b;

public abstract class FloatVec {

    public abstract float getX();
    public abstract float getY();
    public abstract float getZ();

    public abstract void setX(final float x);
    public abstract void setY(final float y);
    public abstract void setZ(final float z);

    @Override
    public String toString() {
        return String.format(
                "FloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
