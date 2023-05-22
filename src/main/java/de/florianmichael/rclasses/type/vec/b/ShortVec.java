package de.florianmichael.rclasses.type.vec.b;

public abstract class ShortVec {

    public abstract short getX();

    public abstract short getY();

    public abstract short getZ();

    public abstract void setX(final short x);

    public abstract void setY(final short y);

    public abstract void setZ(final short z);


    public @Override String toString() {
        return String.format(
                "ShortVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
