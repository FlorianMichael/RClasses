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

package de.florianmichael.rclasses.math;

public class Percentage {
    public static float value(final float percentageDecimal, final float base) {
        return percentageDecimal * base * 0.01F; // * 0.01 = : 100
    }

    public static float base(final float percentageDecimal, final float value) {
        return (value / percentageDecimal) * 100F;
    }

    public static float percentage(final float value, final float base) {
        return (value / base) * 100F;
    }

    public static float toDecimal(final float percentage) {
        return percentage * 0.01F; // * 0.01 = : 100
    }

    public static float toPercentage(final float decimal) {
        return decimal * 100F;
    }

    public static double value(final double percentageDecimal, final double base) {
        return percentageDecimal * base * 0.01; // * 0.01 = : 100
    }

    public static double base(final double percentageDecimal, final double value) {
        return (value / percentageDecimal) * 100D;
    }

    public static double percentage(final double value, final double base) {
        return (value / base) * 100D;
    }

    public static double toDecimal(final double percentage) {
        return percentage * 0.01D; // * 0.01 = : 100
    }

    public static double toPercentage(final double decimal) {
        return decimal * 100D;
    }
}
