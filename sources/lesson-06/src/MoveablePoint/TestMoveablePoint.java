package MoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        Moveablepoint movepoint = new Moveablepoint(10, 10, 2, 1);
        Moveablepoint newPoint;
        System.out.println(point.toString());
        System.out.println(movepoint.toString());
        newPoint = movepoint.move();
        System.out.println(newPoint.toString());

    }
}
