package main.java;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, double radiius) {
        super(x, y);
        this.radius = radius;
    }
    public void display() {
        System.out.println("Displaying Circle");
    }
}
