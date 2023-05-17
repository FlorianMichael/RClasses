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

public class OptifineD5Trigonometry implements Trigonometry {

    private static final float[] SIN_TABLE_FAST = new float[4096];

    static {
        int i;
        for (i = 0; i < 4096; ++i) {
            SIN_TABLE_FAST[i] = (float) Math.sin((double) (((float) i + 0.5F) / 4096.0F * ((float) Math.PI * 2F)));
        }
        for (i = 0; i < 360; i += 90) {
            SIN_TABLE_FAST[(int) ((float) i * 11.377778F) & 4095] = (float) Math.sin((double) ((float) i * 0.017453292F));
        }
    }

    @Override
    public float sin(float x) {
        return SIN_TABLE_FAST[(int) (x * 651.8986F) & 4095];
    }

    @Override
    public float cos(float x) {
        return SIN_TABLE_FAST[(int) ((x + ((float) Math.PI / 2F)) * 651.8986F) & 4095];
    }
}
