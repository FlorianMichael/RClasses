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

public class OptifineK4Trigonometry implements Trigonometry {


    private static final float radToIndex = roundToFloat(651.8986469044033D);
    private static final float[] SIN_TABLE_FAST = new float[4096];

    static {
        for (int j = 0; j < SIN_TABLE_FAST.length; ++j)
        {
            SIN_TABLE_FAST[j] = roundToFloat(Math.sin((double)j * Math.PI * 2.0D / 4096.0D));
        }
    }

    public static float roundToFloat(double d)
    {
        return (float)((double) Math.round(d * 1.0E8D) / 1.0E8D);
    }

    @Override
    public float sin(float x) {
        return SIN_TABLE_FAST[(int)(x * radToIndex) & 4095];
    }

    @Override
    public float cos(float x) {
        return SIN_TABLE_FAST[(int)(x * radToIndex + 1024.0F) & 4095];
    }
}
