/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.math.trigonometry.impl;

import de.florianmichael.rclasses.math.trigonometry.Trigonometry;

public class TaylorTrigonometry implements Trigonometry {

    private static final float BF_SIN_TO_COS;
    static {
        BF_SIN_TO_COS = (float)(Math.PI * 0.5f);
    }

    @Override
    public float sin(float x) {
        double xV = x;

        double x2 = xV * xV;
        double x3 = x2 * xV;
        double x5 = x2 * x3;
        double x7 = x2 * x5;
        double x9 = x2 * x7;
        double x11 = x2 * x9;
        double x13 = x2 * x11;
        double x15 = x2 * x13;
        double x17 = x2 * x15;

        double val = xV;
        val -= x3 * 0.16666666666666666666666666666667;
        val += x5 * 0.00833333333333333333333333333333;
        val -= x7 * 1.984126984126984126984126984127e-4;
        val += x9 * 2.7557319223985890652557319223986e-6;
        val -= x11 * 2.5052108385441718775052108385442e-8;
        val += x13 * 1.6059043836821614599392377170155e-10;
        val -= x15 * 7.6471637318198164759011319857881e-13;
        val += x17 * 2.8114572543455207631989455830103e-15;
        return (float) val;
    }

    @Override
    public float cos(float x) {
        return sin(x + BF_SIN_TO_COS);
    }
}
