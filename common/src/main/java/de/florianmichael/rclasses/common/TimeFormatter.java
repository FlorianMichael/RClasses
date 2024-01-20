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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class contains some useful methods for formatting time.
 *
 * @see DateTimeFormatter
 */
public class TimeFormatter {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * @return The current date in the format dd.MM.yyyy
     */
    public static String currentDate() {
        return DATE_FORMAT.format(LocalDateTime.now());
    }

    /**
     * @return The current time in the format HH:mm:ss
     */
    public static String currentTime() {
        return TIME_FORMAT.format(LocalDateTime.now());
    }

    /**
     * @return The current date and time in the format dd.MM.yyyy HH:mm:ss
     */
    public static String currentDateTime() {
        return currentDate() + " " + currentTime();
    }

    /**
     * @param time The time to format
     * @return The given time in the format dd.MM.yyyy
     */
    public static String formatTime(final LocalDateTime time) {
        return TIME_FORMAT.format(time);
    }

    /**
     * @param time The time to format
     * @return The given time in the format HH:mm:ss
     */
    public static String formatDate(final LocalDateTime time) {
        return DATE_FORMAT.format(time);
    }

    /**
     * @param time The time to format
     * @return The given time in the format dd.MM.yyyy HH:mm:ss
     */
    public static String formatDateTime(final LocalDateTime time) {
        return formatDate(time) + " " + formatTime(time);
    }

}
