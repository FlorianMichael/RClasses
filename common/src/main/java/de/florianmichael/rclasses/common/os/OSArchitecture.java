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

import java.util.Objects;

/**
 * This class represents the architecture of the operating system.
 */
public final class OSArchitecture {

    public final boolean amd64;
    public final boolean x86;
    public final boolean arm64;
    public final boolean arm;
    public final boolean ia64;
    public final boolean mips64;
    public final boolean mips;
    public final boolean ppc64;
    public final boolean s390x;
    public final boolean sparc;
    public final boolean s390;

    public OSArchitecture(String archString) {
        archString = archString.toLowerCase();
        amd64 = archString.contains("amd64");
        x86 = archString.contains("x86_64") || archString.contains("x86-64") || archString.contains("x64");
        arm = archString.contains("arm");
        arm64 = archString.contains("arm64");
        ia64 = archString.contains("ia64");
        mips64 = archString.contains("mips64");
        ppc64 = archString.contains("ppc64");
        s390x = archString.contains("s390x");
        mips = archString.contains("mips");
        sparc = archString.contains("sparc");
        s390 = archString.contains("s390");
    }

    public boolean is64Bit() {
        return arm64 || amd64 || mips64 || ppc64 || sparc || ia64;
    }

    @Override
    public String toString() {
        return "OSArchitecture{" +
                "amd64=" + amd64 +
                ", x86=" + x86 +
                ", arm64=" + arm64 +
                ", arm=" + arm +
                ", ia64=" + ia64 +
                ", mips64=" + mips64 +
                ", mips=" + mips +
                ", ppc64=" + ppc64 +
                ", s390x=" + s390x +
                ", sparc=" + sparc +
                ", s390=" + s390 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OSArchitecture that = (OSArchitecture) o;
        return amd64 == that.amd64 && x86 == that.x86 && arm64 == that.arm64 && arm == that.arm && ia64 == that.ia64 && mips64 == that.mips64 && mips == that.mips && ppc64 == that.ppc64 && s390x == that.s390x && sparc == that.sparc && s390 == that.s390;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amd64, x86, arm64, arm, ia64, mips64, mips, ppc64, s390x, sparc, s390);
    }

}
