package de.florianmichael.rclasses.type.evicting;

import java.util.Collections;
import java.util.List;

public final class EvictingList<V> {
    private final List<V> list;

    private final int maxSize;

    EvictingList() {
        this(Collections.emptyList(), 0);
    }

    public EvictingList(final List<V> list, final int maxSize) {
        this.list = list;
        this.maxSize = maxSize;
    }

    public boolean add(final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.list.remove(this.list.get(0));
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.list.add(value);
        return removedFirstEntry;
    }

    public boolean isFull() {
        return this.list.size() >= this.maxSize;
    }

    public List<V> getNormalList() {
        return this.list;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
