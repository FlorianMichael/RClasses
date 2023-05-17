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

package de.florianmichael.rclasses.storage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Storage<T> {
    private final List<T> list = new CopyOnWriteArrayList<>();

    public abstract void init();

    @SafeVarargs
    public final void add(T... t) {
        for (T t1 : t) insert(t1, list.size());
    }

    public void insert(T t, int index) {
        if (!list.contains(t)) list.add(index, t);
    }

    @SafeVarargs
    public final void remove(T... t) {
        list.removeAll(Arrays.stream(t).toList());
    }

    public T get(final Class<T> clazz) {
        return list.stream().filter(t -> t.getClass() == clazz).findFirst().orElse(null);
    }

    public List<T> getList() {
        return list;
    }
}
