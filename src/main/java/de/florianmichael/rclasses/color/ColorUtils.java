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

package de.florianmichael.rclasses.color;

import java.awt.*;

public class ColorUtils {
    public final static Color MIN_INT = new Color(Integer.MIN_VALUE, true);
    public final static Color MAX_INT = new Color(Integer.MAX_VALUE, true);

    public static Color withAlpha(final Color color, final int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    public static float[] rgb(final int color) {
        return new float[] {
                ((color >> 16) & 0xff) / 255f,
                ((color >> 8) & 0xff) / 255f,
                ((color) & 0xff) / 255f
        };
    }

    public static float[] rgba(final int color) {
        return new float[] {
                ((color >> 16) & 0xff) / 255f,
                ((color >> 8) & 0xff) / 255f,
                ((color) & 0xff) / 255f,
                ((color >> 24) & 0xff) / 255f
        };
    }

    public static int toDecimal(final float[] rgba) {
        return toDecimal(rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    public static int toDecimal(final float r, final float g, final float b) {
        return (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8)  |
                (((int) (b * 255) & 0xFF));
    }

    public static int toDecimal(final float r, final float g, final float b, final float a) {
        return (((int) (a * 255) & 0xFF) << 24) |
                (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8)  |
                (((int) (b * 255) & 0xFF));
    }

    public static Color getRainbow() {
        return getRainbow(200, 0.5);
    }

    public static Color getRainbow(final long delay, final double time) {
        double rainbowState = Math.ceil((System.currentTimeMillis() * time + delay) / 20.0);
        rainbowState %= 360.0;

        return Color.getHSBColor((float) (rainbowState / 360.0F), 1F, 1F);
    }
}
