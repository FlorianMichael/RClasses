package de.florianmichael.rclasses.type.vec.b;

public abstract class ByteVec {

    public abstract byte getX();

    public abstract byte getY();

    public abstract byte getZ();

    public abstract void setX(final byte x);

    public abstract void setY(final byte y);

    public abstract void setZ(final byte z);


    public @Override String toString() {
        return String.format(
                "ByteVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
