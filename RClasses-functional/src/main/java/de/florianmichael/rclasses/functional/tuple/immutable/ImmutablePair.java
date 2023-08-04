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

package de.florianmichael.rclasses.functional.tuple.immutable;

import de.florianmichael.rclasses.type.tuple.Pair;

public final class ImmutablePair<A, B> extends Pair<A, B> {
    private static final UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("immutable pair-values aren't re-assignable!");

    private final A first;
    private final B second;

    ImmutablePair() {
        this(null, null);
    }

    public ImmutablePair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public A getFirst() {
        return this.first;
    }

    @Override
    public void setFirst(final A first) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public B getSecond() {
        return this.second;
    }

    @Override
    public void setSecond(final B second) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutablePair{first=%s, second=%s}",
                this.getFirst(),
                this.getSecond()
        );
    }
}
