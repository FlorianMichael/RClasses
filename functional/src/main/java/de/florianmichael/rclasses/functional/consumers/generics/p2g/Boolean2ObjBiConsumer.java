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
 * A {@link BiConsumer} specialized for primitive boolean and generic object types.
 *
 * @param <V> the type of the object argument to the operation
 */
@FunctionalInterface
public interface Boolean2ObjBiConsumer<V> extends BiConsumer<Boolean, V> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptBoolean(final boolean left, final V right);

    @Deprecated
    @Override
    default void accept(final Boolean left, final V right) {
        this.acceptBoolean(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return      a composed {@link Boolean2ObjBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Boolean2ObjBiConsumer<V> andThenBool(final Boolean2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptBoolean(l, r);
            after.acceptBoolean(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Boolean, V> andThen(final BiConsumer<? super Boolean, ? super V> after) {
        return (l, r) -> {
            this.acceptBoolean(l, r);
            after.accept(l, r);
        };
    }
}
