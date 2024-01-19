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
import java.util.Map;

/**
 * Implementation of an evicting map. This map will remove the first entry if the map is full.
 *
 * @param <K> The type of the key.
 * @param <V> The type of the value.
 */
public final class EvictingMap<K, V> {

    private final Map<K, V> map;
    private final int maxSize;

    /**
     * Dummy constructor.
     */
    public EvictingMap() {
        this(Collections.emptyMap(), 0);
    }

    /**
     * Creates a new evicting map.
     *
     * @param map     The map.
     * @param maxSize The maximum size of the map.
     */
    public EvictingMap(final Map<K, V> map, final int maxSize) {
        this.map = map;
        this.maxSize = maxSize;
    }

    /**
     * Puts a key and a value into the map. If the map is full, the first entry will be removed. Returns true if the map was full.
     *
     * @param key   The key.
     * @param value The value.
     * @return True if the map was full.
     */
    public @SuppressWarnings("all") boolean put(final K key, final V value) {
        final boolean full = this.map.size() >= this.maxSize;
        if (full) {
            this.map.remove(this.map.keySet().toArray()[0]);
        }
        this.map.put(key, value);
        return full;
    }

    /**
     * @return True if the map is full.
     */
    public boolean isFull() {
        return this.map.size() >= this.maxSize;
    }

    public Map<K, V> getNormalMap() {
        return this.map;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

}
