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

package de.florianmichael.rclasses.math.concept;

/**
 * A simple timer class.
 */
public class MSTimer {
    /**
     * The time in milliseconds.
     */
    private long time = System.currentTimeMillis();

    /**
     * Whether the timer is paused or not.
     */
    private boolean paused = false;

    /**
     * The time the timer was paused.
     */
    private long pausedTime = 0L;

    /**
     * Pauses the timer.
     */
    public void pause() {
        if (paused) return;
        pausedTime = getDelta();
        paused = true;
    }

    /**
     * Resumes the timer.
     */
    public void resume() {
        if (!paused) return;
        paused = false;
        pausedTime = 0L;
    }

    /**
     * Resets the timer.
     */
    public void reset() {
        time = System.currentTimeMillis();
    }

    /**
     * @param delay The delay to check.
     * @return Whether the timer has reached the given delay.
     */
    public boolean hasReached(final long delay) {
        return getDelta() >= delay;
    }

    /**
     * @param delay The delay to check.
     * @param reset Whether the timer should be reset after the check.
     * @return Whether the timer has reached the given delay.
     */
    public boolean hasReached(final long delay, final boolean reset) {
        final boolean flag = getDelta() >= delay;
        if (reset) reset();

        return flag;
    }

    /**
     * @return The delta time in milliseconds.
     */
    public long getDelta() {
        return System.currentTimeMillis() - getTime();
    }

    /**
     * @return The time in milliseconds. If the timer is paused, the paused time is returned.
     */
    public long getTime() {
        return paused ? pausedTime : time;
    }

    public void setTime(final long time) {
        this.time = time;
    }
}
