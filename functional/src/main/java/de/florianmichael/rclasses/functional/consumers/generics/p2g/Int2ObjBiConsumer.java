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
 * A functional interface for a BiConsumer that takes an int and an object.
 *
 * @param <V> the type of the object
 */
@FunctionalInterface
public interface Int2ObjBiConsumer<V> extends BiConsumer<Integer, V> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptInt(final int left, final V right);

    @Deprecated
    @Override
    default void accept(final Integer left, final V right) {
        this.acceptInt(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return      a composed {@link Int2ObjBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Int2ObjBiConsumer<V> andThenInt(final Int2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptInt(l, r);
            after.acceptInt(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Integer, V> andThen(final BiConsumer<? super Integer, ? super V> after) {
        return (l, r) -> {
            this.acceptInt(l, r);
            after.accept(l, r);
        };
    }
}
