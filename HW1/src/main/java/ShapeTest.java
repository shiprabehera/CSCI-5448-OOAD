package main.java;
import java.util.*;

public class ShapeTest {
    public static void main(String args[]) {
        System.out.println("Hello World");
        List<Shape> shapes = new ArrayList<>();
        
        shapes.add(new Circle(2, 2, 5));
        shapes.add(new Square(0, 2, 5));
        shapes.add(new Triangle(1, 2, 3, 4));

        //sorting the shapes based on x coordinate
        Collections.sort(shapes, Comparator.comparingDouble(Shape::getX));

        //displaying each shape
        for (Shape s: shapes) {
            s.display();
        }

    }
}
