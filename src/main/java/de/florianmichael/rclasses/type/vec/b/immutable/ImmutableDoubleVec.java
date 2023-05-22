package de.florianmichael.rclasses.type.vec.b.immutable;

import de.florianmichael.rclasses.type.vec.b.DoubleVec;

public final class ImmutableDoubleVec extends DoubleVec {
    private final double x, y, z;


    @SuppressWarnings("all")
    ImmutableDoubleVec() {
        this(0, 0, 0);
    }


    public ImmutableDoubleVec(final double x, final double y, final double z) {
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
    }

    public @Override void setY(final double y) {
    }

    public @Override void setZ(final double z) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableDoubleVec{x=%f, y=%f, z=%f}",
                this.getX(),
                this.getY(),
                this.getZ()
        );
    }
}
