package CompareGeomatric;

public class Square extends Rectangle {
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super();
    }

    @Override

    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return String.format("A Square with side = %f, which is subclass of %s", width, super.toString());
    }
}
