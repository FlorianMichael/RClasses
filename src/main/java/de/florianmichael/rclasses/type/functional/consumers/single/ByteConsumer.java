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

package de.florianmichael.rclasses.type.functional.consumers.single;

import java.util.function.Consumer;

@FunctionalInterface
public interface ByteConsumer extends Consumer<Byte> {
    void acceptByte(final byte value);

    @Deprecated
    default @Override void accept(final Byte value) {
        this.acceptByte(value);
    }

    default ByteConsumer andThenByte(final ByteConsumer after) {
        return (value) -> {
            this.acceptByte(value);
            after.acceptByte(value);
        };
    }

    @Deprecated
    default @Override Consumer<Byte> andThen(final Consumer<? super Byte> after) {
        return (value) -> {
            this.acceptByte(value);
            after.accept(value);
        };
    }
}
