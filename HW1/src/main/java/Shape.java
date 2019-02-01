package main.java;

public abstract class Shape {
    private double x, y, perimeter;

    public Shape(double x, double y, double perimeter) {
        this.x = x;
        this.y = y;
        this.perimeter = perimeter;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void display() {
        System.out.println("Drawing...");
    }
}
