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
