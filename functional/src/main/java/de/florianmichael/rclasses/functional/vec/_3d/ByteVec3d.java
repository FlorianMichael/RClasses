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

package de.florianmichael.rclasses.functional.vec._3d;

/**
 * This class represents a 3-dimensional vector with 3 {@code byte} values.
 */
public abstract class ByteVec3d {

    public abstract byte getX();
    public abstract byte getY();
    public abstract byte getZ();

    public abstract void setX(final byte x);
    public abstract void setY(final byte y);
    public abstract void setZ(final byte z);

    @Override
    public String toString() {
        return String.format(
                "ByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }

}
