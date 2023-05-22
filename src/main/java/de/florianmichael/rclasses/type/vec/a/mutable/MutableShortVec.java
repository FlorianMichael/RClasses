package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.ShortVec;

public final class MutableShortVec extends ShortVec {
    private short x, y;


    @SuppressWarnings("all")
    MutableShortVec() {
        this((short) 0, (short) 0);
    }


    public MutableShortVec(final short x, final short y) {
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
        this.x = x;
    }

    public @Override void setY(final short y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableShortVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
