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

package de.florianmichael.rclasses.functional.tuple;

/**
 * Represents a tuple of five elements.
 */
public abstract class Quintet<A, B, C, D, E> {

    public abstract A getFirst();
    public abstract B getSecond();
    public abstract C getThird();
    public abstract D getFourth();
    public abstract E getFifth();

    public abstract void setFirst(final A first);
    public abstract void setSecond(final B second);
    public abstract void setThird(final C third);
    public abstract void setFourth(final D third);
    public abstract void setFifth(final E fifth);

    @Override
    public String toString() {
        return "Quintet{" +
                "first=" + getFirst() +
                ", second=" + getSecond() +
                ", third=" + getThird() +
                ", fourth=" + getFourth() +
                ", fifth=" + getFifth() +
                '}';
    }

}
