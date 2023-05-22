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

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public abstract class Storage<T> {
    private final CopyOnWriteArrayList<T> list = new CopyOnWriteArrayList<>();

    private Consumer<T> additionConsumer;
    private Consumer<T> removeConsumer;

    public abstract void init();

    @SafeVarargs
    public final void add(T... t) {
        for (T t1 : t) insert(t1, list.size());
    }

    public void insert(T t, int index) {
        if (!list.contains(t)) {
            list.add(index, t);
            if (this.additionConsumer != null) this.additionConsumer.accept(t);
        }
    }

    @SafeVarargs
    public final void remove(T... t) {
        for (T t1 : t) {
            list.remove(t1);
            if (this.removeConsumer != null) this.removeConsumer.accept(t1);
        }
    }

    public T get(final Class<T> clazz) {
        return list.stream().filter(clazz::equals).findFirst().orElse(null);
    }

    public List<T> getList() {
        return list;
    }

    public void setAdditionConsumer(Consumer<T> additionConsumer) {
        this.additionConsumer = additionConsumer;
    }

    public void setRemoveConsumer(Consumer<T> removeConsumer) {
        this.removeConsumer = removeConsumer;
    }
}
