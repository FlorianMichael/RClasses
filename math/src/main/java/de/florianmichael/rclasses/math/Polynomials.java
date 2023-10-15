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

package de.florianmichael.rclasses.math;

public class Polynomials {

    /**
     * Calculates the result of a quadratic equation. The equation must be in the form of x^2 + px + q = 0.
     *
     * @param p The p value.
     * @param q The q value.
     * @return The result.
     */
    public static Result pq(final double p, final double q) {
        final double sqrt = Math.sqrt(Math.pow(p / 2F, 2) - q);

        final double x1 = -p / 2F + sqrt;
        final double x2 = -p / 2F - sqrt;

        return new Result(x1, x2);
    }

    /**
     * Calculates the result of a quadratic equation. The equation must be in the form of ax^2 + bx + c = 0.
     *
     * @param a The a value.
     * @param b The b value.
     * @param c The c value.
     * @return The result.
     */
    public static Result abc(final double a, final double b, final double c) {
        return pq(b / a, c / a);
    }

    public static class Result {
        private final double x1;
        private final double x2;

        public Result(double x1, double x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        public double x1() {
            return x1;
        }

        public double x2() {
            return x2;
        }
    }
}
