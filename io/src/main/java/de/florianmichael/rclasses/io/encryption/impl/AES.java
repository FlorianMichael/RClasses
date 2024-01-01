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

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AES implements Encryptor {
    private final static Cipher CIPHER;

    private final IvParameterSpec initialVector;
    private final SecretKey secretKey;

    public AES(final IvParameterSpec initialVector, final SecretKey secretKey) {
        this.initialVector = initialVector;
        this.secretKey = secretKey;
    }

    static {
        try {
            CIPHER = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] encrypt(byte[] data) {
        try {
            CIPHER.init(Cipher.ENCRYPT_MODE, secretKey, initialVector);
            return Base64.getEncoder().encode(CIPHER.doFinal(data));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public byte[] decrypt(byte[] data) {
        try {
            CIPHER.init(Cipher.DECRYPT_MODE, secretKey, initialVector);
            return CIPHER.doFinal(Base64.getDecoder().decode(data));
        } catch (Exception e) {
            return null;
        }
    }

}
