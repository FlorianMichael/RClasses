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

package de.florianmichael.rclasses.math;

import de.florianmichael.rclasses.math.integration.MathConstants;

import java.util.Random;

public class BoxMullerTransform {

    /**
     * @param random The random object to use.
     * @param min    The minimum value.
     * @param max    The maximum value.
     * @param mean   The mean value.
     * @param sigma  The sigma value.
     * @return A random number between the minimum and maximum value, with the given mean and sigma.
     */
    public static float distribution(final Random random, final float min, final float max, final float mean, final float sigma) {
        float u1, u2;
        float z0;

        do {
            u1 = random.nextFloat();
            u2 = random.nextFloat();
            z0 = (float) Math.sqrt(-2.0F * (float) Math.log(u1)) * (float) Math.cos(MathConstants.TAU * u2);
        } while ((int) (z0 * sigma + mean) < min || (int) (z0 * sigma + mean) > max);

        return mean + sigma * z0;
    }

    /**
     * @param random The random object to use.
     * @param min    The minimum value.
     * @param max    The maximum value.
     * @param mean   The mean value.
     * @param sigma  The sigma value.
     * @return A random number between the minimum and maximum value, with the given mean and sigma.
     */
    public static double distribution(final Random random, final double min, final double max, final double mean, final double sigma) {
        double u1, u2;
        double z0;

        do {
            u1 = random.nextFloat();
            u2 = random.nextFloat();
            z0 = Math.sqrt(-2.0F * (float) Math.log(u1)) * Math.cos(MathConstants.TAU * u2);
        } while ((int) (z0 * sigma + mean) < min || (int) (z0 * sigma + mean) > max);

        return mean + sigma * z0;
    }

}
