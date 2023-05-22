package de.florianmichael.rclasses.type.vec.a.mutable;

import de.florianmichael.rclasses.type.vec.a.DoubleVec;

public final class MutableDoubleVec extends DoubleVec {
    private double x, y;


    @SuppressWarnings("all")
    MutableDoubleVec() {
        this(0.0D, 0.0D);
    }


    public MutableDoubleVec(final double x, final double y) {
        this.x = x;
        this.y = y;
    }


    public @Override double getX() {
        return this.x;
    }

    public @Override double getY() {
        return this.y;
    }

    public @Override void setX(final double x) {
        this.x = x;
    }

    public @Override void setY(final double y) {
        this.y = y;
    }


    public @Override String toString() {
        return String.format(
                "MutableDoubleVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
