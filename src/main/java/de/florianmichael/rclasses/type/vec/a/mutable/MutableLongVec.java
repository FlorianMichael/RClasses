package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.LongVec;

public final class MutableLongVec extends LongVec {
    private long x, y;


    @SuppressWarnings("all")
    MutableLongVec() {
        this(0L, 0L);
    }


    public MutableLongVec(final long x, final long y) {
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
        this.x = x;
    }

    public @Override void setY(final long y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableLongVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
