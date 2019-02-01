package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShapeDatabase {
    private List<Shape> shapes = new ArrayList<>();

    public ShapeDatabase() {
        //creating new shapes
        shapes.add(new Circle(2, 2, 3));
        shapes.add(new Square(0, 2, 5));
        shapes.add(new Triangle(1, 2, 3, 4));
    }
    public int getNumberOfShapes() {
        return shapes.size();
    }

    public void sortShapes() {
        //sorting the shapes based on perimeter
        Collections.sort(shapes, Comparator.comparingDouble(Shape::getPerimeter));
    }

    public void displayShapes() {
        //displaying each shape
        for (Shape s: shapes) {
            s.display();
        }
    }

}
