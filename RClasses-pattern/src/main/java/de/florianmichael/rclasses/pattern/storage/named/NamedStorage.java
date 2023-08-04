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

package de.florianmichael.rclasses.pattern.storage.named;

import de.florianmichael.rclasses.pattern.IName;
import de.florianmichael.rclasses.pattern.storage.Storage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

public abstract class NamedStorage<T extends IName> extends Storage<T> {
    public NamedStorage() {
        this(CopyOnWriteArrayList::new);
    }

    public NamedStorage(final Supplier<List<T>> list) {
        super(list);
    }

    public <V extends T> V getByName(final String name) {
        return getByName(name, false);
    }

    @SuppressWarnings("unchecked")
    public <V extends T> V getByName(final String name, final boolean ignoreCase) {
        return (V) this.getList().stream().filter(t -> ignoreCase ? t.getName().equals(name) : t.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
