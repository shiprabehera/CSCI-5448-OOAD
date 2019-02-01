package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeDatabase {
    private List<Shape> shapes = new ArrayList<>();

    public ShapeDatabase() {
        shapes.add(new Circle(2, 2, 5));
        shapes.add(new Square(0, 2, 5));
        shapes.add(new Triangle(1, 2, 3, 4));
    }
    public int getNumberOfShapes() {
        return shapes.size();
    }

    public void sortShapes() {
        //sorting the shapes based on x coordinate // can change this to anything
        Collections.sort(shapes, Comparator.comparingDouble(Shape::getX));
    }

    public void displayShapes() {
        //displaying each shape
        for (Shape s: shapes) {
            s.display();
        }
    }

}
