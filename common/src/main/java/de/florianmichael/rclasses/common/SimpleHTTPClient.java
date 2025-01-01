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

package de.florianmichael.rclasses.common;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Implementation of a simple HTTP client using {@link HttpURLConnection} for Java 8. This class file can be used for
 * simple HTTP requests. For more complex requests, please use Java 11's HttpClient.
 */
public class SimpleHTTPClient {

    public static final String DEFAULT_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.102 Safari/537.36 OPR/90.0.4480.117";
    public static final String ACCEPT_METHOD = "application/json";
    public static final SimpleHTTPClient DEFAULT = new SimpleHTTPClient(DEFAULT_AGENT, ACCEPT_METHOD, null);

    private String userAgent;
    private String acceptMethod;
    private Map<String, String> headers;

    /**
     * Optional pre-modifier for the {@link HttpURLConnection} object. Will be called before the request is sent.
     */
    private Consumer<HttpURLConnection> preModifier;

    /**
     * Optional post-modifier for the {@link HttpURLConnection} object. Will be called after the request is sent.
     */
    private Consumer<HttpURLConnection> postModifier;

    public SimpleHTTPClient() {
    }

    public SimpleHTTPClient(String userAgent, String acceptMethod, Map<String, String> headers) {
        this.userAgent = userAgent;
        this.acceptMethod = acceptMethod;
        this.headers = headers;
    }

    /**
     * Sets the user agent for the request.
     *
     * @param userAgent The user agent
     * @return this
     */
    public SimpleHTTPClient withUserAgent(final String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Sets the accept method for the request.
     *
     * @param acceptMethod The accept method
     * @return this
     */
    public SimpleHTTPClient withAcceptMethod(final String acceptMethod) {
        this.acceptMethod = acceptMethod;
        return this;
    }

    /**
     * Adds an optional header to the request.
     *
     * @param key   header key
     * @param value header value
     * @return this
     */
    public SimpleHTTPClient withHeader(final String key, final String value) {
        if (headers == null) headers = new HashMap<>();
        headers.put(key, value);
        return this;
    }

    /**
     * Removes an optional header from the request.
     *
     * @param key header key
     * @return this
     */
    public SimpleHTTPClient removeHeader(final String key) {
        if (headers != null) headers.remove(key);
        return this;
    }

    public String get(final String url) throws IOException {
        return get(new URL(url));
    }

    public String get(final URL url) throws IOException {
        return perform("GET", url);
    }

    public String delete(final String url) throws IOException {
        return delete(new URL(url));
    }

    public String delete(final URL url) throws IOException {
        return perform("DELETE", url);
    }

    public String head(final String url) throws IOException {
        return head(new URL(url));
    }

    public String head(final URL url) throws IOException {
        return perform("HEAD", url);
    }

    public String post(final String url, final String... input) throws IOException {
        return post(new URL(url), input);
    }

    public String post(final URL url, final String... input) throws IOException {
        return perform("POST", url, input);
    }

    public String put(final String url, final String... input) throws IOException {
        return put(new URL(url), input);
    }

    public String put(final URL url, final String... input) throws IOException {
        return perform("PUT", url, input);
    }

    public String perform(final String method, final String url, final String... input) throws IOException {
        return perform(method, new URL(url), input);
    }

    public String perform(final String method, final URL url, final String... input) throws IOException {
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        if (preModifier != null) preModifier.accept(connection);

        connection.setRequestMethod(method);
        if (userAgent != null) connection.setRequestProperty("User-Agent", userAgent);
        if (acceptMethod != null) connection.setRequestProperty("Accept", acceptMethod);
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        connection.setDoInput(true);
        if (input.length > 0) connection.setDoOutput(true);

        StringBuilder result = new StringBuilder();
        input:
        {
            final DataOutputStream output = new DataOutputStream(connection.getOutputStream());
            for (String s : input) output.writeBytes(s);
            output.flush();
        }
        output:
        {
            final BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }

            reader.close();
        }

        if (postModifier != null) postModifier.accept(connection);
        connection.disconnect();
        return result.toString();
    }

    public void setPreModifier(Consumer<HttpURLConnection> preModifier) {
        this.preModifier = preModifier;
    }

    public void setPostModifier(Consumer<HttpURLConnection> postModifier) {
        this.postModifier = postModifier;
    }

}
