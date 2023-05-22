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
public interface Obj2CharBiConsumer<V> extends BiConsumer<V, Character> {
    void acceptChar(final V left, final char right);

    @Deprecated
    default @Override void accept(final V left, final Character right) {
        this.acceptChar(left, right);
    }

    default Obj2CharBiConsumer<V> andThenChar(final Obj2CharBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptChar(l, r);
            after.acceptChar(l, r);
        };
    }

    @Deprecated
    default @Override BiConsumer<V, Character> andThen(final BiConsumer<? super V, ? super Character> after) {
        return (l, r) -> {
            this.acceptChar(l, r);
            after.accept(l, r);
        };
    }
}
