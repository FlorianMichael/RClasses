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

package de.florianmichael.rclasses.common.os;

/**
 * This enum represents the operating system the program is running on.
 */
public enum OperatingSystem {

    WINDOWS, LINUX, MAC, SOLARIS, UNKNOWN;

    /**
     * @return The operating system the program is running on.
     */
    public static OperatingSystem getOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            return WINDOWS;
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            return LINUX;
        } else if (osName.contains("mac") || osName.contains("osx")) {
            return MAC;
        } else if (osName.contains("sunos") || osName.contains("solaris")) {
            return SOLARIS;
        } else {
            return UNKNOWN;
        }
    }

    /**
     * @return The architecture of the operating system the program is running on.
     */
    public static OSArchitecture getArchitecture() {
        return new OSArchitecture(System.getProperty("os.arch"));
    }

    /**
     * @return The extension of the native library for the operating system the program is running on.
     */
    public static String getNativeExtension() {
        switch (getOS()) {
            case WINDOWS:
                return "dll";
            case MAC:
                return "dylib";
            default:
                return "so";
        }
    }

}
