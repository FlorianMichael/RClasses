/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
