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

package de.florianmichael.rclasses.functional.consumers.primitives.bi;

import java.util.function.BiConsumer;

/**
 * A functional interface for a {@link BiConsumer} with two primitive float parameters.
 */
@FunctionalInterface
public interface Float2FloatBiConsumer extends BiConsumer<Float, Float> {

    /**
     * Performs this operation on the given parameters.
     *
     * @param left  the first input argument
     * @param right the second input argument
     */
    void acceptFloat(final float left, final float right);

    @Deprecated
    @Override
    default void accept(final Float left, final Float right) {
        this.acceptFloat(left, right);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link Float2FloatBiConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default Float2FloatBiConsumer andThenFloat(final Float2FloatBiConsumer after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.acceptFloat(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Float, Float> andThen(final BiConsumer<? super Float, ? super Float> after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.accept(l, r);
        };
    }
}
