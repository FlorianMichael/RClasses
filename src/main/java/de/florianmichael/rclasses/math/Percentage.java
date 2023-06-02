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
