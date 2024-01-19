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

import de.florianmichael.rclasses.functional.tuple.Quintet;

public final class MutableQuintet<A, B, C, D, E> extends Quintet<A, B, C, D, E> {
    private A first;
    private B second;
    private C third;
    private D fourth;
    private E fifth;

    public MutableQuintet() {
        this(null, null, null, null, null);
    }

    public MutableQuintet(final A first, final B second, final C third, final D fourth, final E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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
    public String toString() {
        return String.format(
                "MutableQuintet{first=%s, second=%s, third=%s, fourth=%s, fifth=%s}",
                this.getFirst(),
                this.getSecond(),
                this.getThird(),
                this.getFourth(),
                this.getFifth()
        );
    }

}
