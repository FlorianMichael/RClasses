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

package de.florianmichael.rclasses.math.geometry.impl;

/**
 * Implementation of a trigonometry calculator.
 */
public interface TrigonometryBase {

    /**
     * Calculates the sine of a given value.
     * @param x The value.
     * @return The sine.
     */
    float sin(final float x);

    /**
     * Calculates the cosine of a given value.
     * @param x The value.
     * @return The cosine.
     */
    float cos(final float x);

    /**
     * Calculates the tangent of a given value.
     * @param x The value.
     * @return The tangent.
     */
    default float tan(final float x) {
        return sin(x) / cos(x);
    }
}
