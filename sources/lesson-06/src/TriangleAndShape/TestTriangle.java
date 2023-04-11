package TriangleAndShape;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 18, 16);
        Shape shape = new Shape();
        System.out.println(triangle.toString());
        System.out.println(shape.toString());
        System.out.printf("Area is %.2f, Perimeter %.2f", triangle.getArea(), triangle.getPerimeter());
    }
}
