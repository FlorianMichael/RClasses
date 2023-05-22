package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.FloatVec;

public final class ImmutableFloatVec extends FloatVec {
    private final float x, y, z;


    @SuppressWarnings("all")
    ImmutableFloatVec() {
        this(0, 0, 0);
    }


    public ImmutableFloatVec(final float x, final float y, final float z) {
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
    }

    public @Override void setY(final float y) {
    }

    public @Override void setZ(final float z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableFloatVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
