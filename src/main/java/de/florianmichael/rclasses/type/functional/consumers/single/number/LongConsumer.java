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
public interface LongConsumer extends Consumer<Long> {
    void acceptLong(final long value);

    @Deprecated
    default @Override void accept(final Long value) {
        this.acceptLong(value);
    }

    default LongConsumer andThenLong(final LongConsumer after) {
        return (value) -> {
            this.acceptLong(value);
            after.acceptLong(value);
        };
    }

    @Deprecated
    default @Override Consumer<Long> andThen(final Consumer<? super Long> after) {
        return (value) -> {
            this.acceptLong(value);
            after.accept(value);
        };
    }
}
