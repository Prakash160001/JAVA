package lab;

// Base class Shape
abstract class Shape {
    // Abstract method to calculate the area
    public abstract double getArea();
}

// Circle subclass that calculates the area of a circle
class Circle extends Shape {
    private int radius;

    // Constructor to initialize radius 
    public Circle(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    // Override to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);  
    }
}

// Square subclass that calculates the area of a square
class Square extends Shape {
    private int length;

    // Constructor to initialize the side length 
    public Square(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    // Override to calculate the area of the square
    @Override
    public double getArea() {
        return Math.pow(length, 2);  
    }
}

// Rectangle subclass that calculates the area of a rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor to initialize width and height 
    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    // Override to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height; 
    }
}

// Main class to test the shape subclasses
public class Main {
    public static void main(String[] args) {
        // Create instances of Circle, Square, and Rectangle
        Shape circle = new Circle(3);        
        Shape square = new Square(6);        
        Shape rectangle = new Rectangle(4, 8);

        // Call getArea() 
        System.out.println("Area of Circle with radius 3: " + circle.getArea());
        System.out.println("Area of Square with side 6: " + square.getArea());
        System.out.println("Area of Rectangle with width 4 and height 8: " + rectangle.getArea());
    }
}



