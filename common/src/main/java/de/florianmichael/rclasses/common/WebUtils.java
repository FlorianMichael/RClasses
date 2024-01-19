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

package de.florianmichael.rclasses.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for web requests.
 */
public class WebUtils {

    /**
     * Creates a new instance of {@link WebUtils} with the default user agent and accept method.
     */
    public final static WebUtils DEFAULT = create();

    public final static String DEFAULT_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.102 Safari/537.36 OPR/90.0.4480.117";
    public final static String ACCEPT_METHOD = "application/json";

    private final String userAgent;
    private final String acceptMethod;
    private final Map<String, String> optionalHeaders;

    /**
     * Creates a new instance of {@link WebUtils} with the given user agent and accept method.
     *
     * @param userAgent    the user agent
     * @param acceptMethod the accept method
     */
    protected WebUtils(final String userAgent, final String acceptMethod) {
        this.userAgent = userAgent;
        this.acceptMethod = acceptMethod;

        this.optionalHeaders = new HashMap<>();
    }

    /**
     * Adds an optional header to the request.
     *
     * @param key   header key
     * @param value header value
     * @return this
     */
    public WebUtils withHeader(final String key, final String value) {
        optionalHeaders.put(key, value);
        return this;
    }

    /**
     * Removes an optional header from the request.
     *
     * @param key header key
     * @return this
     */
    public WebUtils removeHeader(final String key) {
        optionalHeaders.remove(key);
        return this;
    }

    /**
     * Performs a GET request to the given URL.
     *
     * @param url the url
     * @return the response
     * @throws IOException if an error occurs
     */
    public String get(final String url) throws IOException {
        return performGet(userAgent, acceptMethod, url, optionalHeaders);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param url   the url
     * @param input the input
     * @return the response
     * @throws IOException if an error occurs
     */
    public String post(final String url, final String... input) throws IOException {
        return performPost(userAgent, acceptMethod, url, optionalHeaders, input);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @return the response
     */
    public static WebUtils create() {
        return new WebUtils(DEFAULT_AGENT, ACCEPT_METHOD);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param userAgent the user agent
     * @return the response
     */
    public static WebUtils create(String userAgent) {
        return new WebUtils(userAgent, ACCEPT_METHOD);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param userAgent    the user agent
     * @param acceptMethod the accept method
     * @return the response
     */
    public static WebUtils create(String userAgent, String acceptMethod) {
        return new WebUtils(userAgent, acceptMethod);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param userAgent    the user agent
     * @param acceptMethod the accept method
     * @param url          the url
     * @return the response
     * @throws IOException if an error occurs
     */
    public static String performGet(final String userAgent, final String acceptMethod, final String url) throws IOException {
        return performGet(userAgent, acceptMethod, url, new HashMap<>());
    }

    /**
     * Performs a GET request to the given URL with the given input.
     *
     * @param userAgent       the user agent
     * @param acceptMethod    the accept method
     * @param url             the url
     * @param optionalHeaders the optional headers
     * @return the response
     * @throws IOException if an error occurs
     */
    public static String performGet(final String userAgent, final String acceptMethod, final String url, final Map<String, String> optionalHeaders) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", userAgent);
        connection.setRequestProperty("Accept", acceptMethod);
        for (Map.Entry<String, String> entry : optionalHeaders.entrySet()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder result = new StringBuilder();
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            result.append(line).append(System.lineSeparator());
        }

        bufferedReader.close();
        connection.disconnect();

        return result.toString();
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param userAgent    the user agent
     * @param acceptMethod the accept method
     * @param url          the url
     * @param input        the input
     * @return the response
     * @throws IOException if an error occurs
     */
    public static String performPost(final String userAgent, final String acceptMethod, final String url, final String... input) throws IOException {
        return performPost(userAgent, acceptMethod, url, new HashMap<>(), input);
    }

    /**
     * Performs a POST request to the given URL with the given input.
     *
     * @param userAgent       the user agent
     * @param acceptMethod    the accept method
     * @param url             the url
     * @param optionalHeaders the optional headers
     * @param input           the input
     * @return the response
     * @throws IOException if an error occurs
     */
    public static String performPost(final String userAgent, final String acceptMethod, final String url, final Map<String, String> optionalHeaders, final String... input) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        connection.setRequestMethod("POST");
        connection.setRequestProperty("User-Agent", userAgent);
        connection.setRequestProperty("Accept", acceptMethod);
        for (Map.Entry<String, String> entry : optionalHeaders.entrySet()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        connection.setDoOutput(true);

        final DataOutputStream output = new DataOutputStream(connection.getOutputStream());
        for (String s : input) {
            output.writeBytes(s);
        }
        output.flush();

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder result = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            result.append(line).append(System.lineSeparator());
        }

        bufferedReader.close();
        connection.disconnect();

        return result.toString();
    }

}
