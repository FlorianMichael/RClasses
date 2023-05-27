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
import java.util.Set;

public final class EvictingSet<V> {
    private final Set<V> set;

    private final int maxSize;

    EvictingSet() {
        this(Collections.emptySet(), 0);
    }

    public EvictingSet(final Set<V> set, final int maxSize) {
        this.set = set;
        this.maxSize = maxSize;
    }

    public @SuppressWarnings("all") boolean add(final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.set.remove(this.set.toArray()[0]);
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.set.add(value);
        return removedFirstEntry;
    }

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
