/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.florianmichael.rclasses.type.functional.consumers.single.number;

import java.util.function.Consumer;

@FunctionalInterface
public interface DoubleConsumer extends Consumer<Double> {
    void acceptDouble(final double value);

    @Deprecated
    @Override
    default void accept(final Double value) {
        this.acceptDouble(value);
    }

    default DoubleConsumer andThenDouble(final DoubleConsumer after) {
        return (value) -> {
            this.acceptDouble(value);
            after.acceptDouble(value);
        };
    }

    @Deprecated
    @Override
    default Consumer<Double> andThen(final Consumer<? super Double> after) {
        return (value) -> {
            this.acceptDouble(value);
            after.accept(value);
        };
    }
}
