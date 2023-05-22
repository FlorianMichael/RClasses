package de.florianmichael.rclasses.type.evicting;

import java.util.Collections;
import java.util.Map;

public final class EvictingMap<K, V> {
    private final Map<K, V> map;

    private final int maxSize;

    EvictingMap() {
        this(Collections.emptyMap(), 0);
    }

    public EvictingMap(final Map<K, V> map, final int maxSize) {
        this.map = map;
        this.maxSize = maxSize;
    }

    public @SuppressWarnings("all") boolean put(final K key, final V value) {
        final boolean removedFirstEntry;
        if (this.isFull()) {
            this.map.remove(this.map.keySet().toArray()[0]);
            removedFirstEntry = true;
        } else removedFirstEntry = false;
        this.map.put(key, value);
        return removedFirstEntry;
    }

    public boolean isFull() {
        return this.map.size() >= this.maxSize;
    }

    public Map<K, V> getNormalMap() {
        return this.map;
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}
