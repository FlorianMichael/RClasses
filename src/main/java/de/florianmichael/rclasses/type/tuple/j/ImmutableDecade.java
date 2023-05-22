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

package de.florianmichael.rclasses.type.tuple.j;


public final class ImmutableDecade<A, B, C, D, E, F, G, H, I, J> extends Decade<A, B, C, D, E, F, G, H, I, J> {
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
    private final J tenth;


    @SuppressWarnings("all")
    ImmutableDecade() {
        this(null, null, null, null, null, null, null, null, null, null);
    }


    public ImmutableDecade(final A first, final B second,
                           final C third, final D fourth,
                           final E fifth, final F sixth,
                           final G seventh, final H eight,
                           final I ninth, final J tenth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eight = eight;
        this.ninth = ninth;
        this.tenth = tenth;
    }


    public @Override A getFirst() {
        return this.first;
    }

    public @Override B getSecond() {
        return this.second;
    }

    public @Override C getThird() {
        return this.third;
    }

    public @Override D getFourth() {
        return this.fourth;
    }

    public @Override E getFifth() {
        return this.fifth;
    }

    public @Override F getSixth() {
        return this.sixth;
    }

    public @Override G getSeventh() {
        return this.seventh;
    }

    public @Override H getEight() {
        return this.eight;
    }

    public @Override I getNinth() {
        return this.ninth;
    }

    public @Override J getTenth() {
        return this.tenth;
    }

    public @Override void setFirst(final A first) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setSecond(final B second) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setThird(final C third) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setFourth(final D fourth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setFifth(final E fifth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setSixth(final F sixth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setSeventh(final G seventh) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setEight(final H eight) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setNinth(final I ninth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }

    public @Override void setTenth(final J tenth) throws UnsupportedOperationException {
        throw COULD_NOT_SET;
    }


    public @Override String toString() {
        return String.format(
                "ImmutableDecade{first=%s, second=%s, third=%s, fourth=%s, fifth=%s, sixth=%s, seventh=%s, eight=%s, ninth=%s, tenth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth(),
                this.getSixth(),
                this.getSeventh(),
                this.getEight(),
                this.getNinth(),
                this.getTenth()
        );
    }
}
