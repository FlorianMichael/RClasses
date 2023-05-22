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
public interface Obj2FloatBiConsumer<V> extends BiConsumer<V, Float> {
    void acceptFloat(final V left, final float right);

    @Deprecated
    default @Override void accept(final V left, final Float right) {
        this.acceptFloat(left, right);
    }

    default Obj2FloatBiConsumer<V> andThenFloat(final Obj2FloatBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.acceptFloat(l, r);
        };
    }

    @Deprecated
    default @Override BiConsumer<V, Float> andThen(final BiConsumer<? super V, ? super Float> after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.accept(l, r);
        };
    }
}
