package ResizeGeomatric;

public class Square extends Rectangle implements Resizable {
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

    @Override
    public String toString() {
        return String.format("A Square with side = %f, which is subclass of %s", width, super.toString());
    }

    @Override
    public void resize(double percent) {
        double side = width + width * (percent / 100);
        setWidth(side);
    }
}
