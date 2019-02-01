package main.java;

public class Triangle extends Shape {
    private double base, height;

    public Triangle(double x, double y, double base, double height) {
        super(x,y, base + height + Math.sqrt(base*base + height*height));
        this.base = base;
        this.height = height;
    }
    public void display() {

        System.out.println("Displaying Triangle with base " + base + ", height = " + height
                + ", starting coordinate x= "+ super.getX() + ", y = " + super.getY()
                + ", perimeter = " + super.getPerimeter());
    }
}
