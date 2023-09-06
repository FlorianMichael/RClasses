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

package de.florianmichael.rclasses.kotlin.javastdlib

/**
 * @param target The string to replace
 * @param replacement The string to replace with
 * @return The string with the last occurrence of the target string replaced with the replacement string
 */
fun String.replaceLast(target: String, replacement: String, fallback: String = this): String {
    val lastIndex = this.lastIndexOf(target)
    return if (lastIndex == -1) {
        fallback
    } else this.substring(0, lastIndex) + replacement + this.substring(lastIndex + target.length)
}

/**
 * @return The string with the first character replaced with the uppercase version of it (if it is a letter).
 */
fun String.uppercaseFirst(fallback: String = this): String {
    if (this.length < 2) return fallback

    return this.substring(0, 1).uppercase() + this.substring(1)
}
