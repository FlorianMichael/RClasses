package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.FloatVec;

public final class MutableFloatVec extends FloatVec {
    private float x, y;


    @SuppressWarnings("all")
    MutableFloatVec() {
        this(0.0F, 0.0F);
    }


    public MutableFloatVec(final float x, final float y) {
        this.x = x;
        this.y = y;
    }


    public @Override float getX() {
        return this.x;
    }

    public @Override float getY() {
        return this.y;
    }

    public @Override void setX(final float x) {
        this.x = x;
    }

    public @Override void setY(final float y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableFloatVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
