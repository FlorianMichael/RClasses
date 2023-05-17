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

package de.florianmichael.rclasses;

// https://github.com/kwhat/jnativehook/blob/master/src/java/org/jnativehook/keyboard/SwingKeyAdapter.java
// https://gist.github.com/lilgallon/eb0cc2fc38920fb5081aba2c542eda55
public class VCKeyRemapper {

    public static int vc_to_vk(final int vcKey) {
        return switch (vcKey) {
            case 1 -> 27;
            case 2 -> '1';
            case 3 -> '2';
            case 4 -> '3';
            case 5 -> '4';
            case 6 -> '5';
            case 7 -> '6';
            case 8 -> '7';
            case 9 -> '8';
            case 10 -> '9';
            case 11 -> '0';
            case 12 -> '-';
            case 13 -> '=';
            case 14 -> '\b';
            case 15 -> '\t';
            case 16 -> 'Q';
            case 17 -> 'W';
            case 18 -> 'E';
            case 19 -> 'R';
            case 20 -> 'T';
            case 21 -> 'Y';
            case 22 -> 'U';
            case 23 -> 'I';
            case 24 -> 'O';
            case 25 -> 'P';
            case 26 -> '[';
            case 27 -> ']';
            case 28 -> '\n';
            case 29 -> 17;
            case 30 -> 'A';
            case 31 -> 'S';
            case 32 -> 'D';
            case 33 -> 'F';
            case 34 -> 'G';
            case 35 -> 'H';
            case 36 -> 'J';
            case 37 -> 'K';
            case 38 -> 'L';
            case 39 -> ';';
            case 40 -> 222;
            case 41 -> 192;
            case 42 -> 16;
            case 43 -> '\\';
            case 44 -> 'Z';
            case 45 -> 'X';
            case 46 -> 'C';
            case 47 -> 'V';
            case 48 -> 'B';
            case 49 -> 'N';
            case 50 -> 'M';
            case 51 -> ',';
            case 52 -> '.';
            case 53 -> '/';
            case 56 -> 18;
            case 57 -> ' ';
            case 58 -> 20;
            case 59 -> 'p';
            case 60 -> 'q';
            case 61 -> 'r';
            case 62 -> 's';
            case 63 -> 't';
            case 64 -> 'u';
            case 65 -> 'v';
            case 66 -> 'w';
            case 67 -> 'x';
            case 68 -> 'y';
            case 69 -> 144;
            case 70 -> 145;
            case 83 -> 'l';
            case 87 -> 'z';
            case 88 -> '{';
            case 91 -> '\uf000';
            case 92 -> '\uf001';
            case 93 -> '\uf002';
            case 99 -> '\uf003';
            case 100 -> '\uf004';
            case 101 -> '\uf005';
            case 102 -> '\uf006';
            case 103 -> '\uf007';
            case 104 -> '\uf008';
            case 105 -> '\uf009';
            case 106 -> '\uf00a';
            case 107 -> '\uf00b';
            case 112 -> 241;
            case 115 -> 523;
            case 121 -> 25;
            case 123 -> 242;
            case 3639 -> 154;
            case 3653 -> 19;
            case 3655 -> '$';
            case 3657 -> '!';
            case 3663 -> '#';
            case 3665 -> '"';
            case 3666 -> 155;
            case 3667 -> 127;
            case 3675 -> 157;
            case 3677 -> 525;
            case 57416 -> '&';
            case 57419 -> '%';
            case 57420 -> '\f';
            case 57421 -> '\'';
            case 57424 -> '(';
            case 65397 -> 156;
            case 65400 -> '\uffc8';
            case 65401 -> '\uffc9';
            case 65403 -> '\uffd1';
            case 65406 -> '\uffd0';
            default -> 0;
        };
    }

    public static int vk_to_glfw(int vk_code) {
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
            return  258;
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
