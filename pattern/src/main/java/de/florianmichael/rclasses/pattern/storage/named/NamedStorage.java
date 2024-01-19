/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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
import de.florianmichael.rclasses.pattern.storage.Storage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

/**
 * Implementation of a named storage. This storage is used to store objects that implement the {@link IName} interface.
 *
 * @param <T> The type of the objects that are stored in this storage.
 */
public abstract class NamedStorage<T extends IName> extends Storage<T> {

    /**
     * Creates a new named storage with a {@link CopyOnWriteArrayList}.
     */
    public NamedStorage() {
        this(CopyOnWriteArrayList::new);
    }

    /**
     * Creates a new named storage with the given list.
     *
     * @param list The list.
     */
    public NamedStorage(final Supplier<List<T>> list) {
        super(list);
    }

    /**
     * Gets an object by its name. see {@link #getByName(String, boolean)} and {@link IName} for more information.
     *
     * @param name The name.
     * @param <V>  The type of the object.
     * @return The object.
     */
    public <V extends T> V getByName(final String name) {
        return getByName(name, false);
    }

    /**
     * Gets an object by its name. see {@link #getByName(String)} and {@link IName} for more information.
     *
     * @param name       The name.
     * @param ignoreCase Whether the case should be ignored.
     * @param <V>        The type of the object.
     * @return The object.
     */
    @SuppressWarnings("unchecked")
    public <V extends T> V getByName(final String name, final boolean ignoreCase) {
        return (V) this.getList().stream().filter(t -> ignoreCase ? t.getName().equals(name) : t.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

}
