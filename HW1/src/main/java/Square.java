package main.java;

public class Square extends Shape{
    private double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }
    public void display() {
        System.out.println("Displaying Square");
    }
}
