package app;

import app.entity.Circle;
import app.entity.Quadrant;
import app.entity.Triangle;
import app.model.IGeometricShape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = scan.nextDouble();
        System.out.println("Enter the first side of triangle, cm: ");
        double triangleSide1 = scan.nextDouble();
        System.out.println("Enter the second side of triangle, cm: ");
        double triangleSide2 = scan.nextDouble();
        System.out.println("Enter the third side of triangle, cm: ");
        double triangleSide3 = scan.nextDouble();
        System.out.println("Enter the side of quadrant: ");
        double quadrantSide = scan.nextDouble();

        IGeometricShape[] figures = {
                new Circle(radius),
                new Triangle(triangleSide1, triangleSide2, triangleSide3),
                new Quadrant(quadrantSide)
        };
    }
}
