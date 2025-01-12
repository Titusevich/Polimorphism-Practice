package app.entity;

import app.model.IGeometricShape;

public class Quadrant implements IGeometricShape {

    double side;

    public Quadrant(double side) {
        this.side = side;
    }

    @Override
    public double calcSquare() {
        return side * side;
    }
}
