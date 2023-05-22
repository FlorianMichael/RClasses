package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.IntVec;

public final class ImmutableIntVec extends IntVec {
    private final int x, y, z;


    @SuppressWarnings("all")
    ImmutableIntVec() {
        this(0, 0, 0);
    }


    public ImmutableIntVec(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override int getX() {
        return this.x;
    }

    public @Override int getY() {
        return this.y;
    }

    public @Override int getZ() {
        return this.z;
    }

    public @Override void setX(final int x) {
    }

    public @Override void setY(final int y) {
    }

    public @Override void setZ(final int z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableIntVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
