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

package de.florianmichael.rclasses.type.functional.consumers.single.number;

import java.util.function.Consumer;

@FunctionalInterface
public interface ShortConsumer extends Consumer<Short> {
    void acceptShort(final short value);

    @Deprecated
    @Override
    default void accept(final Short value) {
        this.acceptShort(value);
    }

    default ShortConsumer andThenShort(final ShortConsumer after) {
        return (value) -> {
            this.acceptShort(value);
            after.acceptShort(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Short> andThen(final Consumer<? super Short> after) {
        return (value) -> {
            this.acceptShort(value);
            after.accept(value);
        };
    }
}
