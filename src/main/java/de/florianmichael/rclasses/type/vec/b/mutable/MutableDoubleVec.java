package de.florianmichael.rclasses.type.vec.b.mutable;

import de.florianmichael.rclasses.type.vec.b.DoubleVec;

public final class MutableDoubleVec extends DoubleVec {
    private double x, y, z;


    @SuppressWarnings("all")
    MutableDoubleVec() {
        this(0, 0, 0);
    }


    public MutableDoubleVec(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public @Override double getX() {
        return this.x;
    }

    public @Override double getY() {
        return this.y;
    }

    public @Override double getZ() {
        return this.z;
    }

    public @Override void setX(final double x) {
        this.x = x;
    }

    public @Override void setY(final double y) {
        this.y = y;
    }

    public @Override void setZ(final double z) {
        this.z = z;
    }


    public @Override String toString() {
        return String.format(
                "MutableDoubleVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
