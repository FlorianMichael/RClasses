package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.IntVec;

public final class MutableIntVec extends IntVec {
    private int x, y;


    @SuppressWarnings("all")
    MutableIntVec() {
        this(0, 0);
    }


    public MutableIntVec(final int x, final int y) {
        this.x = x;
        this.y = y;
    }


    public @Override int getX() {
        return this.x;
    }

    public @Override int getY() {
        return this.y;
    }

    public @Override void setX(final int x) {
        this.x = x;
    }

    public @Override void setY(final int y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableIntVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
