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

public class HSBColor {
    private float hue;
    private float saturation;
    private float brightness;

    private float alpha;

    public HSBColor(final Color color) {
        final float[] hsbColors = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

        this.hue = hsbColors[0];
        this.saturation = hsbColors[1];
        this.brightness = hsbColors[2];

        this.alpha = color.getAlpha() / 255.0F;
    }

    public HSBColor(final float hue, final float saturation, final float brightness, final float alpha) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
        this.alpha = alpha;
    }

    public Color getColor() {
        final Color color = Color.getHSBColor(this.hue, this.saturation, this.brightness);

        return ColorUtils.withAlpha(color, (int) (this.alpha * 255.0F));
    }

    public void setColor(final Color color) {
        final float[] hsbColors = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

        setColor(hsbColors[0], hsbColors[1], hsbColors[2], color.getAlpha() / 255.0F);
    }

    public void setColor(final float hue, final float saturation, final float brightness) {
        setColor(hue, saturation, brightness, 1.0F);
    }

    public void setColor(final float hue, final float saturation, final float brightness, final float alpha) {
        this.hue = hue;
        this.saturation = saturation;
        this.brightness = brightness;
        this.alpha = alpha;
    }

    public double getHue() {
        return hue;
    }

    public double getSaturation() {
        return saturation;
    }

    public double getBrightness() {
        return brightness;
    }

    public double getAlpha() {
        return alpha;
    }
}
