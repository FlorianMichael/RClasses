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

import de.florianmichael.rclasses.functional.tuple.Decade;

import java.util.Objects;

/**
 * Represents a mutable tuple of ten elements.
 */
public final class MutableDecade<A, B, C, D, E, F, G, H, I, J> extends Decade<A, B, C, D, E, F, G, H, I, J> {

    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eight;
    private I ninth;
    private J tenth;

    public MutableDecade() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public MutableDecade(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh, final H eight, final I ninth, final J tenth) {
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
    public J getTenth() {
        return this.tenth;
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
    public void setFourth(final D fourth) {
        this.fourth = fourth;
    }

    @Override
    public void setFifth(final E fifth) {
        this.fifth = fifth;
    }

    @Override
    public void setSixth(final F sixth) {
        this.sixth = sixth;
    }

    @Override
    public void setSeventh(final G seventh) {
        this.seventh = seventh;
    }

    @Override
    public void setEight(final H eight) {
        this.eight = eight;
    }

    @Override
    public void setNinth(final I ninth) {
        this.ninth = ninth;
    }

    @Override
    public void setTenth(final J tenth) {
        this.tenth = tenth;
    }

    @Override
    public String toString() {
        return "MutableDecade{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                ", seventh=" + seventh +
                ", eight=" + eight +
                ", ninth=" + ninth +
                ", tenth=" + tenth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableDecade<?, ?, ?, ?, ?, ?, ?, ?, ?, ?> that = (MutableDecade<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third) && Objects.equals(fourth, that.fourth) && Objects.equals(fifth, that.fifth) && Objects.equals(sixth, that.sixth) && Objects.equals(seventh, that.seventh) && Objects.equals(eight, that.eight) && Objects.equals(ninth, that.ninth) && Objects.equals(tenth, that.tenth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth, seventh, eight, ninth, tenth);
    }
}
