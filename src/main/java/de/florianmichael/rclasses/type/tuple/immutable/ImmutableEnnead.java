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

package de.florianmichael.rclasses.type.tuple.immutable;

import de.florianmichael.rclasses.type.tuple.Ennead;

public final class ImmutableEnnead<A, B, C, D, E, F, G, H, I> extends Ennead<A, B, C, D, E, F, G, H, I> {
    private static final UnsupportedOperationException COULD_NOT_SET = new UnsupportedOperationException("immutable pair-values aren't re-assignable!");
    private final A first;
    private final B second;
    private final C third;
    private final D fourth;
    private final E fifth;
    private final F sixth;
    private final G seventh;
    private final H eight;
    private final I ninth;

    ImmutableEnnead() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ImmutableEnnead(final A first, final B second,
                           final C third, final D fourth,
                           final E fifth, final F sixth,
                           final G seventh, final H eight, final I ninth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eight = eight;
        this.ninth = ninth;
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
    public I getNinth() {
        return this.ninth;
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
    public void setNinth(final I ninth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    @Override
    public String toString() {
        return String.format(
                "ImmutableEnnead{first=%s, second=%s, third=%s, fourth=%s, fifth=%s, sixth=%s, seventh=%s, eight=%s, ninth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth(),
                this.getSixth(),
                this.getSeventh(),
                this.getEight(),
                this.getNinth()
        );
    }
}
