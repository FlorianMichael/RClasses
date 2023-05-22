package de.florianmichael.rclasses.type.vec.a.immutable;

import de.florianmichael.rclasses.type.vec.a.FloatVec;

public final class ImmutableFloatVec extends FloatVec {
    private final float x, y;


    @SuppressWarnings("all")
    ImmutableFloatVec() {
        this(0.0F, 0.0F);
    }


    public ImmutableFloatVec(final float x, final float y) {
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
    }

    public @Override void setY(final float y) {
    }


    public @Override String toString() {
        return String.format(
                "ImmutableFloatVec{x=%f, y=%f}",
                this.getX(),
                this.getY()
        );
    }
}
