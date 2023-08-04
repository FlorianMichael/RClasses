/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
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

package de.florianmichael.rclasses.common;

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

    public static int toHex(final float[] rgba) {
        return toHex(rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    public static int toHex(final float r, final float g, final float b) {
        return (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8)  |
                (((int) (b * 255) & 0xFF));
    }

    public static int toHex(final float r, final float g, final float b, final float a) {
        return (((int) (a * 255) & 0xFF) << 24) |
                (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8)  |
                (((int) (b * 255) & 0xFF));
    }

    public static Color colorInterpolate(final Color a, final Color b, final double t) {
        return colorInterpolate(a, b, t, t, t, t);
    }

    public static Color colorInterpolate(final Color a, final Color b, final double tR, final double tG, final double tB, final double tA) {
        return new Color(
                (float) ((a.getRed() + (b.getRed() - a.getRed()) * tR) / 255F),
                (float) ((a.getGreen() + (b.getGreen() - a.getGreen()) * tG) / 255F),
                (float) ((a.getBlue() + (b.getBlue() - a.getBlue()) * tB) / 255F),
                (float) ((a.getAlpha() + (b.getAlpha() - a.getAlpha()) * tA) / 255F)
        );
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
