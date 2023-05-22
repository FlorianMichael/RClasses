package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.ByteVec;

public final class MutableByteVec extends ByteVec {
    private byte x, y;


    @SuppressWarnings("all")
    MutableByteVec() {
        this((byte) 0, (byte) 0);
    }


    public MutableByteVec(final byte x, final byte y) {
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
        this.x = x;
    }

    public @Override void setY(final byte y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableByteVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
