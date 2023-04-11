package CircleAndCylinder;

public class TestingCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        Cylinder cylinder = new Cylinder(5, "red", 10);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
