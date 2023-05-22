package de.florianmichael.rclasses.type.vec.b;

public abstract class DoubleVec {

    public abstract double getX();

    public abstract double getY();

    public abstract double getZ();

    public abstract void setX(final double x);

    public abstract void setY(final double y);

    public abstract void setZ(final double z);


    public @Override String toString() {
        return String.format(
                "DoubleVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
