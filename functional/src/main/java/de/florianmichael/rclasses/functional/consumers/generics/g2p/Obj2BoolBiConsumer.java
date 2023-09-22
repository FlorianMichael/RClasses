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

package de.florianmichael.rclasses.functional.consumers.generics.g2p;

import java.util.function.BiConsumer;

/**
 * A {@link BiConsumer} specialized for {@code boolean} values.
 *
 * @param <V> the type of the object argument to the operation
 */
@FunctionalInterface
public interface Obj2BoolBiConsumer<V> extends BiConsumer<V, Boolean> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptBool(final V left, final boolean right);

    @Deprecated
    @Override
    default void accept(final V left, final Boolean right) {
        this.acceptBool(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Obj2BoolBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Obj2BoolBiConsumer<V> andThenBool(final Obj2BoolBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.acceptBool(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<V, Boolean> andThen(final BiConsumer<? super V, ? super Boolean> after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.accept(l, r);
        };
    }
}
