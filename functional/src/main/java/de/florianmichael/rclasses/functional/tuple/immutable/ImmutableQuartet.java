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

import de.florianmichael.rclasses.functional.tuple.Quartet;

import java.util.Objects;

/**
 * Represents a tuple of four elements.
 */
public final class ImmutableQuartet<A, B, C, D> extends Quartet<A, B, C, D> {
    private final static UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("The object is immutable!");

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;

    public ImmutableQuartet() {
        this(null, null, null, null);
    }

    public ImmutableQuartet(final A first, final B second, final C third, final D fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    @Override
    public A getFirst() {
        return this.first;
    }

    @Override
    public B getSecond() {
        return this.second;
    }

    @Override
    public C getThird() {
        return this.third;
    }

    @Override
    public D getFourth() {
        return this.fourth;
    }

    @Override
    public void setFirst(final A first) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public void setSecond(final B second) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public void setThird(final C third) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public void setFourth(final D fourth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public String toString() {
        return "ImmutableQuartet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableQuartet<?, ?, ?, ?> that = (ImmutableQuartet<?, ?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third) && Objects.equals(fourth, that.fourth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth);
    }
}