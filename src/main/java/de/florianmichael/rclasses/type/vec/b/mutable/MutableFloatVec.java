package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.FloatVec;

public final class MutableFloatVec extends FloatVec {
    private float x, y, z;


    @SuppressWarnings("all")
    MutableFloatVec() {
        this(0, 0, 0);
    }


    public MutableFloatVec(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override float getX() {
        return this.x;
    }

    public @Override float getY() {
        return this.y;
    }

    public @Override float getZ() {
        return this.z;
    }

    public @Override void setX(final float x) {
        this.x = x;
    }

    public @Override void setY(final float y) {
        this.y = y;
    }

    public @Override void setZ(final float z) {
        this.z = z;
    }


    public @Override String toString() {
        return String.format(
                "MutableFloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
