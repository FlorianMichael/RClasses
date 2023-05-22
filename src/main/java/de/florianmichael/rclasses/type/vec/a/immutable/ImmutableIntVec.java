package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.IntVec;

public final class ImmutableIntVec extends IntVec {
    private final int x, y;


    @SuppressWarnings("all")
    ImmutableIntVec() {
        this(0, 0);
    }


    public ImmutableIntVec(final int x, final int y) {
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
    }

    public @Override void setY(final int y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableIntVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
