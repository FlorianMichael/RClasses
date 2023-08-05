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

/**
 * Implementation of a percentage calculator.
 */
public class Percentage {

    /**
     * Calculates the percentage value of a given base.
     * @param percentageDecimal The percentage as decimal.
     * @param base The base value.
     * @return The percentage value.
     */
    public static float value(final float percentageDecimal, final float base) {
        return percentageDecimal * base * 0.01F; // * 0.01 = : 100
    }

    /**
     * Calculates the base value of a given percentage.
     * @param percentageDecimal The percentage as decimal.
     * @param value The percentage value.
     * @return The base value.
     */
    public static float base(final float percentageDecimal, final float value) {
        return (value / percentageDecimal) * 100F;
    }

    /**
     * Calculates the percentage of a given value.
     * @param value The percentage value.
     * @param base The base value.
     * @return The percentage.
     */
    public static float percentage(final float value, final float base) {
        return (value / base) * 100F;
    }

    /**
     * Converts a percentage to a decimal.
     * @param percentage The percentage.
     * @return The decimal.
     */
    public static float toDecimal(final float percentage) {
        return percentage * 0.01F; // * 0.01 = : 100
    }

    /**
     * Converts a decimal to a percentage.
     * @param decimal The decimal.
     * @return The percentage.
     */
    public static float toPercentage(final float decimal) {
        return decimal * 100F;
    }

    /**
     * Calculates the percentage value of a given base.
     * @param percentageDecimal The percentage as decimal.
     * @param base The base value.
     * @return The percentage value.
     */
    public static double value(final double percentageDecimal, final double base) {
        return percentageDecimal * base * 0.01; // * 0.01 = : 100
    }

    /**
     * Calculates the base value of a given percentage.
     * @param percentageDecimal The percentage as decimal.
     * @param value The percentage value.
     * @return The base value.
     */
    public static double base(final double percentageDecimal, final double value) {
        return (value / percentageDecimal) * 100D;
    }


    /**
     * Calculates the percentage of a given value.
     * @param value The percentage value.
     * @param base The base value.
     * @return The percentage.
     */
    public static double percentage(final double value, final double base) {
        return (value / base) * 100D;
    }

    /**
     * Converts a percentage to a decimal.
     * @param percentage The percentage.
     * @return The decimal.
     */
    public static double toDecimal(final double percentage) {
        return percentage * 0.01D; // * 0.01 = : 100
    }

    /**
     * Converts a decimal to a percentage.
     * @param decimal The decimal.
     * @return The percentage.
     */
    public static double toPercentage(final double decimal) {
        return decimal * 100D;
    }
}
