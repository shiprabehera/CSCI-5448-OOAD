package main.java;
import java.util.*;

public class ShapeTest {
    public static void main(String args[]) {
        System.out.println("Hello World");
        ShapeDatabase database = new ShapeDatabase();

        //is this correct?
        System.out.println("Number of shapes are: "+ database.getNumberOfShapes());

        //display unsorted shapes
        database.displayShapes();
        //sort
        database.sortShapes();
        //display unsorted shapes
        database.displayShapes();

    }
}
