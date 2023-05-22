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

import de.florianmichael.rclasses.math.MathUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class Storage<T> {
    private final List<T> list;
    private Consumer<T> addConsumer, removeConsumer;

    public Storage() {
        this(CopyOnWriteArrayList::new);
    }

    public Storage(final Supplier<List<T>> list) {
        this.list = list.get();
    }

    public abstract void init();

    @SafeVarargs
    public final void add(final T... t) {
        for (T t1 : t) addBy(t1, list.size());
    }

    @SafeVarargs
    public final void remove(T... t) {
        for (T t1 : t) {
            this.list.remove(t1);
            if (this.removeConsumer != null) this.removeConsumer.accept(t1);
        }
    }

    public void addBy(final T t, final int index) {
        if (list.contains(t)) return;
        this.list.add(MathUtils.clamp(index, 0, this.list.size()), t);
        if (this.addConsumer != null) this.addConsumer.accept(t);
    }

    public void insert(final T t, int index) {
        index = MathUtils.clamp(index, 0, this.list.size());
        this.removeConsumer.accept(this.list.get(index));
        this.list.set(index, t);
        this.addConsumer.accept(this.list.get(index));
    }

    public void removeBy(final int index) {
        this.list.remove(MathUtils.clamp(index, 0, this.list.size()));
    }

    @SuppressWarnings("unchecked")
    public <V extends T> V getByClass(final Class<V> clazz) {
        return (V) this.list.stream().filter(clazz::equals).findFirst().orElse(null);
    }

    public List<T> getList() {
        return this.list;
    }

    public void setAddConsumer(final Consumer<T> addConsumer) {
        this.addConsumer = addConsumer;
    }

    public void setRemoveConsumer(final Consumer<T> removeConsumer) {
        this.removeConsumer = removeConsumer;
    }
}
