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

package de.florianmichael.rclasses.functional.consumers.single.number;

import java.util.function.Consumer;

@FunctionalInterface
public interface IntConsumer extends Consumer<Integer> {
    void acceptInt(final int value);

    @Deprecated
    @Override
    default void accept(final Integer value) {
        this.acceptInt(value);
    }

    default IntConsumer andThenInt(final IntConsumer after) {
        return (value) -> {
            this.acceptInt(value);
            after.acceptInt(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Integer> andThen(final Consumer<? super Integer> after) {
        return (value) -> {
            this.acceptInt(value);
            after.accept(value);
        };
    }
}
