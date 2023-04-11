package CircleAndCylinder;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder() {
        super();
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override

    public double getArea() {
        return 2 * super.getArea() + super.getPerimeter() * height;
    }

    public String toString() {
        return String.format("A Cylinder with height = %f, radius = %f, color = %s", height, super.getRadius(), super.getColor());
    }
}
