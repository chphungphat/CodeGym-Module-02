package ResizeGeomatric;

public class Testing {
    public static void main(String[] args) {
        Shape[] geoObj = new Shape[3];
        geoObj[0] = new Circle(10);
        geoObj[1] = new Rectangle(20, 10);
        geoObj[2] = new Square(10);

        System.out.println("Before resize:");
        for (Shape obj : geoObj) {
            System.out.println(obj.toString());
        }

        System.out.println();

        System.out.println("After resize");
        for (Shape obj : geoObj) {
            if (obj instanceof Circle) {
                ((Circle) obj).resize(25.0);
            } else if (obj instanceof Rectangle) {
                ((Rectangle) obj).resize(25.0);
            } else {
                ((Square) obj).resize(25.0);
            }
            System.out.println(obj.toString());
        }
    }
}
