package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.DoubleVec;

public final class ImmutableDoubleVec extends DoubleVec {
    private final double x, y;


    @SuppressWarnings("all")
    ImmutableDoubleVec() {
        this(0.0D, 0.0D);
    }


    public ImmutableDoubleVec(final double x, final double y) {
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
    }

    public @Override void setY(final double y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableDoubleVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
