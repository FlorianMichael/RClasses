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

package de.florianmichael.rclasses.common.memory;

import java.util.ArrayList;

/**
 * A simple native memory stack implementation
 */
public class MemoryStack {
    private final long address;
    private long offset;
    private final long capacity;

    private final ArrayList<Long> stackFrames = new ArrayList<>();

    /**
     * Constructs a new memory stack
     * @param capacity The number of bytes the memory stack can allocate
     */
    public MemoryStack(long capacity) {
        this.capacity = capacity;
        address = Memory.allocate(capacity);
    }

    /**
     * Pushes a new stack frame
     * @return the memory stack
     */
    public MemoryStack push() {
        stackFrames.add(offset);
        return this;
    }

    /**
     * Pops the last stack frame
     * @return the memory stack
     */
    public MemoryStack pop() {
        offset = stackFrames.remove(stackFrames.size() - 1);
        return this;
    }

    /***
     * Allocates memory from the memory stack
     * @param size the size to allocate
     * @param alignment the alignment to allocate
     * @return the memory address
     * @throws MemoryStackOverflowException when the memory stack is exceeded
     * @throws InvalidAlignmentException when the alignment is not a power of 2
     */
    public long allocate(long size, long alignment) throws MemoryStackOverflowException, InvalidAlignmentException {
        if (!Memory.isValidAlignment(alignment)) {
            throw new InvalidAlignmentException(alignment);
        }

        offset = (offset + alignment - 1) & ~alignment;

        if (offset + size > capacity) {
            throw new MemoryStackOverflowException(this);
        }

        long result = offset;
        offset += size;

        return offset;
    }
}
