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

import de.florianmichael.rclasses.pattern.functional.IName;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

/**
 * Implementation of a named selectable storage. This storage is used to store objects that implement the {@link IName} interface.
 * It also has a current object that can be set and retrieved. The current object is used for example to get the default object.
 *
 * @param <T> The type of the objects that are stored in this storage.
 */
public abstract class SelectableNamedStorage<T extends IName> extends NamedStorage<T> implements IName {

    /**
     * Creates a new named storage with a {@link CopyOnWriteArrayList}.
     */
    public SelectableNamedStorage() {
        this(CopyOnWriteArrayList::new);
    }

    /**
     * Creates a new named storage with the given list.
     *
     * @param list The list.
     */
    public SelectableNamedStorage(final Supplier<List<T>> list) {
        super(list);
    }

    /**
     * The current object.
     */
    private T current;

    /**
     * Gets the default object. This is the object that is returned when {@link #getCurrent()} is called and the current object is null.
     *
     * @return The default object.
     */
    public abstract T getDefault();

    /**
     * Gets the current object. If the current object is null, the default object is returned.
     *
     * @return The current object.
     */
    public T getCurrent() {
        if (current == null) setCurrent(getDefault());
        return current;
    }

    public void setCurrent(final T current) {
        this.current = current;
    }

    /**
     * Sets the current object by its name.
     *
     * @param name The name.
     */
    public void setCurrentByName(final String name) {
        setCurrent(getList().stream().filter(t -> t.getName().equals(name)).findFirst().orElse(null));
    }
}
