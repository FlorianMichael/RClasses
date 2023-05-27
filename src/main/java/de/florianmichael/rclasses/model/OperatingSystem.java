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

// From: https://github.com/lumii500pg/Needle (License: UNLICENSE, time: 26/05)
package de.florianmichael.rclasses.model;

public enum OperatingSystem {
    WINDOWS, LINUX, MAC, SOLARIS, UNKNOWN;

    private static final String propOs = System.getProperty("os.name").toLowerCase();

    private static final OperatingSystem OS =
            (propOs.contains("win")) ? WINDOWS
                    : (propOs.contains("nix") || propOs.contains("nux") || propOs.contains("aix")) ? LINUX
                    : (propOs.contains("mac") || propOs.contains("osx")) ? MAC
                    : (propOs.contains("solaris")) ? SOLARIS
                    : UNKNOWN;

    private static final String libraryExtension = OS == WINDOWS ? "dll" : OS == MAC ? "dylib" : "SO";

    public static OperatingSystem getOperatingSystem() {
        return OS;
    }

    public static String getLibraryExtension() {
        return libraryExtension;
    }

    public static final class Architecture {
        private static final String propArch = System.getProperty("os.arch").toLowerCase();
        private static final boolean
                amd64 = propArch.contains("amd64"),
                arm = propArch.contains("armv7"),
                arm64 = propArch.contains("aarch64"),
                ia64 = propArch.contains("ia64"),
                mips = propArch.contains("mips"),
                mips64 = propArch.contains("mips64"),
                ppc64 = propArch.contains("ppc64"),
                sparc = propArch.contains("sparcv9"),
                x86 = propArch.contains("x86_64") || propArch.contains("x86-64");

        public static boolean isAmd64() {
            return amd64;
        }

        public static boolean isArm() {
            return arm;
        }

        public static boolean isArm64() {
            return arm64;
        }

        public static boolean isIa64() {
            return ia64;
        }

        public static boolean isMips() {
            return mips;
        }

        public static boolean isMips64() {
            return mips64;
        }

        public static boolean isPpc64() {
            return ppc64;
        }

        public static boolean isSparc() {
            return sparc;
        }

        public static boolean isX86() {
            return x86;
        }

        public static boolean is64Bit() {
            return isArm64() || isAmd64() || isMips64() || isPpc64() || isSparc() || isIa64();
        }
    }
}
