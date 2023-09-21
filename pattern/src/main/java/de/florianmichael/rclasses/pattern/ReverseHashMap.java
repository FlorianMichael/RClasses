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

package de.florianmichael.rclasses.pattern;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implementation of a reverse hash map. This map is able to get the key of a given value.
 *
 * @param <K> The key type.
 * @param <V> The value type.
 */
public class ReverseHashMap<K, V> extends LinkedHashMap<K, V> {

    /**
     * The reversed map.
     */
    private final Map<V, K> reversedMap = new LinkedHashMap<>();

    /**
     * Puts a key and a value into the map. The value will be also put into the reversed map.
     *
     * @param key   The key.
     * @param value The value.
     * @return      The value.
     */
    @Override
    public V put(K key, V value) {
        this.reversedMap.put(value, key);
        return super.put(key, value);
    }

    /**
     * @param value The value.
     * @return      The key of the given value.
     */
    public K getKey(final V value) {
        if (!this.reversedMap.containsKey(value))
            return null;
        return this.reversedMap.get(value);
    }
}
