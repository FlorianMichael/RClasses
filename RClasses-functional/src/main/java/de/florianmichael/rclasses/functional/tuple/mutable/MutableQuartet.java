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

import de.florianmichael.rclasses.functional.tuple.Quartet;

public final class MutableQuartet<A, B, C, D> extends Quartet<A, B, C, D> {
    private A first;
    private B second;
    private C third;
    private D fourth;

    MutableQuartet() {
        this(null, null, null, null);
    }

    public MutableQuartet(final A first, final B second, final C third, final D fourth) {
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
    public String toString() {
        return String.format(
                "MutableQuartet{first=%s, second=%s, third=%s, fourth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth()
        );
    }
}
