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

package de.florianmichael.rclasses.io.encryption.impl;

import de.florianmichael.rclasses.io.encryption.Encryptor;

public class Rot13 implements Encryptor {

    private final int offset;

    public Rot13(int offset) {
        this.offset = offset;
    }

    @Override
    public byte[] encrypt(byte[] data) {
        StringBuilder result = new StringBuilder();

        for (char c : new String(data).toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) (base + (c - base + offset) % 26));
            } else {
                result.append(c);
            }
        }

        return result.toString().getBytes();
    }

    @Override
    public byte[] decrypt(byte[] data) {
        // Rot13 is its own inverse, so decrypting is the same as encrypting
        return encrypt(data);
    }
}