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

package de.florianmichael.rclasses.math.geometry;

/**
 * Implementation of the Euclidean distance.
 */
public class EDistance {

    /**
     * Calculates the distance between two points.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @return The distance between the two points.
     */
    public static float distance(final float x1, final float y1, final float x2, final float y2) {
        return (float) Math.sqrt(squaredDistance(x1, y1, x2, y2));
    }

    /**
     * Calculates the squared distance between two points.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @return The squared distance between the two points.
     */
    public static float squaredDistance(final float x1, final float y1, final float x2, final float y2) {
        return (float) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Calculates the distance between two points in 3D space.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param z1 The z coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @param z2 The z coordinate of the second point.
     * @return The distance between the two points.
     */
    public static float distance(final float x1, final float y1, final float z1, final float x2, final float y2, final float z2) {
        return (float) Math.sqrt(squaredDistance(x1, y1, z1, x2, y2, z2));
    }

    /**
     * Calculates the squared distance between two points in 3D space.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param z1 The z coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @param z2 The z coordinate of the second point.
     * @return The squared distance between the two points.
     */
    public static float squaredDistance(final float x1, final float y1, final float z1, final float x2, final float y2, final float z2) {
        return (float) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
    }

    /**
     * Calculates the distance between two points.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @return The distance between the two points.
     */
    public static double distance(final double x1, final double y1, final double x2, final double y2) {
        return Math.sqrt(squaredDistance(x1, y1, x2, y2));
    }

    /**
     * Calculates the squared distance between two points.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @return The squared distance between the two points.
     */
    public static double squaredDistance(final double x1, final double y1, final double x2, final double y2) {
        return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    }

    /**
     * Calculates the distance between two points in 3D space.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param z1 The z coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @param z2 The z coordinate of the second point.
     * @return The distance between the two points.
     */
    public static double distance(final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        return Math.sqrt(squaredDistance(x1, y1, z1, x2, y2, z2));
    }

    /**
     * Calculates the squared distance between two points in 3D space.
     *
     * @param x1 The x coordinate of the first point.
     * @param y1 The y coordinate of the first point.
     * @param z1 The z coordinate of the first point.
     * @param x2 The x coordinate of the second point.
     * @param y2 The y coordinate of the second point.
     * @param z2 The z coordinate of the second point.
     * @return The squared distance between the two points.
     */
    public static double squaredDistance(final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2);
    }
}
