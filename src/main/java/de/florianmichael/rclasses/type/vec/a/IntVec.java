package de.florianmichael.rclasses.type.vec.a;

public abstract class IntVec {

    public abstract int getX();

    public abstract int getY();

    public abstract void setX(final int x);

    public abstract void setY(final int y);


    public @Override String toString() {
        return String.format(
                "IntVec{x=%d, y=%d}",
                this.getX(),
                this.getY()
        );
    }
}
