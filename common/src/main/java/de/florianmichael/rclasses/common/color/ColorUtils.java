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

package de.florianmichael.rclasses.common.color;

import java.awt.*;

public class ColorUtils {

    public static final Color MIN_INT = new Color(Integer.MIN_VALUE, true);
    public static final Color MAX_INT = new Color(Integer.MAX_VALUE, true);

    /**
     * Returns a new color with the given red value.
     *
     * @param color The color to change the red value of.
     * @param red   The new red value.
     * @return The new color with the given red value.
     */
    public static Color withRed(final Color color, final int red) {
        return new Color(red, color.getGreen(), color.getBlue(), color.getAlpha());
    }

    /**
     * Returns a new color with the given green value.
     *
     * @param color The color to change the green value of.
     * @param green The new red value.
     * @return The new color with the given green value.
     */
    public static Color withGreen(final Color color, final int green) {
        return new Color(color.getRed(), green, color.getBlue(), color.getAlpha());
    }


    /**
     * Returns a new color with the given blue value.
     *
     * @param color The color to change the blue value of.
     * @param blue  The new red value.
     * @return The new color with the given blue value.
     */
    public static Color withBlue(final Color color, final int blue) {
        return new Color(color.getRed(), color.getGreen(), blue, color.getAlpha());
    }

    /**
     * Returns a new color with the given alpha value.
     *
     * @param color The color to change the alpha value of.
     * @param alpha The new alpha value.
     * @return The new color with the given alpha value.
     */
    public static Color withAlpha(final Color color, final int alpha) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
    }

    /**
     * Invert a color
     *
     * @param color The color to invert
     * @return The inverted color
     */
    public static Color invert(final Color color) {
        return new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue(), color.getAlpha());
    }

    /**
     * Returns the hex value of the given color.
     *
     * @param color The color to convert.
     * @return The hex value of the given color.
     */
    public static String toHex(final int color) {
        return String.format("#%06x", (color & 0x00FFFFFF));
    }

    /**
     * Returns a color model from the given hex value.
     *
     * @param hex The hex value.
     * @return The color model.
     */
    public static Color fromHex(final String hex) {
        return Color.decode(hex);
    }

    /**
     * Splits the given color into an array of floats.
     *
     * @param color The color to split.
     * @return The array of floats.
     */
    public static float[] rgb(final int color) {
        return new float[]{
                ((color >> 16) & 0xff) / 255f,
                ((color >> 8) & 0xff) / 255f,
                ((color) & 0xff) / 255f
        };
    }

    /**
     * Splits the given color into an array of floats.
     *
     * @param color The color to split.
     * @return The array of floats.
     */
    public static float[] rgba(final int color) {
        return new float[]{
                ((color >> 16) & 0xff) / 255f,
                ((color >> 8) & 0xff) / 255f,
                ((color) & 0xff) / 255f,
                ((color >> 24) & 0xff) / 255f
        };
    }

    /**
     * Merges the given array of floats into a color.
     *
     * @param rgba The array of floats.
     * @return The color.
     */
    public static int toSRGB(final float[] rgba) {
        return toSRGB(rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    /**
     * Merges the given array of floats into a color.
     *
     * @param r The red value.
     * @param g The green value.
     * @param b The blue value.
     * @return The color.
     */
    public static int toSRGB(final float r, final float g, final float b) {
        return (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8) |
                (((int) (b * 255) & 0xFF));
    }

    /**
     * Merges the given array of floats into a color.
     *
     * @param r The red value.
     * @param g The green value.
     * @param b The blue value.
     * @param a The alpha value.
     * @return The color.
     */
    public static int toSRGB(final float r, final float g, final float b, final float a) {
        return (((int) (a * 255) & 0xFF) << 24) |
                (((int) (r * 255) & 0xFF) << 16) |
                (((int) (g * 255) & 0xFF) << 8) |
                (((int) (b * 255) & 0xFF));
    }

    /**
     * Interpolates between two colors.
     *
     * @param a The first color.
     * @param b The second color.
     * @param t The factor to interpolate.
     * @return The interpolated color.
     */
    public static Color colorInterpolate(final Color a, final Color b, final double t) {
        return colorInterpolate(a, b, t, t, t, t);
    }

    /**
     * Interpolates between two colors.
     *
     * @param a  The first color.
     * @param b  The second color.
     * @param tR The factor to interpolate the red value.
     * @param tG The factor to interpolate the green value.
     * @param tB The factor to interpolate the blue value.
     * @param tA The factor to interpolate the alpha value.
     * @return The interpolated color.
     */
    public static Color colorInterpolate(final Color a, final Color b, final double tR, final double tG, final double tB, final double tA) {
        return new Color(
                (float) ((a.getRed() + (b.getRed() - a.getRed()) * tR) / 255F),
                (float) ((a.getGreen() + (b.getGreen() - a.getGreen()) * tG) / 255F),
                (float) ((a.getBlue() + (b.getBlue() - a.getBlue()) * tB) / 255F),
                (float) ((a.getAlpha() + (b.getAlpha() - a.getAlpha()) * tA) / 255F)
        );
    }

    /**
     * @return The rainbow color.
     */
    public static Color getRainbow() {
        return getRainbow(200, 0.5);
    }

    /**
     * Returns a rainbow color.
     *
     * @param delay The delay.
     * @param time  The time.
     * @return The rainbow color.
     */
    public static Color getRainbow(final long delay, final double time) {
        return getRainbow(delay, time, 1F, 1F);
    }

    /**
     * Returns a rainbow color.
     *
     * @param delay      The delay.
     * @param time       The time.
     * @param saturation The saturation.
     * @param brightness The brightness.
     * @return The rainbow color.
     */
    public static Color getRainbow(final long delay, final double time, final float saturation, final float brightness) {
        double rainbowState = Math.ceil((System.currentTimeMillis() * time + delay) / 20.0);
        rainbowState %= 360.0;

        return Color.getHSBColor((float) (rainbowState / 360.0F), saturation, brightness);
    }

}
