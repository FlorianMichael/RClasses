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

package de.florianmichael.rclasses.type.functional.consumers.bi.g2p;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Obj2ByteBiConsumer<V> extends BiConsumer<V, Byte> {
    void acceptByte(final V left, final byte right);

    @Deprecated
    @Override
    default void accept(final V left, final Byte right) {
        this.acceptByte(left, right);
    }

    default Obj2ByteBiConsumer<V> andThenByte(final Obj2ByteBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.acceptByte(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<V, Byte> andThen(final BiConsumer<? super V, ? super Byte> after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.accept(l, r);
        };
    }
}
