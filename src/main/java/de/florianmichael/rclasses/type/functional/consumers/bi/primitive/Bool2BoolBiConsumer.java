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

package de.florianmichael.rclasses.type.functional.consumers.bi.primitive;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Bool2BoolBiConsumer extends BiConsumer<Boolean, Boolean> {
    void acceptBool(final boolean left, final boolean right);

    @Deprecated
    @Override
    default void accept(final Boolean left, final Boolean right) {
        this.acceptBool(left, right);
    }

    default Bool2BoolBiConsumer andThenBool(final Bool2BoolBiConsumer after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.acceptBool(l, r);
        };
    }

    @Deprecated
    @Override
    default BiConsumer<Boolean, Boolean> andThen(final BiConsumer<? super Boolean, ? super Boolean> after) {
        return (l, r) -> {
            this.acceptBool(l, r);
            after.accept(l, r);
        };
    }
}
