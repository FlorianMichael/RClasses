/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.type.functional.consumers.bi.primitive.number;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Long2LongBiConsumer extends BiConsumer<Long, Long> {
    void acceptLong(final long left, final long right);

    @Deprecated
    @Override
    default void accept(final Long left, final Long right) {
        this.acceptLong(left, right);
    }

    default Long2LongBiConsumer andThenLong(final Long2LongBiConsumer after) {
        return (l, r) -> {
            this.acceptLong(l, r);
            after.acceptLong(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Long, Long> andThen(final BiConsumer<? super Long, ? super Long> after) {
        return (l, r) -> {
            this.acceptLong(l, r);
            after.accept(l, r);
        };
    }
}
