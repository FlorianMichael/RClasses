package de.florianmichael.rclasses.type.vec.a;

public abstract class ShortVec {

    public abstract short getX();

    public abstract short getY();

    public abstract void setX(final short x);

    public abstract void setY(final short y);


    public @Override String toString() {
        return String.format(
                "ShortVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
