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

package de.florianmichael.rclasses.functional.throwable;

import java.util.Objects;

/**
 * This is a functional interface that can be used to replace BiConsumer and throw exceptions.
 */
@FunctionalInterface
public interface TBiConsumer<T, U> {

    /**
     * Accepts the given arguments and throws an exception.
     *
     * @param t The first argument
     * @param u The second argument
     * @throws Throwable The exception
     */
    void accept(T t, U u) throws Throwable;

    /**
     * @param after The operation to perform after this operation
     * @return A composed {@code TBiConsumer} that performs in sequence this operation followed by the {@code after}
     */
    default TBiConsumer<T, U> andThen(TBiConsumer<? super T, ? super U> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }

}
