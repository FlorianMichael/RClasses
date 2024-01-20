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

package de.florianmichael.rclasses.pattern.evicting;

import java.util.Collections;
import java.util.Set;

/**
 * Implementation of an evicting set. This set will remove the first entry if the set is full.
 *
 * @param <V> The type of the set.
 */
public class EvictingSet<V> {

    private final Set<V> set;
    private final int maxSize;

    /**
     * Dummy constructor.
     */
    public EvictingSet() {
        this(Collections.emptySet(), 0);
    }

    /**
     * Creates a new evicting set.
     *
     * @param set     The set.
     * @param maxSize The maximum size of the set.
     */
    public EvictingSet(final Set<V> set, final int maxSize) {
        this.set = set;
        this.maxSize = maxSize;
    }

    /**
     * Adds a value to the set. If the set is full, the first entry will be removed. Returns true if the set was full.
     *
     * @param value The value to add.
     * @return True if the set was full.
     */
    public @SuppressWarnings("all") boolean add(final V value) {
        final boolean full = this.set.size() >= this.maxSize;
        if (full) {
            this.set.remove(this.set.toArray()[0]);
        }
        this.set.add(value);
        return full;
    }

    /**
     * @return True if the set is full.
     */
    public boolean isFull() {
        return this.set.size() >= this.maxSize;
    }

    public Set<V> getNormalSet() {
        return this.set;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

}
