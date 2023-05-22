package de.florianmichael.rclasses.type.vec.a;

public abstract class DoubleVec {

    public abstract double getX();

    public abstract double getY();

    public abstract void setX(final double x);

    public abstract void setY(final double y);


    public @Override String toString() {
        return String.format(
                "DoubleVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
