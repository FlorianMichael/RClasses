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

package de.florianmichael.rclasses.functional.tuple.mutable;

import de.florianmichael.rclasses.functional.tuple.Triplet;

import java.util.Objects;

/**
 * Represents a mutable tuple of three elements.
 */
public final class MutableTriplet<A, B, C> extends Triplet<A, B, C> {

    private A first;
    private B second;
    private C third;

    public MutableTriplet() {
        this(null, null, null);
    }

    public MutableTriplet(final A first, final B second, final C third) {
        this.first = first;
        this.second = second;
        this.third = third;
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
    public void setFirst(final A first) {
        this.first = first;
    }

    @Override
    public void setSecond(final B second) {
        this.second = second;
    }

    @Override
    public void setThird(final C third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "MutableTriplet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableTriplet<?, ?, ?> that = (MutableTriplet<?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }
}
