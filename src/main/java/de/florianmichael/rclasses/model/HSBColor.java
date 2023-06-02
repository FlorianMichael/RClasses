/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.model;

import de.florianmichael.rclasses.ColorUtils;

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

    public float getHue() {
        return hue;
    }

    public float getSaturation() {
        return saturation;
    }

    public float getBrightness() {
        return brightness;
    }

    public float getAlpha() {
        return alpha;
    }
}
