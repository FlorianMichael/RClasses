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

package de.florianmichael.rclasses.pattern.evicting;

import java.util.Collection;
import java.util.Collections;

/**
 * Implementation of an evicting collection. This collection will remove the first entry if the collection is full.
 *
 * @param <V> The type of the collection.
 */
public final class EvictingCollection<V> {

    private final Collection<V> collection;
    private final int maxSize;

    /**
     * Dummy constructor.
     */
    public EvictingCollection() {
        this(Collections.emptyList(), 0);
    }

    /**
     * Creates a new evicting collection.
     *
     * @param collection The collection.
     * @param maxSize    The maximum size of the collection.
     */
    public EvictingCollection(final Collection<V> collection, final int maxSize) {
        this.collection = collection;
        this.maxSize = maxSize;
    }

    /**
     * Adds a value to the collection. If the collection is full, the first entry will be removed. Returns true if the collection was full.
     *
     * @param value The value to add.
     * @return True if the collection was full.
     */
    public @SuppressWarnings("all") boolean add(final V value) {
        final boolean full = this.collection.size() >= this.maxSize;
        if (full) {
            this.collection.remove(this.collection.iterator().next());
        }
        this.collection.add(value);
        return full;
    }

    /**
     * @return True if the collection is full.
     */
    public boolean isFull() {
        return this.collection.size() >= this.maxSize;
    }

    public Collection<V> getNormalCollection() {
        return this.collection;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
