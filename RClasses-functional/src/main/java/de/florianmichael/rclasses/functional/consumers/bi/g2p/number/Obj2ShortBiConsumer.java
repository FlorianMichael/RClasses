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

package de.florianmichael.rclasses.functional.consumers.bi.g2p.number;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Obj2ShortBiConsumer<V> extends BiConsumer<V, Short> {
    void acceptShort(final V left, final short right);

    @Deprecated
    @Override
    default void accept(final V left, final Short right) {
        this.acceptShort(left, right);
    }

    default Obj2ShortBiConsumer<V> andThenShort(final Obj2ShortBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.acceptShort(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<V, Short> andThen(final BiConsumer<? super V, ? super Short> after) {
        return (l, r) -> {
            this.acceptShort(l, r);
            after.accept(l, r);
        };
    }
}
