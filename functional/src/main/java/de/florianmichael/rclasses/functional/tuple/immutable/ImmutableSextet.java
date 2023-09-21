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

import de.florianmichael.rclasses.functional.tuple.Sextet;

import java.util.Objects;

/**
 * Represents a tuple of six elements.
 */
public final class ImmutableSextet<A, B, C, D, E, F> extends Sextet<A, B, C, D, E, F> {
    private final static UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("The object is immutable!");

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;

    public ImmutableSextet() {
        this(null, null, null, null, null, null);
    }

    public ImmutableSextet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
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
    public E getFifth() {
        return this.fifth;
    }

    @Override
    public F getSixth() {
        return this.sixth;
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
    public void setFifth(final E fifth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public void setSixth(final F sixth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public String toString() {
        return "ImmutableSextet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableSextet<?, ?, ?, ?, ?, ?> that = (ImmutableSextet<?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third) && Objects.equals(fourth, that.fourth) && Objects.equals(fifth, that.fifth) && Objects.equals(sixth, that.sixth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth);
    }
}
