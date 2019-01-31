package main.java;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public void display() {
        System.out.println("Displaying Circle with radius " + radius
                + ", starting coordinate x= "+ super.getX() + ", y = " + super.getY());
    }
}
