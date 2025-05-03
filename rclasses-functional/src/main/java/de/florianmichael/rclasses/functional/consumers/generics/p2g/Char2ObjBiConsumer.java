/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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
 * A functional interface for a BiConsumer that takes a char and an object.
 *
 * @param <V> the type of the object
 */
@FunctionalInterface
public interface Char2ObjBiConsumer<V> extends BiConsumer<Character, V> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptChar(final char left, final V right);

    @Deprecated
    @Override
    default void accept(final Character left, final V right) {
        this.acceptChar(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Char2ObjBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Char2ObjBiConsumer<V> andThenChar(final Char2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptChar(l, r);
            after.acceptChar(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Character, V> andThen(final BiConsumer<? super Character, ? super V> after) {
        return (l, r) -> {
            this.acceptChar(l, r);
            after.accept(l, r);
        };
    }

}
