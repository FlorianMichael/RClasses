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

package de.florianmichael.rclasses.math.integration;

public class Boundings {

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final short x, final short y, final short left, final short up, final short right, final short down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final int x, final int y, final int left, final int up, final int right, final int down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final long x, final long y, final long left, final long up, final long right, final long down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final float x, final float y, final float left, final float up, final float right, final float down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are relative.
     */
    public static boolean isInBounds(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= left + right && y >= up && y <= up + down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final short x, final short y, final short left, final short up, final short right, final short down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final int x, final int y, final int left, final int up, final int right, final int down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final long x, final long y, final long left, final long up, final long right, final long down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final float x, final float y, final float left, final float up, final float right, final float down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

    /**
     * @param x     The x value.
     * @param y     The y value.
     * @param left  The left value.
     * @param up    The up value.
     * @param right The right value.
     * @param down  The down value.
     * @return Whether the given point is in the bounds of the given rectangle. The bounds are absolute.
     */
    public static boolean isInBoundsAbsolute(final double x, final double y, final double left, final double up, final double right, final double down) {
        return x >= left && x <= right && y >= up && y <= down;
    }

}
