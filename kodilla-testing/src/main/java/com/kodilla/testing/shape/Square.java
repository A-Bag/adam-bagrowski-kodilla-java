package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private double b;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.a, a) != 0) return false;
        return Double.compare(square.b, b) == 0;
    }
}
