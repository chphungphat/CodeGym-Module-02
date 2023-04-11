public class Circle {
    private double raidus = 1.0;
    private String color = "red";

    public Circle(double raidus) {
        this.raidus = raidus;
    }

    public Circle() {
        this.raidus = 1.0;
        this.color = "red";
    }

    public double getRaidus() {
        return this.raidus;
    }

    public double getArea() {
        return raidus * raidus * 3.14;
    }
}

