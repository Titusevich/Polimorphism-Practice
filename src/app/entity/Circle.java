package app.entity;

import app.model.IGeometricShape;

public class Circle implements IGeometricShape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * Math.pow(radius,2);
    }
}
