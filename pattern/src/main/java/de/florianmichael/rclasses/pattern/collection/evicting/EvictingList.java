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

// From: https://github.com/lumii500pg/Needle (License: UNLICENSE, time: 26/05)
package de.florianmichael.rclasses.pattern.collection.evicting;

import java.util.Collections;
import java.util.List;

/**
 * Implementation of an evicting list. This list will remove the first entry if the list is full.
 * @param <V> The type of the list.
 */
public final class EvictingList<V> {

    private final List<V> list;
    private final int maxSize;

    /**
     * Dummy constructor.
     */
    public EvictingList() {
        this(Collections.emptyList(), 0);
    }

    /**
     * Creates a new evicting list.
     *
     * @param list    The list.
     * @param maxSize The maximum size of the list.
     */
    public EvictingList(final List<V> list, final int maxSize) {
        this.list = list;
        this.maxSize = maxSize;
    }

    /**
     * Adds a value to the list. If the list is full, the first entry will be removed. Returns true if the list was full.
     *
     * @param value The value to add.
     * @return      True if the list was full.
     */
    public boolean add(final V value) {
        final boolean full = this.list.size() >= this.maxSize;
        if (full) {
            this.list.remove(this.list.get(0));
        }
        this.list.add(value);
        return full;
    }

    /**
     * @return True if the list is full.
     */
    public boolean isFull() {
        return this.list.size() >= this.maxSize;
    }

    public List<V> getNormalList() {
        return this.list;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
