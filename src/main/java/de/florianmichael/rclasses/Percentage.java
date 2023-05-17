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

package de.florianmichael.rclasses;

public class Percentage {

    public static Number value(final float percentageDecimal, final float base) {
        return percentageDecimal * base / 100;
    }

    public static Number base(final float percentageDecimal, final float value) {
        return (value / percentageDecimal) * 100;
    }

    public static Number percentage(final float value, final float base) {
        return (value / base) * 100;
    }

    public static Number toDecimal(final float percentage) {
        return percentage / 100;
    }

    public static Number toPercentage(final float decimal) {
        return decimal * 100;
    }
}
