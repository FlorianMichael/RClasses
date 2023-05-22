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

package de.florianmichael.rclasses.type.functional.consumers.bi.p2g;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Bool2ObjBiConsumer<V> extends BiConsumer<Boolean, V> {
    void acceptBool(final boolean left, final V right);

    @Deprecated
    default @Override void accept(final Boolean left, final V right) {
        this.acceptBool(left, right);
    }

    default Bool2ObjBiConsumer<V> andThenBool(final Bool2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.acceptBool(l, r);
        };
    }

    @Deprecated
    default @Override BiConsumer<Boolean, V> andThen(final BiConsumer<? super Boolean, ? super V> after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.accept(l, r);
        };
    }
}