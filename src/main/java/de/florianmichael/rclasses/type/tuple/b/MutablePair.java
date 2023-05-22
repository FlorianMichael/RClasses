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

package de.florianmichael.rclasses.type.tuple.b;

public final class MutablePair<A, B> extends Pair<A, B> {
    private A first;
    private B second;


    @SuppressWarnings("all")
    MutablePair() {
        this(null, null);
    }


    public MutablePair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }


    public @Override A getFirst() {
        return this.first;
    }

    public @Override B getSecond() {
        return this.second;
    }

    public @Override void setFirst(final A first) {
        this.first = first;
    }

    public @Override void setSecond(final B second) {
        this.second = second;
    }


    public @Override String toString() {
        return String.format(
                "MutablePair{first=%s, second=%s}",
                this.getFirst(),
                this.getSecond()
        );
    }
}
