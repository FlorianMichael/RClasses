/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023-2025 FlorianMichael/EnZaXD <florian.michael07@gmail.com> and contributors
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

package de.florianmichael.rclasses.common.encryption;

import de.florianmichael.rclasses.common.RandomUtils;
import de.florianmichael.rclasses.common.encryption.impl.AES;
import de.florianmichael.rclasses.common.encryption.impl.Base64;
import de.florianmichael.rclasses.common.encryption.impl.Rot13;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

/**
 * Utility class for encryption.
 */
public final class EncryptionUtils {

    private static final Base64 BASE_64 = new Base64();

    private static final byte[] SALT = RandomUtils.randomBytes(16);
    private static final SecretKeyFactory FACTORY;

    public static Base64 base64() {
        return BASE_64;
    }

    public static AES aes(final SecretKey secretKey) {
        return aes(generateIv(), secretKey);
    }

    public static AES aes(final IvParameterSpec initialVector, final SecretKey secretKey) {
        return new AES(initialVector, secretKey);
    }

    public static Rot13 rot13(final int offset) {
        return new Rot13(offset);
    }

    static {
        try {
            FACTORY = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param offset The offset.
     * @return The complementary offset.
     */
    public static int complementaryOffset(final int offset) {
        return 26 - (offset % 26);
    }

    /**
     * @return A random generated IV.
     */
    public static IvParameterSpec generateIv() {
        final byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);

        return new IvParameterSpec(iv);
    }

    /**
     * @param n The iteration count.
     * @return A secret key generated with the given iteration count.
     */
    public static SecretKey fromIterationCount(int n) throws NoSuchAlgorithmException {
        final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(n);

        return keyGenerator.generateKey();
    }

    /**
     * @param key The key as string.
     * @return A secret key generated with the given key string.
     * @throws InvalidKeySpecException If the key is invalid.
     */
    public static SecretKey fromString(final String key) throws InvalidKeySpecException {
        return fromString(key, SALT);
    }

    /**
     * @param key  The key as string.
     * @param salt The salt.
     * @return A secret key generated with the given key string and salt.
     * @throws InvalidKeySpecException If the key is invalid.
     */
    public static SecretKey fromString(final String key, final byte[] salt) throws InvalidKeySpecException {
        return fromString(key, salt, 1_000);
    }

    /**
     * @param key            The key as string.
     * @param salt           The salt.
     * @param iterationCount The iteration count.
     * @return A secret key generated with the given key string, salt and iteration count.
     * @throws InvalidKeySpecException If the key is invalid.
     */
    public static SecretKey fromString(final String key, final byte[] salt, final int iterationCount) throws InvalidKeySpecException {
        return fromString(key, salt, iterationCount, AESKeyLength.BITS_256.keyLength);
    }

    /**
     * @param key            The key as string.
     * @param salt           The salt.
     * @param iterationCount The iteration count.
     * @param keyLength      The key length.
     * @return A secret key generated with the given key string, salt, iteration count and key length.
     * @throws InvalidKeySpecException If the key is invalid.
     */
    public static SecretKey fromString(final String key, final byte[] salt, final int iterationCount, final int keyLength) throws InvalidKeySpecException {
        return new SecretKeySpec(FACTORY.generateSecret(new PBEKeySpec(key.toCharArray(), salt, iterationCount, keyLength)).getEncoded(), "AES");
    }

}
