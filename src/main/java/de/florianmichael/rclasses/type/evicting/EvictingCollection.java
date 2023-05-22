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

package de.florianmichael.rclasses.type.evicting;

import java.util.Collection;
import java.util.Collections;

public final class EvictingCollection<V> {
    private final Collection<V> collection;

    private final int maxSize;

    EvictingCollection() {
        this(Collections.emptyList(), 0);
    }

    public EvictingCollection(final Collection<V> collection, final int maxSize) {
        this.collection = collection;
        this.maxSize = maxSize;
    }

    public @SuppressWarnings("all") boolean add(final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.collection.remove(this.collection.iterator().next());
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.collection.add(value);
        return removedFirstEntry;
    }

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
