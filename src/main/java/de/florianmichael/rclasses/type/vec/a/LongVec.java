package de.florianmichael.rclasses.type.vec.a;

public abstract class LongVec {

    public abstract long getX();

    public abstract long getY();

    public abstract void setX(final long x);

    public abstract void setY(final long y);


    public @Override String toString() {
        return String.format(
                "LongVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
