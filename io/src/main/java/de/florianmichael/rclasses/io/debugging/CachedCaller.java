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

package de.florianmichael.rclasses.io.debugging;

import java.util.function.Consumer;

/**
 * This class can be used to cache executions on a certain object. This is useful for example when you want to print
 * something to the console but don't want to print the same thing multiple times.
 */
public class CachedCaller {

    /**
     * A CachedCaller that calls System.out.println
     */
    public final static CachedCaller SYS_OUT = new CachedCaller(System.out::println);

    /**
     * The caller which is called when the message changes.
     */
    private final Consumer<Object> caller;

    /**
     * The last message that was called.
     */
    private Object field;

    private CachedCaller(Consumer<Object> caller) {
        this.caller = caller;
    }

    public void call(final Object field) {
        if (this.field.equals(field)) return;
        this.field = field;

        caller.accept(field);
    }

    /**
     * Creates a new CachedCaller with the given caller.
     * @param caller The caller to use
     * @return The new CachedCaller
     */
    public static CachedCaller of(final Consumer<Object> caller) {
        return new CachedCaller(caller);
    }
}
