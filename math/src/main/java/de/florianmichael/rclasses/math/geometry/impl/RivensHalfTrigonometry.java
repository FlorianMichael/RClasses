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

public class RivensHalfTrigonometry implements TrigonometryBase {

    private static final float BF_SIN_TO_COS;
    private static final int BF_SIN_BITS, BF_SIN_MASK, BF_SIN_MASK2, BF_SIN_COUNT, BF_SIN_COUNT2;
    private static final float BF_radFull, BF_radToIndex;
    private static final float[] BF_sinHalf;

    static {
        BF_SIN_TO_COS = (float)(Math.PI * 0.5f);

        BF_SIN_BITS = 12;
        BF_SIN_MASK = ~(-1 << BF_SIN_BITS);
        BF_SIN_MASK2 = BF_SIN_MASK >> 1;
        BF_SIN_COUNT = BF_SIN_MASK + 1;
        BF_SIN_COUNT2 = BF_SIN_MASK2 + 1;

        BF_radFull = (float)(Math.PI * 2.0);
        BF_radToIndex = BF_SIN_COUNT / BF_radFull;

        BF_sinHalf = new float[BF_SIN_COUNT2];
        for (int i = 0; i < BF_SIN_COUNT2; i++) {
            BF_sinHalf[i] = (float) Math.sin((i + Math.min(1, i % (BF_SIN_COUNT / 4)) * 0.5) / BF_SIN_COUNT * BF_radFull);
        }

        float[] hardcodedAngles = {
                90  * 0.017453292F, // getLook when looking up (sin) - Fixes Elytra
                90  * 0.017453292F + BF_SIN_TO_COS // getLook when looking up (cos) - Fixes Elytra
        };
        for(float angle : hardcodedAngles) {
            int index1 = (int)(angle * BF_radToIndex) & BF_SIN_MASK;
            int index2 = index1 & BF_SIN_MASK2;
            int mul = ((index1 == index2) ? +1 : -1);
            BF_sinHalf[index2] = (float)(Math.sin(angle) / mul);
        }
    }

    @Override
    public float sin(float x) {
        int index1 = (int) (x * BF_radToIndex) & BF_SIN_MASK;
        int index2 = index1 & BF_SIN_MASK2;
        int mul = ((index1 == index2) ? +1 : -1);

        return BF_sinHalf[index2] * mul;
    }

    @Override
    public float cos(float x) {
        return sin(x + BF_SIN_TO_COS);
    }

}
