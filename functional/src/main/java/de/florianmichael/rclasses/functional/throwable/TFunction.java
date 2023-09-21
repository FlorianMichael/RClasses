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
 * This is a functional interface that can be used to replace Function and throw exceptions.
 *
 * @param <T> The argument type
 * @param <R> The return type
 */
@FunctionalInterface
public interface TFunction<T, R> {

    /**
     * Applies this function to the given argument and throws an exception.
     *
     * @param t          The argument
     * @return           The return value
     * @throws Throwable The exception
     */
    R apply(T t) throws Throwable;

    /**
     * @param before The operation to perform before this operation
     * @return       A composed {@code TFunction} that performs in sequence the {@code before} operation followed by this operation
     * @param <V>    The argument type of the {@code before} function, and of the composed function
     */
    default <V> TFunction<V, R> compose(TFunction<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    /**
     * @param after The operation to perform after this operation
     * @return      A composed {@code TFunction} that performs in sequence this operation followed by the {@code after}
     * @param <V>   The return type of the {@code after} function, and of the composed function
     */
    default <V> TFunction<T, V> andThen(TFunction<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    /**
     * @return A function that always returns its input argument.
     * @param <T> The argument type
     */
    static <T> TFunction<T, T> identity() {
        return t -> t;
    }
}
