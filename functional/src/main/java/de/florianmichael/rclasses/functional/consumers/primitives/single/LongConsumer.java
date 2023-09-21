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

package de.florianmichael.rclasses.functional.consumers.primitives.single;

import java.util.function.Consumer;

/**
 * A primitive specialization of {@link Consumer} for {@code long}.
 */
@FunctionalInterface
public interface LongConsumer extends Consumer<Long> {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     */
    void acceptLong(final long value);

    @Deprecated
    @Override
    default void accept(final Long value) {
        this.acceptLong(value);
    }

    /**
     * @param after the operation to perform after this operation
     * @return      a composed {@link LongConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default LongConsumer andThenLong(final LongConsumer after) {
        return (value) -> {
            this.acceptLong(value);
            after.acceptLong(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Long> andThen(final Consumer<? super Long> after) {
        return (value) -> {
            this.acceptLong(value);
            after.accept(value);
        };
    }
}
