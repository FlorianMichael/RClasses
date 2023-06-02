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
import java.util.List;

public final class EvictingList<V> {
    private final List<V> list;

    private final int maxSize;

    EvictingList() {
        this(Collections.emptyList(), 0);
    }

    public EvictingList(final List<V> list, final int maxSize) {
        this.list = list;
        this.maxSize = maxSize;
    }

    public boolean add(final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.list.remove(this.list.get(0));
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.list.add(value);
        return removedFirstEntry;
    }

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
