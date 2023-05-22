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

package de.florianmichael.rclasses.storage.type;

import de.florianmichael.rclasses.storage.Storage;

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

    @SuppressWarnings("unchecked")
    public <V extends T> V getByName(final String name) {
        return (V) this.getList().stream().filter(t -> t.getName().equals(name)).findFirst().orElse(null);
    }
}
