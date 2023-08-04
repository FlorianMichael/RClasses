/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.florianmichael.rclasses.io;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class WebRequests {
    private final static String DEFAULT_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.5112.102 Safari/537.36 OPR/90.0.4480.117";

    public static File downloadFile(final String url, final File output) throws Throwable {
        return downloadFile(url, DEFAULT_AGENT, output);
    }

    public static File downloadFile(final String url, final String agent, final File output) throws Throwable {
        final URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.setRequestProperty("User-Agent", agent);
        urlConnection.connect();
        try (final ReadableByteChannel channel = Channels.newChannel(urlConnection.getInputStream())) {
            try (final FileOutputStream fileOutputStream = new FileOutputStream(output)) {
                fileOutputStream.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);
            }
        }
        return output;
    }
}
