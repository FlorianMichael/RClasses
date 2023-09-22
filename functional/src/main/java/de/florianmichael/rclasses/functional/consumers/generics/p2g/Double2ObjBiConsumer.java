/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
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

package de.florianmichael.rclasses.functional.consumers.generics.p2g;

import java.util.function.BiConsumer;

/**
 * A generic {@link BiConsumer} that takes a primitive {@code double} and an object.
 *
 * @param <V> the type of the object argument to the operation
 */
@FunctionalInterface
public interface Double2ObjBiConsumer<V> extends BiConsumer<Double, V> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptDouble(final double left, final V right);

    @Deprecated
    @Override
    default void accept(final Double left, final V right) {
        this.acceptDouble(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Double2ObjBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Double2ObjBiConsumer<V> andThenDouble(final Double2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptDouble(l, r);
            after.acceptDouble(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Double, V> andThen(final BiConsumer<? super Double, ? super V> after) {
        return (l, r) -> {
            this.acceptDouble(l, r);
            after.accept(l, r);
        };
    }
}
