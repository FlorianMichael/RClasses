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

package de.florianmichael.rclasses.functional.consumers.generics.g2p;

import java.util.function.BiConsumer;

/**
 * A functional interface for a {@link BiConsumer} with a primitive {@code long} and a generic second argument.
 *
 * @param <V> the type of the generic argument
 */
@FunctionalInterface
public interface Obj2LongBiConsumer<V> extends BiConsumer<V, Long> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptLong(final V left, final long right);

    @Deprecated
    @Override
    default void accept(final V left, final Long right) {
        this.acceptLong(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Obj2LongBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Obj2LongBiConsumer<V> andThenLong(final Obj2LongBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptLong(l, r);
            after.acceptLong(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<V, Long> andThen(final BiConsumer<? super V, ? super Long> after) {
        return (l, r) -> {
            this.acceptLong(l, r);
            after.accept(l, r);
        };
    }
}
