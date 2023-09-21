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
 * This is a functional interface that can be used to replace BiFunction and throw exceptions.
 *
 * @param <T> The first argument type
 * @param <U> The second argument type
 * @param <R> The return type
 */
@FunctionalInterface
public interface TBiFunction<T, U, R> {

    /**
     * Applies this function to the given arguments and throws an exception.
     *
     * @param t          The first argument
     * @param u          The second argument
     * @return           The return value
     * @throws Throwable The exception
     */
    R apply(T t, U u) throws Throwable;

    /**
     * @param after      The operation to perform after this operation
     * @return           A composed {@code TBiFunction} that performs in sequence this operation followed by the {@code after}
     * @param <V>        The return type of the {@code after} function, and of the composed function
     * @throws Throwable The exception
     */
    default <V> TBiFunction<T, U, V> andThen(TFunction<? super R, ? extends V> after) throws Throwable {
        Objects.requireNonNull(after);
        return (T t, U u) -> after.apply(apply(t, u));
    }
}
