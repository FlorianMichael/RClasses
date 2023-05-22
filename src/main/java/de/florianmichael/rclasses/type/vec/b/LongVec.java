package de.florianmichael.rclasses.type.vec.b;

public abstract class LongVec {

    public abstract long getX();

    public abstract long getY();

    public abstract long getZ();

    public abstract void setX(final long x);

    public abstract void setY(final long y);

    public abstract void setZ(final long z);


    public @Override String toString() {
        return String.format(
                "LongVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
