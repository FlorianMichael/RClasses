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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Please migrate to {@link SimpleHTTPClient}. This class file will be removed in the next major release (v3.0.0)
 */
@Deprecated
public class WebUtils extends SimpleHTTPClient {

    @Deprecated
    public static final WebUtils DEFAULT = create();

    public WebUtils(String userAgent, String acceptMethod) {
        super(userAgent, acceptMethod, null);
    }

    @Deprecated
    public static WebUtils create() {
        return new WebUtils(DEFAULT_AGENT, ACCEPT_METHOD);
    }

    @Deprecated
    public static WebUtils create(String userAgent) {
        return new WebUtils(userAgent, ACCEPT_METHOD);
    }

    @Deprecated
    public static WebUtils create(String userAgent, String acceptMethod) {
        return new WebUtils(userAgent, acceptMethod);
    }

    @Deprecated
    public static String performGet(final String userAgent, final String acceptMethod, final String url) throws IOException {
        return performGet(userAgent, acceptMethod, url, new HashMap<>());
    }

    @Deprecated
    public static String performGet(final String userAgent, final String acceptMethod, final String url, final Map<String, String> optionalHeaders) throws IOException {
        final SimpleHTTPClient client = new SimpleHTTPClient(userAgent, acceptMethod, optionalHeaders);
        return client.get(url);
    }

    @Deprecated
    public static String performPost(final String userAgent, final String acceptMethod, final String url, final String... input) throws IOException {
        return performPost(userAgent, acceptMethod, url, new HashMap<>(), input);
    }

    @Deprecated
    public static String performPost(final String userAgent, final String acceptMethod, final String url, final Map<String, String> optionalHeaders, final String... input) throws IOException {
        final SimpleHTTPClient client = new SimpleHTTPClient(userAgent, acceptMethod, optionalHeaders);
        return client.post(url, input);
    }

}
