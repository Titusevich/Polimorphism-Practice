package app.entity;

import app.model.IGeometricShape;

public class Triangle implements IGeometricShape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

//    Расчет площади треугольника по формуле Герона
//    S = Корень квадратный( p * (p - a) * (p - b) * (p - c)),
//    S - площадь, p - полупериметр,
//    a,b,c - стороны треугольника

    @Override
    public double calcSquare() {
        double halfPerimeter = (side1 + side2 + side3) / 2;
        double result = halfPerimeter *
                (halfPerimeter - side1) *
                (halfPerimeter - side2) *
                (halfPerimeter - side3);
        return Math.sqrt(result);
    }
}
