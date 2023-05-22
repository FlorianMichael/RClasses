package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.ShortVec;

public final class ImmutableShortVec extends ShortVec {
    private final short x, y, z;


    @SuppressWarnings("all")
    ImmutableShortVec() {
        this((short) 0, (short) 0, (short) 0);
    }


    public ImmutableShortVec(final short x, final short y, final short z) {
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
    }

    public @Override void setY(final short y) {
    }

    public @Override void setZ(final short z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableShortVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
