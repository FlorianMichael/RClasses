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

package de.florianmichael.rclasses.storage.type;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

public abstract class SelectableNamedStorage<T extends IName> extends NamedStorage<T> implements IName {
    public SelectableNamedStorage() {
        this(CopyOnWriteArrayList::new);
    }

    public SelectableNamedStorage(final Supplier<List<T>> list) {
        super(list);
    }

    private T current;

    public abstract T getDefault();

    public T getCurrent() {
        if (current == null) setCurrent(getDefault());
        return current;
    }

    public void setCurrent(final T current) {
        this.current = current;
    }

    public void setCurrentByName(final String name) {
        setCurrent(getList().stream().filter(t -> t.getName().equals(name)).findFirst().orElse(null));
    }
}
