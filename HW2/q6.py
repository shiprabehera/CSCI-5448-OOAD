'''
The important change from the previous implementation is in the ShapeDatabase class
Last time we had hard-coded the shapes in the database inside ShapeDatabase class, but this time we made it work more like a Database 
which receives Shapes that can be stored into it, and stores them. 
By this change, the main function doesn't know "how" the Shapes are inserted into the database. It just calls insertShape to
add a new shape. That work is delegated to the ShapeDatabase class, which uses an array to store them.
Finally, we end up with a system that has better abstraction.
'''

import math

class Shape():
    '''
    The abstract class that represents a shape
    with starting coordinate (x,y) and perimeter
    '''
    def __init__(self, x,y,perimeter):
        self.x, self.y, self.perimeter = x,y,perimeter

    def display(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def getX(self):
        return self.x

    def getY(self):
        return self.y

    def getPerimeter(self):
        return self.perimeter

class Triangle(Shape):
    '''
    A Subclass that represents a Triangle with x,y,base,height
    '''
    def __init__(self,x,y,base,height):
        super().__init__(x,y,math.sqrt(base**2 + height**2))
        self.base, self.height = base, height

    def display(self):
        print("Displaying Triangle with base " + str(self.base) + ", height = " + str(self.height)
        + ", starting coordinate x= "+ str(super().getX()) + ", y = " + str(super().getY())
        + ", perimeter = " + str(super().getPerimeter()))

class Square(Shape):
    '''
    A Subclass that represents a Square with x,y,side-length
    '''
    def __init__(self,x,y,side):
        super().__init__(x,y,4*side)
        self.side = side

    def display(self):
        print("Displaying Square with side " + str(self.side)
        + ", starting coordinate x= "+ str(super().getX()) + ", y = " + str(super().getY())
        + ", perimeter = " + str(super().getPerimeter()))

class Circle(Shape):
    '''
    A Subclass that represents a Circle with x,y,radius
    '''
    def __init__(self,x,y,radius):
        super().__init__(x,y,2*math.pi*radius)
        self.radius = radius

    def display(self):
        print("Displaying Circle with radius " + str(self.radius)
        + ", starting coordinate x= "+ str(super().getX()) + ", y = " + str(super().getY())
        + ", perimeter = " + str(super().getPerimeter()))

class ShapeDatabase():
    '''
    A Class that represents a Database that store,sort and display Shapes
    '''
    def __init__(self):
        self.shapes = []

    def insertShape(self,shape):
        self.shapes.append(shape)

    def sortShapes(self):
        #sort all the shapes in the database by their perimeters
        self.shapes.sort(key = lambda x:x.getPerimeter())

    def getNumberOfShapes(self):
        return len(self.shapes)

    def displayShapes(self):
        for x in self.shapes:
            x.display()

if __name__ == '__main__':

    #intializing a database
    db = ShapeDatabase()
    db.insertShape(Circle(2,2,3))
    db.insertShape(Square(0,2,5))
    db.insertShape(Triangle(1,2,3,4))

    #display number of shapes
    print("Number of shapes are: ",db.getNumberOfShapes()," \n")
    print("The unsorted shapes in the database are, \n")
    #display the unsorted shapes
    db.displayShapes()
    #apply sorting
    db.sortShapes()
    print("\nAfter sorting by their perimeters,we get \n")
    #display the unsorted shapes
    db.displayShapes()
