package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.ByteVec;

public final class ImmutableByteVec extends ByteVec {
    private final byte x, y, z;


    @SuppressWarnings("all")
    ImmutableByteVec() {
        this((byte) 0, (byte) 0, (byte) 0);
    }


    public ImmutableByteVec(final byte x, final byte y, final byte z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override byte getX() {
        return this.x;
    }

    public @Override byte getY() {
        return this.y;
    }

    public @Override byte getZ() {
        return this.z;
    }

    public @Override void setX(final byte x) {
    }

    public @Override void setY(final byte y) {
    }

    public @Override void setZ(final byte z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
