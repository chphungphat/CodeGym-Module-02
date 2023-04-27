package ShapeFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        ShapeFactory shapeFactory = new ShapeFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a shape: ");
        String type = br.readLine();

        Shape shape = shapeFactory.getShape(type);
        shape.draw();
    }
}
