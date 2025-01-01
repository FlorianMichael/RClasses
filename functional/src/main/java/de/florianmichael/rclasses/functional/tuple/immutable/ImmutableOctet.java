/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.functional.tuple.immutable;

import de.florianmichael.rclasses.functional.tuple.Octet;

import java.util.Objects;

/**
 * Represents a tuple of eight elements.
 */
public class ImmutableOctet<A, B, C, D, E, F, G, H> extends Octet<A, B, C, D, E, F, G, H> {

    private static final UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("The object is immutable!");

    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;
    private final H eight;

    public ImmutableOctet() {
        this(null, null, null, null, null, null, null, null);
    }

    public ImmutableOctet(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh, final H eight) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eight = eight;
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
    public G getSeventh() {
        return this.seventh;
    }

    @Override
    public H getEight() {
        return this.eight;
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
    public void setSeventh(final G seventh) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public void setEight(final H eight) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public String toString() {
        return "ImmutableOctet{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                ", seventh=" + seventh +
                ", eight=" + eight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableOctet<?, ?, ?, ?, ?, ?, ?, ?> that = (ImmutableOctet<?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third) && Objects.equals(fourth, that.fourth) && Objects.equals(fifth, that.fifth) && Objects.equals(sixth, that.sixth) && Objects.equals(seventh, that.seventh) && Objects.equals(eight, that.eight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth, seventh, eight);
    }

}
