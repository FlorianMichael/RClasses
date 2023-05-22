package de.florianmichael.rclasses.type.vec.b;

public abstract class IntVec {

    public abstract int getX();

    public abstract int getY();

    public abstract int getZ();

    public abstract void setX(final int x);

    public abstract void setY(final int y);

    public abstract void setZ(final int z);


    public @Override String toString() {
        return String.format(
                "IntVec{x=%d, y=%d, z=%d}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
