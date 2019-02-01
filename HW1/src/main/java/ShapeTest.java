package main.java;

public class ShapeTest {
    public static void main(String args[]) {

        ShapeDatabase database = new ShapeDatabase();

        //display number of shapes
        System.out.println("Number of shapes are: "+ database.getNumberOfShapes());
        System.out.println("-------------------------------------------");
        System.out.println("Unsorted Shapes ---------------------------");
        //display unsorted shapes
        database.displayShapes();
        //sort
        database.sortShapes();
        System.out.println("------------------------------------------------------");
        System.out.println("Shapes sorted by perimeter ---------------------------");
        //display sorted shapes
        database.displayShapes();

    }
}
