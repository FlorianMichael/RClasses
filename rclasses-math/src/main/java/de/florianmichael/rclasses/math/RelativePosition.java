/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

import de.florianmichael.rclasses.math.geometry.Alignment;

/**
 * Represents a relative position of an element on the screen with the {@link #getMaxWidth()} and {@link #getMaxHeight()} bounds.
 * The position is calculated based on the alignment and the difference between the absolute position of the element and the absolute position of the screen.
 */
public abstract class RelativePosition {

    private float diffX;
    private float diffY;

    private Alignment alignmentX;
    private Alignment alignmentY;

    /**
     * Creates a new RelativePosition object
     *
     * @param alignmentX The horizontal alignment of the element
     * @param alignmentY The vertical alignment of the element
     */
    public RelativePosition(final Alignment alignmentX, final Alignment alignmentY) {
        this(0, 0, alignmentX, alignmentY);
    }

    /**
     * Creates a new RelativePosition object
     *
     * @param diffX      The difference between the absolute x position of the element and the absolute x position of the screen
     * @param diffY      The difference between the absolute y position of the element and the absolute y position of the screen
     * @param alignmentX The horizontal alignment of the element
     * @param alignmentY The vertical alignment of the element
     */
    public RelativePosition(final float diffX, final float diffY, final Alignment alignmentX, final Alignment alignmentY) {
        this.diffX = diffX;
        this.diffY = diffY;
        this.alignmentX = alignmentX;
        this.alignmentY = alignmentY;
    }

    /**
     * @return The width of the element
     */
    public abstract float getWidth();

    /**
     * @return The maximum width of the screen or the dimension this element is rendered in
     */
    public abstract float getMaxWidth();

    /**
     * @return The height of the element
     */
    public abstract float getHeight();

    /**
     * @return The maximum height of the screen or the dimension this element is rendered in
     */
    public abstract float getMaxHeight();

    /**
     * @return The absolute x position of the element on the screen (0,0 is the top left corner) as an integer
     */
    public float getX() {
        if (this.alignmentX == Alignment.LEFT) {
            // If the element is on the left side of the screen, we can just return the diffX value
            // We are using Math.max to make sure that the element is not rendered outside the screen
            return (int) Math.max(0.0, Math.min(this.diffX, getMaxWidth()));
        } else if (this.alignmentX == Alignment.MIDDLE) {
            // If the element is in the middle of the screen, we just subtract the diffX value from the middle of the screen
            return (int) (getMaxWidth() / 2F - diffX);
        }

        // If the element is on the right side of the screen, we calculate the delta between the right side of the screen and the diffX value
        final int deltaX = (int) (getMaxWidth() - this.diffX);

        // We are using Math.max to make sure that the element is not rendered outside the screen
        return Math.max(0, (deltaX + this.getWidth() > getMaxWidth()) ? (getMaxWidth() - this.getWidth()) : deltaX);
    }

    /**
     * @param x The absolute x position of the element on the screen (0,0 is the top left corner)
     */
    public void setX(final float x) {
        // If the x value is between 25% and 75% of the screen, we set the alignment to middle
        // The diffX value is calculated by subtracting the x value from the middle of the screen
        if (x > (getMaxWidth() * 25F / 100) && x < (getMaxWidth() * 75F / 100)) {
            alignmentX = Alignment.MIDDLE;
            diffX = getMaxWidth() / 2F - x;
            return;
        }

        // If the x value is bigger than half of the screen, we set the alignment to right otherwise to left
        this.alignmentX = ((x >= getMaxWidth() / 2.0) ? Alignment.RIGHT : Alignment.LEFT);
        if (this.alignmentX == Alignment.LEFT) {
            // If the element is on the left side of the screen, we can just set the diffX value to the x value
            this.diffX = x;
        } else {
            // Otherwise we calculate the delta between the right side of the screen and the x value
            this.diffX = getMaxWidth() - x;
        }
    }

    /**
     * @return The absolute y position of the element on the screen (0,0 is the top left corner) as an integer
     */
    public float getY() {
        if (this.alignmentY == Alignment.TOP) {
            // If the element is at the top of the screen, we can just return the diffY value
            // We are using Math.max to make sure that the element is not rendered outside the screen
            return (int) Math.max(0.0, Math.min(this.diffY, getMaxHeight()));
        } else if (this.alignmentY == Alignment.MIDDLE) {
            // If the element is in the middle of the screen, we just subtract the diffY value from the middle of the screen
            return (int) (getMaxHeight() / 2F - diffY);
        }

        // If the element is at the bottom of the screen, we calculate the delta between the bottom of the screen and the diffY value
        final int deltaY = (int) (getMaxHeight() - this.diffY);

        // We are using Math.max to make sure that the element is not rendered outside the screen
        return Math.max(0, (deltaY + this.getHeight() > getMaxHeight()) ? (getMaxHeight() - this.getHeight()) : deltaY);
    }

    public void setY(final float y) {
        // If the y value is between 25% and 75% of the screen, we set the alignment to middle
        // The diffY value is calculated by subtracting the y value from the middle of the screen
        if (y > (getMaxHeight() * 25F / 100) && y < (getMaxHeight() * 75F / 100)) {
            alignmentY = Alignment.MIDDLE;
            diffY = getMaxHeight() / 2F - y;
            return;
        }
        // If the y value is bigger than half of the screen, we set the alignment to bottom otherwise to top
        this.alignmentY = ((y >= getMaxHeight() / 2.0) ? Alignment.BOTTOM : Alignment.TOP);
        if (this.alignmentY == Alignment.TOP) {
            this.diffY = y; // If the element is at the top of the screen, we can just set the diffY value to the y value
        } else {
            this.diffY = getMaxHeight() - y; // Otherwise we calculate the delta between the bottom of the screen and the y value
        }
    }

    public float getDiffX() {
        return diffX;
    }

    public float getDiffY() {
        return diffY;
    }

    public Alignment getAlignmentX() {
        return alignmentX;
    }

    public Alignment getAlignmentY() {
        return alignmentY;
    }

}
