package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.ByteVec;

public final class ImmutableByteVec extends ByteVec {
    private final byte x, y;


    @SuppressWarnings("all")
    ImmutableByteVec() {
        this((byte) 0, (byte) 0);
    }


    public ImmutableByteVec(final byte x, final byte y) {
        this.x = x;
        this.y = y;
    }


    public @Override byte getX() {
        return this.x;
    }

    public @Override byte getY() {
        return this.y;
    }

    public @Override void setX(final byte x) {
    }

    public @Override void setY(final byte y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableByteVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
