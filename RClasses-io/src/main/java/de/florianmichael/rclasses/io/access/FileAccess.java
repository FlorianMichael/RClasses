/*
 * This file is part of RClasses - https://github.com/FlorianMichael/RClasses
 * Copyright (C) 2023 FlorianMichael/EnZaXD and contributors
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

package de.florianmichael.rclasses.io.access;

import de.florianmichael.rclasses.io.WebUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class FileAccess {
    public static File downloadFile(final String url, final File output) throws Throwable {
        return downloadFile(url, WebUtils.DEFAULT_AGENT, output);
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
