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

package de.florianmichael.rclasses.io.debugging;

/**
 * Utility class to count calls in a certain time.
 */
public class CallCounter {

    /**
     * Default instances counting calls in a second.
     */
    public static final CallCounter INSTANCE = new CallCounter(1000);

    private final long delay;

    private int count;
    private long lastCall;

    public CallCounter(final long delay) {
        this.delay = delay;
    }

    /**
     * Counts a call. If the delay is reached, the counter is reset and the count is printed to the console {@link System#out}.
     */
    public void call() {
        if (System.currentTimeMillis() - lastCall > delay) {
            System.out.println("Reached " + count + " calls in " + delay + "ms");
            count = 0;
            lastCall = System.currentTimeMillis();
        }
        count++;
    }

    @Deprecated
    public void hello() {
        call();
    }

}
