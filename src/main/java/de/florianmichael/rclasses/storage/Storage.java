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
