package app.service;

import app.model.IGeometricShape;

public class AppService {

    public double calcTotalSquare(IGeometricShape[] shapes) {
        double totalSquare = 0;
        for (IGeometricShape shape : shapes) {
            totalSquare += shape.calcSquare();
        }
        return totalSquare;
    }
}
