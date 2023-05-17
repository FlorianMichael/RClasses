/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.rclasses.trigonometry.impl;

import de.florianmichael.rclasses.trigonometry.Trigonometry;

public class RivensHalfTrigonometry implements Trigonometry {

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
