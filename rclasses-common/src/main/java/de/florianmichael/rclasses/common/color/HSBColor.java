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

package de.florianmichael.rclasses.common.color;

import java.awt.*;

/**
 * Represents a color in the HSB color space. This class is used to store colors in a more convenient way.
 * <p>
 * The HSB color space is a color space that describes colors in terms of hue, saturation, and brightness (also
 * called value). It is a nonlinear transformation of the RGB color space. The HSB color space is often used in
 * color selection tools, such as in Photoshop.
 * <br>
 * The HSB color space can be visualized as a double cone with the primary colors red, green, and blue at the
 * vertices of the triangle at the bottom. The brightness is represented by the vertical axis. The hue is the
 * angle of the vector from the origin to the point on the cone. The saturation is the distance from the origin.
 */
public class HSBColor {

    public float hue;
    public float saturation;
    public float brightness;

    public float alpha;

    /**
     * Creates a new HSBColor from the given color.
     *
     * @param color The color to create the HSBColor from.
     */
    public HSBColor(final Color color) {
        final float[] hsbColors = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

        this.hue = hsbColors[0];
        this.saturation = hsbColors[1];
        this.brightness = hsbColors[2];

        this.alpha = color.getAlpha() / 255.0F;
    }

    /**
     * Creates a new HSBColor from the given hue, saturation, brightness, and alpha values.
     *
     * @param hue        The hue of the color.
     * @param saturation The saturation of the color.
     * @param brightness The brightness of the color.
     * @param alpha      The alpha of the color.
     */
    public HSBColor(final float hue, final float saturation, final float brightness, final float alpha) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
        this.alpha = alpha;
    }

    /**
     * @return A new {@link Color} instance with the same values as this HSBColor.
     */
    public Color getColor() {
        final Color color = Color.getHSBColor(this.hue, this.saturation, this.brightness);

        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) (this.alpha * 255.0F));
    }

    /**
     * Sets the color of this HSBColor to the given color, see {@link Color}.
     *
     * @param color The color to set.
     */
    public void setColor(final Color color) {
        final float[] hsbColors = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

        setColor(hsbColors[0], hsbColors[1], hsbColors[2], color.getAlpha() / 255.0F);
    }

    /**
     * Sets the color of this HSBColor to the given hue, saturation, brightness, and alpha values.
     *
     * @param hue        The hue of the color.
     * @param saturation The saturation of the color.
     * @param brightness The brightness of the color.
     */
    public void setColor(final float hue, final float saturation, final float brightness) {
        setColor(hue, saturation, brightness, 1.0F);
    }

    /**
     * Sets the color of this HSBColor to the given hue, saturation, brightness, and alpha values.
     *
     * @param hue        The hue of the color.
     * @param saturation The saturation of the color.
     * @param brightness The brightness of the color.
     * @param alpha      The alpha of the color.
     */
    public void setColor(final float hue, final float saturation, final float brightness, final float alpha) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
        this.alpha = alpha;
    }

}
