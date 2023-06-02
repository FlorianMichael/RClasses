/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// From: https://github.com/lumii500pg/Needle (License: UNLICENSE, time: 26/05)
package de.florianmichael.rclasses.type.evicting;

import java.util.Collections;
import java.util.Map;

public final class EvictingMap<K, V> {
    private final Map<K, V> map;

    private final int maxSize;

    EvictingMap() {
        this(Collections.emptyMap(), 0);
    }

    public EvictingMap(final Map<K, V> map, final int maxSize) {
        this.map = map;
        this.maxSize = maxSize;
    }

    public @SuppressWarnings("all") boolean put(final K key, final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.map.remove(this.map.keySet().toArray()[0]);
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.map.put(key, value);
        return removedFirstEntry;
    }

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
