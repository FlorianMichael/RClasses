package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.ShortVec;

public final class MutableShortVec extends ShortVec {
    private short x, y, z;


    @SuppressWarnings("all")
    MutableShortVec() {
        this((short) 0, (short) 0, (short) 0);
    }


    public MutableShortVec(final short x, final short y, final short z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override short getX() {
        return this.x;
    }

    public @Override short getY() {
        return this.y;
    }

    public @Override short getZ() {
        return this.z;
    }

    public @Override void setX(final short x) {
        this.x = x;
    }

    public @Override void setY(final short y) {
        this.y = y;
    }

    public @Override void setZ(final short z) {
        this.z = z;
    }


    public @Override String toString() {
        return String.format(
                "MutableShortVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
