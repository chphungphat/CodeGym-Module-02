package TriangleAndShape;

public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double[] getSide() {
        double[] arr = new double[3];
        arr[0] = side1;
        arr[1] = side2;
        arr[2] = side3;
        return arr;
    }

    public void setSide(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double A = s * (s - side1) * (s - side2) * (s - side3);
        return Math.sqrt(A);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return String.format("A Triangle wit side1 = %f, side2 = %f, side3 = %f, which is %s", side1, side2, side3, super.toString());
    }
}
