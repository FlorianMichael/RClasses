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

package de.florianmichael.rclasses.math.trigonometry;

import de.florianmichael.rclasses.math.trigonometry.impl.*;

public enum TrigonometryFunctions {

    MINECRAFT("Minecraft", new MinecraftTrigonometry()),
    OPTIFINE_D5("Optifine <= D5", new OptifineD5Trigonometry()),
    OPTIFINE_K4("Optifine >= K4", new OptifineK4Trigonometry()),
    JAVA("Java", new JavaTrigonometry()),
    LIB_GDX("LibGDX", new LibGDXTrigonometry()),
    RANDOM("Random", new RandomTrigonometry()),
    RIVENS_FULL("Rivens Full", new RivensFullTrigonometry()),
    RIVENS_HALF("Rivens Half", new RivensHalfTrigonometry()),
    RIVENS("Rivens", new RivensTrigonometry()),
    TAYLOR("Taylor", new TaylorTrigonometry());

    public final String name;
    public final Trigonometry math;

    TrigonometryFunctions(final String name, final Trigonometry math) {
        this.name = name;
        this.math = math;
    }
}
