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

package de.florianmichael.rclasses.functional.throwable;

import java.util.Objects;

/**
 * This is a functional interface that can be used to replace Consumer<T> and throw exceptions.
 *
 * @param <T> The argument type
 */
@FunctionalInterface
public interface TConsumer<T> {

    /**
     * Accepts the given argument and throws an exception.
     *
     * @param t          The argument
     * @throws Throwable The exception
     */
    void accept(T t) throws Throwable;

    /**
     * @param after The operation to perform after this operation
     * @return      A composed {@code TConsumer} that performs in sequence this operation followed by the {@code after}
     */
    default TConsumer<T> andThen(TConsumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
