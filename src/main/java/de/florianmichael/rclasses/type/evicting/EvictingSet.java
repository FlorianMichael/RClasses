package de.florianmichael.rclasses.type.evicting;

import java.util.Collections;
import java.util.Set;

public final class EvictingSet<V> {
    private final Set<V> set;

    private final int maxSize;

    EvictingSet() {
        this(Collections.emptySet(), 0);
    }

    public EvictingSet(final Set<V> set, final int maxSize) {
        this.set = set;
        this.maxSize = maxSize;
    }

    public @SuppressWarnings("all") boolean add(final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.set.remove(this.set.toArray()[0]);
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.set.add(value);
        return removedFirstEntry;
    }

    public boolean isFull() {
        return this.set.size() >= this.maxSize;
    }

    public Set<V> getNormalSet() {
        return this.set;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
