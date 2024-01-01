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

package de.florianmichael.rclasses.io.mappings;

/**
 * ANSI color codes for console output.
 */
public class ANSIColorCodes {

    // Reset
    public final static String RESET = "\033[0m"; // Text Reset

    // Regular Colors
    public final static String BLACK = "\033[0;30m"; // BLACK
    public final static String RED = "\033[0;31m"; // RED
    public final static String GREEN = "\033[0;32m"; // GREEN
    public final static String YELLOW = "\033[0;33m"; // YELLOW
    public final static String BLUE = "\033[0;34m"; // BLUE
    public final static String PURPLE = "\033[0;35m"; // PURPLE
    public final static String CYAN = "\033[0;36m"; // CYAN
    public final static String WHITE = "\033[0;37m"; // WHITE

    // Bold
    public final static String BLACK_BOLD = "\033[1;30m"; // BLACK
    public final static String RED_BOLD = "\033[1;31m"; // RED
    public final static String GREEN_BOLD = "\033[1;32m"; // GREEN
    public final static String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public final static String BLUE_BOLD = "\033[1;34m"; // BLUE
    public final static String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public final static String CYAN_BOLD = "\033[1;36m"; // CYAN
    public final static String WHITE_BOLD = "\033[1;37m"; // WHITE

    // Underline
    public final static String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
    public final static String RED_UNDERLINED = "\033[4;31m"; // RED
    public final static String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
    public final static String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public final static String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
    public final static String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public final static String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
    public final static String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

    // Background
    public final static String BLACK_BACKGROUND = "\033[40m"; // BLACK
    public final static String RED_BACKGROUND = "\033[41m"; // RED
    public final static String GREEN_BACKGROUND = "\033[42m"; // GREEN
    public final static String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public final static String BLUE_BACKGROUND = "\033[44m"; // BLUE
    public final static String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public final static String CYAN_BACKGROUND = "\033[46m"; // CYAN
    public final static String WHITE_BACKGROUND = "\033[47m"; // WHITE

    // High Intensity
    public final static String BLACK_BRIGHT = "\033[0;90m"; // BLACK
    public final static String RED_BRIGHT = "\033[0;91m"; // RED
    public final static String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public final static String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public final static String BLUE_BRIGHT = "\033[0;94m"; // BLUE
    public final static String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public final static String CYAN_BRIGHT = "\033[0;96m"; // CYAN
    public final static String WHITE_BRIGHT = "\033[0;97m"; // WHITE

    // Bold High Intensity
    public final static String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public final static String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
    public final static String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public final static String YELLOW_BOLD_BRIGHT = "\033[1;93m"; // YELLOW
    public final static String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
    public final static String PURPLE_BOLD_BRIGHT = "\033[1;95m"; // PURPLE
    public final static String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
    public final static String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public final static String BLACK_BACKGROUND_BRIGHT = "\033[0;100m"; // BLACK
    public final static String RED_BACKGROUND_BRIGHT = "\033[0;101m"; // RED
    public final static String GREEN_BACKGROUND_BRIGHT = "\033[0;102m"; // GREEN
    public final static String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m"; // YELLOW
    public final static String BLUE_BACKGROUND_BRIGHT = "\033[0;104m"; // BLUE
    public final static String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public final static String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
    public final static String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE
}
