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

package de.florianmichael.rclasses.common.array;

import java.util.List;

/**
 * Class for calculating slices of a list. This is useful for splitting a list into multiple parts.
 *
 * @param <T> The type of the list elements.
 */
public class SliceCalculation<T> {
    private final List<T> elements;
    private final int sliceSize;

    public SliceCalculation(List<T> elements, int sliceSize) {
        this.elements = elements;
        this.sliceSize = sliceSize;
    }

    /**
     * @return The number of slices.
     */
    public int getSliceCount() {
        return getSliceCount(this.elements.size(), this.sliceSize);
    }

    /**
     * Returns the slice at the given index. The index must be between 0 and the slice count.
     *
     * @param sliceIndex The index of the slice.
     * @return The slice.
     */
    public List<T> getSlice(final int sliceIndex) {
        if (sliceIndex < 0 || sliceIndex >= this.getSliceCount()) {
            throw new IllegalArgumentException("Slice index out of bounds.");
        }

        return this.elements.subList(sliceIndex * this.sliceSize, Math.min((sliceIndex + 1) * this.sliceSize, this.elements.size()));
    }

    /**
     * Returns the number of slices for the given size and slice size.
     *
     * @param size      The size.
     * @param sliceSize The slice size.
     * @return The number of slices.
     */
    public static int getSliceCount(final int size, final int sliceSize) {
        return (int) Math.ceil((double) size / (double) sliceSize);
    }
}
