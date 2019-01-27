package main.java;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double x, double y, double base, double height) {
        super(x,y);
        this.base = base;
        this.height = height;
    }
    public void display() {
        System.out.println("Displaying Triangle");
    }
}
