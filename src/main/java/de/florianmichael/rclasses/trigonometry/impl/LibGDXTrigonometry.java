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

public class LibGDXTrigonometry implements Trigonometry {
    public static final float BF_PI = 3.1415927f;

    private static final int BF_SIN_BITS = 14; // 16KB. Adjust for accuracy.
    private static final int BF_SIN_MASK = ~(-1 << BF_SIN_BITS);
    private static final int BF_SIN_COUNT = BF_SIN_MASK + 1;

    private static final float BF_radFull = BF_PI * 2;
    private static final float BF_degFull = 360;
    private static final float BF_radToIndex = BF_SIN_COUNT / BF_radFull;
    private static final float BF_degToIndex = BF_SIN_COUNT / BF_degFull;

    public static final float BF_degreesToRadians = BF_PI / 180;

    private static final float[] BF_table = new float[BF_SIN_COUNT];

    static {
        for(int i = 0; i < BF_SIN_COUNT; i++) {
            BF_table[i] = (float) Math.sin((i + 0.5f) / BF_SIN_COUNT * BF_radFull);
        }
        for (int i = 0; i < 360; i += 90) {
            BF_table[(int)(i * BF_degToIndex) & BF_SIN_MASK] = (float) Math.sin(i * BF_degreesToRadians);
        }
    }

    @Override
    public float sin(float x) {
        return BF_table[(int)(x * BF_radToIndex) & BF_SIN_MASK];
    }

    @Override
    public float cos(float x) {
        return BF_table[(int)((x + BF_PI / 2) * BF_radToIndex) & BF_SIN_MASK];
    }
}
