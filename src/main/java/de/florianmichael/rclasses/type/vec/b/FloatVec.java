package de.florianmichael.rclasses.type.vec.b;

public abstract class FloatVec {

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();

    public abstract void setX(final float x);

    public abstract void setY(final float y);

    public abstract void setZ(final float z);


    public @Override String toString() {
        return String.format(
                "FloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
