/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.math.geometry.impl;

public class RivensTrigonometry implements TrigonometryBase {

    private static final int BF_SIN_BITS, BF_SIN_MASK, BF_SIN_COUNT;
    private static final float BF_radFull, BF_radToIndex;
    private static final float BF_degFull, BF_degToIndex;
    private static final float[] BF_sin, BF_cos;

    static {
        BF_SIN_BITS  = 12;
        BF_SIN_MASK  = ~(-1 << BF_SIN_BITS);
        BF_SIN_COUNT = BF_SIN_MASK + 1;

        BF_radFull    = (float) (Math.PI * 2.0);
        BF_degFull    = (float) (360.0);
        BF_radToIndex = BF_SIN_COUNT / BF_radFull;
        BF_degToIndex = BF_SIN_COUNT / BF_degFull;

        BF_sin = new float[BF_SIN_COUNT];
        BF_cos = new float[BF_SIN_COUNT];

        for (int i = 0; i < BF_SIN_COUNT; i++) {
            BF_sin[i] = (float) Math.sin((i + 0.5f) / BF_SIN_COUNT * BF_radFull);
            BF_cos[i] = (float) Math.cos((i + 0.5f) / BF_SIN_COUNT * BF_radFull);
        }

        // Four cardinal directions (credits: Nate)
        for (int i = 0; i < 360; i += 90) {
            BF_sin[(int)(i * BF_degToIndex) & BF_SIN_MASK] = (float) Math.sin(i * Math.PI / 180.0);
            BF_cos[(int)(i * BF_degToIndex) & BF_SIN_MASK] = (float) Math.cos(i * Math.PI / 180.0);
        }
    }

    @Override
    public float sin(float x) {
        return BF_sin[(int)(x * BF_radToIndex) & BF_SIN_MASK];
    }

    @Override
    public float cos(float x) {
        return BF_cos[(int)(x * BF_radToIndex) & BF_SIN_MASK];
    }

}
