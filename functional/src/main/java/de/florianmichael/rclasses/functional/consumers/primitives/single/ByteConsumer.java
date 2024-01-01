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

package de.florianmichael.rclasses.functional.consumers.primitives.single;

import java.util.function.Consumer;

/**
 * A functional interface for a {@link Consumer} with a primitive byte parameter.
 */
@FunctionalInterface
public interface ByteConsumer extends Consumer<Byte> {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     */
    void acceptByte(final byte value);

    @Deprecated
    @Override
    default void accept(final Byte value) {
        this.acceptByte(value);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link ByteConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default ByteConsumer andThenByte(final ByteConsumer after) {
        return (value) -> {
            this.acceptByte(value);
            after.acceptByte(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Byte> andThen(final Consumer<? super Byte> after) {
        return (value) -> {
            this.acceptByte(value);
            after.accept(value);
        };
    }
}
