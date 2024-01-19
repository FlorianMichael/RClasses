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

package de.florianmichael.rclasses.io;

/**
 * Converts virtual key codes to GLFW key codes
 */
public class VirtualKeyToGLFWCodes {

    /**
     * @param vk_code virtual key code
     * @return GLFW key code (if not present, -1 is returned)
     */
    public static int vk_to_glfw(final int vk_code) {
        if (vk_code == 127) {
            // 127 -> delete
            return 261;
        }
        // 1 -> L mouse
        // 2 -> R mouse
        // 3 -> control break processing
        // 4 -> middle mouse button
        // 5 -> windows 2000 X1
        // 6 -> windows 2000 X2
        // 7 -> undefined
        if (vk_code == 8) {
            // 8 -> back space
            return 259;
        }
        if (vk_code == 9) {
            // 9 -> tab key
            return 258;
        }
        // 10, 11 -> reserved
        // 12 -> clear key
        if (vk_code == 13) {
            // 13 -> enter key
            return 257;
        }
        // 14, 15 -> undefined
        // 16 -> shift - there is no equivalent in GLFW
        // 17 -> ctrl - there is no equivalent in GLFW
        // 18 -> alt - there is no equivalent in GLFW
        if (vk_code == 19) {
            // 19 -> pause
            return 284;
        }
        if (vk_code == 20) {
            // 20 -> caps lock
            return 280;
        }
        // 21, ..., 26 -> IME stuff
        if (vk_code == 27) {
            // 27 -> esc
            return 256;
        }
        // 28, ..., 31 -> IME stuff
        if (vk_code == 32) {
            // space
            return 32;
        }
        if (vk_code == 33) {
            // 33 -> page up
            return 266;
        }
        if (vk_code == 34) {
            // 34 -> page down
            return 267;
        }
        if (vk_code == 35) {
            // 35 -> end
            return 269;
        }
        if (vk_code == 36) {
            // 36 -> home
            return 268;
        }
        if (vk_code == 37) {
            // 37 -> left arrow
            return 263;
        }
        if (vk_code == 38) {
            // 38 -> up arrow
            return 265;
        }
        if (vk_code == 39) {
            // 39 -> right arrow
            return 262;
        }
        if (vk_code == 40) {
            // 40 -> down arrow
            return 264;
        }
        // 41 -> select
        // 42 -> print
        // 43 -> execute
        // 44 -> print screen
        if (vk_code == 45) {
            // 45 -> insert
            return 260;
        }
        if (vk_code == 46) {
            // 46 -> del
            return 261;
        }
        // 47 -> help
        if (vk_code >= 48 && vk_code <= 57) {
            // 48-57 -> 0-9
            return vk_code;
        }
        // 58-64 -> undefined
        if (vk_code >= 65 && vk_code <= 90) {
            // 65-90 -> a-z
            return vk_code;
        }
        // 91-93 -> win keys
        // 94 -> reserved
        // 95 -> sleep
        if (vk_code >= 96 && vk_code <= 105) {
            // 96-105 -> 0-9 numpad
            return vk_code - 224;
        }
        if (vk_code == 106) {
            // 106 -> multiply
            return 332;
        }
        if (vk_code == 107) {
            // 107 -> add
            return 334;
        }
        // 108 -> separator
        if (vk_code == 109) {
            // 109 -> subtract
            return 333;
        }
        if (vk_code == 110) {
            // 110 -> decimal
            return 330;
        }
        if (vk_code == 111) {
            // 111 -> divide
            return 331;
        }
        if (vk_code >= 112 && vk_code <= 135) {
            // 112-135 -> F1-F25
            return vk_code + 178;
        }
        // 136-143 -> unassigned
        if (vk_code == 144) {
            // 144 -> num lock
            return 282;
        }
        if (vk_code == 145) {
            return 281;
        }
        // 146-150 -> OEM specific
        // 151-159 -> unassigned
        if (vk_code == 160) {
            // 160 -> left shift
            return 340;
        }
        if (vk_code == 161) {
            // 161 -> right shift
            return 344;
        }
        if (vk_code == 162) {
            // 162 -> left control
            return 341;
        }
        if (vk_code == 163) {
            // 163 -> right control
            return 345;
        }
        // 164 -> left menu
        // 165 -> right menu
        // 166-183 -> windows media keys
        // 184-185 -> reserved
        // 186-192 -> windows 2000 keys
        // 193-215 -> reserved
        // 216-218 -> unassigned
        // 219-222 -> windows 2000 keys
        // 223 -> ?
        // 224 -> reserved
        // 225 -> OEM specific
        // 226 -> windows 2000 key
        // 227-228 -> OEM specific
        // 229 -> IME process key
        // 230 -> OEM specific
        // 231 -> used to pass unicode chars
        // 232 -> unassigned
        // 233-245 -> OEM specific
        // 246 -> attn
        // 247 -> crsel
        // 248 -> exsel
        // 249 -> erase EOF
        // 250 -> play
        // 251 -> zoom
        // 252 -> reserved
        // 253 -> pa1
        // 254 -> clear (oem)

        // Not supported yet
        return -2;
    }

}
