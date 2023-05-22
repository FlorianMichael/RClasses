package de.florianmichael.rclasses.type.vec.a;

public abstract class FloatVec {

    public abstract float getX();

    public abstract float getY();

    public abstract void setX(final float x);

    public abstract void setY(final float y);


    public @Override String toString() {
        return String.format(
                "FloatVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
