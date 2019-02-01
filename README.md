# CSCI-5448-OOAD HW1

##Team members:
1. Shipra Behera 
2. Vandana Sridhar
3. Akase Iyengar
4. Pranav Sivakumar

##Notes:
Shape is an abstract class for different kinds of shapes like Circle, Square, Triangle. It takes the central coordinates - (x,y), and perimeter of the shape, as parameters.

3 different subclasses have been inherited - Circle, Square and Triangle and each calculate their own perimeter, and override the display function.

ShapeDatabase instantiates new shapes and stores them in a collection. It also provides utility functions to display each shape, *sort them based on perimeter*.

ShapeTest contains the main method. It instantiates a database object and calls the utility functions of ShapeDatabase.