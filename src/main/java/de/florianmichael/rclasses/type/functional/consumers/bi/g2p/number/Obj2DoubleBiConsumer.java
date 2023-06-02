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

package de.florianmichael.rclasses.type.functional.consumers.bi.g2p.number;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Obj2DoubleBiConsumer<V> extends BiConsumer<V, Double> {
    void acceptDouble(final V left, final double right);

    @Deprecated
    @Override
    default void accept(final V left, final Double right) {
        this.acceptDouble(left, right);
    }

    default Obj2DoubleBiConsumer<V> andThenDouble(final Obj2DoubleBiConsumer<V> after) {
        return (l, r) -> {
            this.acceptDouble(l, r);
            after.acceptDouble(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<V, Double> andThen(final BiConsumer<? super V, ? super Double> after) {
        return (l, r) -> {
            this.acceptDouble(l, r);
            after.accept(l, r);
        };
    }
}
