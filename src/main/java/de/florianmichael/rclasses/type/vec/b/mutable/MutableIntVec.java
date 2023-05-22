package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.IntVec;

public final class MutableIntVec extends IntVec {
    private int x, y, z;


    @SuppressWarnings("all")
    MutableIntVec() {
        this(0, 0, 0);
    }


    public MutableIntVec(final int x, final int y, final int z) {
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
        this.x = x;
    }

    public @Override void setY(final int y) {
        this.y = y;
    }

    public @Override void setZ(final int z) {
        this.z = z;
    }


    public @Override String toString() {
        return String.format(
                "MutableIntVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
