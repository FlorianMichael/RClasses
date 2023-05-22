package de.florianmichael.rclasses.type.vec.a;

public abstract class ByteVec {

    public abstract byte getX();

    public abstract byte getY();

    public abstract void setX(final byte x);

    public abstract void setY(final byte y);


    public @Override String toString() {
        return String.format(
                "ByteVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
