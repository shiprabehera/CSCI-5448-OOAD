package main.java;

public class Square extends Shape{
    private double side;

    public Square(double x, double y, double side) {
        super(x, y, 4 * side);
        this.side = side;
    }
    public void display() {

        System.out.println("Displaying Square with side " + side
                + ", starting coordinate x= "+ super.getX() + ", y = " + super.getY()
                + ", perimeter = " + super.getPerimeter());
    }
}
