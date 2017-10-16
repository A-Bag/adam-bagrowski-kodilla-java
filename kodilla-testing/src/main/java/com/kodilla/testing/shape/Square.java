package com.kodilla.testing.shape;

public class Square implements Shape {
    double a;
    double b;

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
