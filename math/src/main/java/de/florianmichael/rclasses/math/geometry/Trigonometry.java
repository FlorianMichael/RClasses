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

package de.florianmichael.rclasses.math.geometry;

import de.florianmichael.rclasses.math.geometry.impl.*;

/**
 * Enum of all trigonometry functions.
 */
public enum Trigonometry implements TrigonometryBase {

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
    public final TrigonometryBase math;

    Trigonometry(final String name, final TrigonometryBase math) {
        this.name = name;
        this.math = math;
    }

    @Override
    public float sin(float x) {
        return this.math.sin(x);
    }

    @Override
    public float cos(float x) {
        return this.math.cos(x);
    }
}
