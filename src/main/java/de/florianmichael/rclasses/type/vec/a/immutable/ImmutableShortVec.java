package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.ShortVec;

public final class ImmutableShortVec extends ShortVec {
    private final short x, y;


    @SuppressWarnings("all")
    ImmutableShortVec() {
        this((short) 0, (short) 0);
    }


    public ImmutableShortVec(final short x, final short y) {
        this.x = x;
        this.y = y;
    }


    public @Override short getX() {
        return this.x;
    }

    public @Override short getY() {
        return this.y;
    }

    public @Override void setX(final short x) {
    }

    public @Override void setY(final short y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableShortVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
