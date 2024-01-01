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

package de.florianmichael.rclasses.io.encryption;

/**
 * Interface for encryptors.
 */
public interface Encryptor {

    /**
     * @param data The data to encrypt.
     * @return The encrypted data.
     */
    byte[] encrypt(byte[] data);

    /**
     * @param data The data to decrypt.
     * @return The decrypted data.
     */
    byte[] decrypt(byte[] data);

    /**
     * @param data The data to encrypt.
     * @return The encrypted data.
     */
    default String encrypt(final String data) {
        return new String(encrypt(data.getBytes()));
    }

    /**
     * @param data The data to decrypt.
     * @return The decrypted data.
     */
    default String decrypt(final String data) {
        return new String(decrypt(data.getBytes()));
    }
}
