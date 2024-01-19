/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2024 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.functional.tuple.mutable;

import de.florianmichael.rclasses.functional.tuple.Ennead;

import java.util.Objects;

/**
 * Represents a mutable tuple of nine elements.
 */
public final class MutableEnnead<A, B, C, D, E, F, G, H, I> extends Ennead<A, B, C, D, E, F, G, H, I> {

    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eight;
    private I ninth;

    public MutableEnnead() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public MutableEnnead(final A first, final B second, final C third, final D fourth, final E fifth, final F sixth, final G seventh, final H eight, final I ninth) {
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
    public String toString() {
        return "MutableEnnead{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                ", fifth=" + fifth +
                ", sixth=" + sixth +
                ", seventh=" + seventh +
                ", eight=" + eight +
                ", ninth=" + ninth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableEnnead<?, ?, ?, ?, ?, ?, ?, ?, ?> that = (MutableEnnead<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(first, that.first) && Objects.equals(second, that.second) && Objects.equals(third, that.third) && Objects.equals(fourth, that.fourth) && Objects.equals(fifth, that.fifth) && Objects.equals(sixth, that.sixth) && Objects.equals(seventh, that.seventh) && Objects.equals(eight, that.eight) && Objects.equals(ninth, that.ninth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third, fourth, fifth, sixth, seventh, eight, ninth);
    }

}
