package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.LongVec;

public final class ImmutableLongVec extends LongVec {
    private final long x, y;


    @SuppressWarnings("all")
    ImmutableLongVec() {
        this(0L, 0L);
    }


    public ImmutableLongVec(final long x, final long y) {
        this.x = x;
        this.y = y;
    }


    public @Override long getX() {
        return this.x;
    }

    public @Override long getY() {
        return this.y;
    }

    public @Override void setX(final long x) {
    }

    public @Override void setY(final long y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableLongVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
