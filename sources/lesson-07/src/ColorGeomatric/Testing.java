package ColorGeomatric;

public class Testing {
    public static void main(String[] args) {
        Shape[] geoObj = new Shape[3];
        geoObj[0] = new Circle(10.0);
        geoObj[1] = new Rectangle(10.0, 20.0);
        geoObj[2] = new Square(10.0);

        for (Shape obj : geoObj) {
            if (obj instanceof Circle) {
                ((Circle) obj).howToColor();
            } else if (obj instanceof Rectangle) {
                ((Rectangle) obj).howToColor();
            } else {
                ((Square) obj).howToColor();
            }
        }
    }
}
