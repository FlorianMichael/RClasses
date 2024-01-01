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

package de.florianmichael.rclasses.functional.consumers.primitives.bi;

import java.util.function.BiConsumer;

/**
 * A functional interface for a {@link BiConsumer} with two primitive byte parameters.
 */
@FunctionalInterface
public interface Byte2ByteBiConsumer extends BiConsumer<Byte, Byte> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptByte(final byte left, final byte right);

    @Deprecated
    @Override
    default void accept(final Byte left, final Byte right) {
        this.acceptByte(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Byte2ByteBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Byte2ByteBiConsumer andThenByte(final Byte2ByteBiConsumer after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.acceptByte(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Byte, Byte> andThen(final BiConsumer<? super Byte, ? super Byte> after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.accept(l, r);
        };
    }
}
