/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
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

package de.florianmichael.rclasses.math.concept;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This enum contains all easing functions that are supported by the official easing reference implementation class.
 */
public enum EasingFunctions {
    LINEAR("Linear", x -> x),

    IN_SINE("In sine", x -> (float) (1F - Math.cos((x * Math.PI) * 0.5F))),
    OUT_SINE("Out sine", x -> (float) (Math.sin((x * Math.PI) * 0.5F))),
    IN_OUT_SINE("In out sine", x -> (float) (-(Math.cos(Math.PI * x) - 1F) * 0.5F)),

    IN_QUAD("In quad", x -> x * x),
    OUT_QUAD("Out quad", x -> 1F - (1F - x) * (1F - x)),
    IN_OUT_QUAD("In out quad", x -> x < 0.5F ? 2F * x * x : 1F - (float) Math.pow(-2F * x + 2F, 2F) * 0.5F),

    IN_CUBIC("In cubic", x -> (float) Math.pow(x, 3F)),
    OUT_CUBIC("Out cubic", x -> (float) (1F - Math.pow(1F - x, 3F))),
    IN_OUT_CUBIC("In out cubic", x -> x < 0.5F ? 4F * x * x * x : 1F - (float) Math.pow(-2F * x + 2F, 3F) * 0.5F),

    IN_QUART("In quart", x -> (float) Math.pow(x, 4F)),
    OUT_QUART("Out quart", x -> (float) (1F - Math.pow(1F - x, 4F))),
    IN_OUT_QUART("In out quart", x -> x < 0.5F ? 8F * x * x * x * x : 1F - (float) Math.pow(-2F * x + 2F, 4F) * 0.5F),

    IN_QUINT("In quint", x -> (float) Math.pow(x, 5F)),
    OUT_QUINT("Out quint", x -> (float) (1F - Math.pow(1F - x, 5F))),
    IN_OUT_QUINT("In out quint", x -> x < 0.5F ? 16F * x * x * x * x * x : 1F - (float) Math.pow(-2F * x + 2F, 5F) * 0.5F),

    IN_EXPO("In expo", x -> x == 0F ? 0F : (float) Math.pow(2F, 10F * x - 10F)),
    OUT_EXPO("Out expo", x -> x == 1F ? 1F : 1F - (float) Math.pow(2F, -10F * x)),
    IN_OUT_EXPO("In out expo", x -> x == 0F ? 0F : x == 1F ? 1F : x < 0.5F ? (float) Math.pow(2F, 20F * x - 10F) * 0.5F : (2F - (float) Math.pow(2F, -20F * x + 10F)) * 0.5F),

    IN_CIRC("In circ", x -> 1F - (float) Math.sqrt(1F - (float) Math.pow(x, 2F))),
    OUT_CIRC("Out circ", x -> (float) Math.sqrt(1F - (float) Math.pow(x - 1F, 2F))),
    IN_OUT_CIRC("In out circ", x -> x < 0.5F ? (1F - (float) Math.sqrt(1 - (float) Math.pow(2F * x, 2F))) * 0.5F : ((float) Math.sqrt(1F - (float) Math.pow(-2F * x + 2F, 2F)) + 1F) * 0.5F),

    IN_BACK("In back", x -> {
        final float c1 = 1.70158F;
        final float c3 = c1 + 1F;
        return c3 * x * x * x - c1 * x * x;
    }),
    OUT_BACK("Out back", x -> {
        final float c1 = 1.70158F;
        final float c3 = c1 + 1F;
        return 1F + c3 * (float) Math.pow(x - 1F, 3F) + c1 * (float) Math.pow(x - 1F, 2F);
    }),
    IN_OUT_BACK("In out back", x -> {
        final float c1 = 1.70158F;
        final float c2 = c1 * 1.525F;
        return x < 0.5F ? ((float) Math.pow(2F * x, 2F) * ((c2 + 1F) * 2F * x - c2)) * 0.5F : ((float) Math.pow(2F * x - 2F, 2F) * ((c2 + 1F) * (x * 2F - 2F) + c2) + 2F) * 0.5F;
    }),

    IN_ELASTIC("In elastic", x -> {
        final float c4 = (2F * (float) Math.PI) / 3F;
        return x == 0F ? 0F : x == 1F ? 1F : (float) -Math.pow(2F, 10F * x - 10F) * (float) Math.sin((x * 10F - 10.75F) * c4);
    }),
    OUT_ELASTIC("Out elastic", x -> {
        final float c4 = (2F * (float) Math.PI) / 3F;
        return x == 0F ? 0F : x == 1F ? 1F : (float) Math.pow(2F, -10F * x) * (float) Math.sin((x * 10F - 0.75F) * c4) + 1F;
    }),
    IN_OUT_ELASTIC("In out elastic", x -> {
        final float c5 = (2F * (float) Math.PI) / 4.5F;
        double curvature = Math.sin((20F * x - 11.125F) * c5);
        return x == 0F ? 0F : x == 1F ? 1F : x < 0.5F ? -((float) Math.pow(2F, 20F * x - 10F) * (float) curvature) * 0.5F
                : ((float) Math.pow(2F, -20F * x + 10F) * (float) curvature) * 0.5F + 1F;
    }),

    OUT_BOUNCE("Out bounce", x -> {
        final float n1 = 7.5625F;
        final float d1 = 2.75F;

        return x < 1F / d1 ? n1 * x * x : x < 2F / d1 ? n1 * (x -= 1.5F / d1) * x + 0.75F : x < 2.5F / d1 ? n1 * (x -= 2.25F / d1) * x + 0.9375F : n1 * (x -= 2.625F / d1) * x + 0.984375F;
    }),
    IN_BOUNCE("In bounce", x -> 1F - EasingFunctions.OUT_BOUNCE.ease(1F - x)),
    IN_OUT_BOUNCE("In out bounce", x -> x < 0.5F ? (1F - EasingFunctions.OUT_BOUNCE.ease(1F - 2F * x)) * 0.5F : (1F + EasingFunctions.OUT_BOUNCE.ease(2F * x - 1F)) * 0.5F);

    public final String name;
    public final Function<Float, Float> function;

    /**
     * @param name The name of the function
     * @param function The function
     */
    EasingFunctions(final String name, final Function<Float, Float> function) {
        this.name = name;
        this.function = function;
    }

    /**
     * @return A list of all the function names
     */
    public static List<String> functionNames() {
        return Arrays.stream(values()).map(EasingFunctions::getName).collect(Collectors.toList());
    }

    public static float ease(final String functionName, final float x) {
        return byName(functionName).ease(x);
    }

    public static EasingFunctions byName(final String functionName) {
        for (EasingFunctions value : values()) {
            if (value.name.equals(functionName)) {
                return value;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String upperName() {
        return this.name.toUpperCase(Locale.ROOT);
    }

    public String lowerName() {
        return this.name.toLowerCase(Locale.ROOT);
    }

    public float ease(final float x) {
        return this.function.apply(x);
    }
}