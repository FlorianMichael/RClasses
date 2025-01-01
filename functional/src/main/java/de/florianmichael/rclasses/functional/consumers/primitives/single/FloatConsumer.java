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

package de.florianmichael.rclasses.functional.consumers.primitives.single;

import java.util.function.Consumer;

/**
 * A primitive specialization of {@link Consumer} for {@code float}.
 */
@FunctionalInterface
public interface FloatConsumer extends Consumer<Float> {

    /**
     * Performs this operation on the given argument.
     *
     * @param value the input argument
     */
    void acceptFloat(final float value);

    @Deprecated
    @Override
    default void accept(final Float value) {
        this.acceptFloat(value);
    }

    /**
     * @param after the operation to perform after this operation
     * @return a composed {@link FloatConsumer} that performs in sequence this operation followed by the {@code after} operation
     */
    default FloatConsumer andThenFloat(final FloatConsumer after) {
        return (value) -> {
            this.acceptFloat(value);
            after.acceptFloat(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Float> andThen(final Consumer<? super Float> after) {
        return (value) -> {
            this.acceptFloat(value);
            after.accept(value);
        };
    }

}
