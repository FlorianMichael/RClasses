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
public interface Float2FloatBiConsumer extends BiConsumer<Float, Float> {
    void acceptFloat(final float left, final float right);

    @Deprecated
    @Override
    default void accept(final Float left, final Float right) {
        this.acceptFloat(left, right);
    }

    default Float2FloatBiConsumer andThenFloat(final Float2FloatBiConsumer after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.acceptFloat(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Float, Float> andThen(final BiConsumer<? super Float, ? super Float> after) {
        return (l, r) -> {
            this.acceptFloat(l, r);
            after.accept(l, r);
        };
    }
}
