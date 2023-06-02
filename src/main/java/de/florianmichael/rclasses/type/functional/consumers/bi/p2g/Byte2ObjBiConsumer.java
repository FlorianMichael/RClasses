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

package de.florianmichael.rclasses.type.functional.consumers.bi.p2g;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Byte2ObjBiConsumer<V> extends BiConsumer<Byte, V> {
    void acceptByte(final byte left, final V right);

    @Deprecated
    @Override
    default void accept(final Byte left, final V right) {
        this.acceptByte(left, right);
    }

    default Byte2ObjBiConsumer<V> andThenByte(final Byte2ObjBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.acceptByte(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Byte, V> andThen(final BiConsumer<? super Byte, ? super V> after) {
        return (l, r) -> {
            this.acceptByte(l, r);
            after.accept(l, r);
        };
    }
}
