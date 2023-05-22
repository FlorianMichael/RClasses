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

package de.florianmichael.rclasses.type.functional.consumers.bi.g2p.number;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Obj2ShortBiConsumer<V> extends BiConsumer<V, Short> {
    void acceptShort(final V left, final short right);

    @Deprecated
    default @Override void accept(final V left, final Short right) {
        this.acceptShort(left, right);
    }

    default Obj2ShortBiConsumer<V> andThenShort(final Obj2ShortBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.acceptShort(l, r);
        };
    }

    @Deprecated
    default @Override BiConsumer<V, Short> andThen(final BiConsumer<? super V, ? super Short> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.accept(l, r);
        };
    }
}
