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

package de.florianmichael.rclasses.kotlin.javastdlib

import java.awt.Color

/**
 * @param red The new red value of the color
 * @return The color with the given red value. The other values are the same as the original color
 */
fun Color.withRed(red: Int) = Color(red, green, blue, alpha)

/**
 * @param green The new green value of the color
 * @return The color with the given green value. The other values are the same as the original color
 */
fun Color.withGreen(green: Int) = Color(red, green, blue, alpha)

/**
 * @param blue The new blue value of the color
 * @return The color with the given blue value. The other values are the same as the original color
 */
fun Color.withBlue(blue: Int) = Color(red, green, blue, alpha)

/**
 * @param alpha The new alpha value of the color
 * @return The color with the given alpha value. The other values are the same as the original color
 */
fun Color.withAlpha(alpha: Int) = Color(red, green, blue, alpha)

/**
 * @return The inverted color
 */
fun Color.invert() = Color(255 - red, 255 - green, 255 - blue, alpha)
