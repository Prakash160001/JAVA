package labs;

//Abstract class representing a Shape
abstract class Shape {
 // Abstract method to calculate area
 abstract double calculateArea();
}

//Circle class extending Shape
class Circle extends Shape {
 private double radius; 

 // Constructor to initialize the radius of the circle
 public Circle(double radius) {
     this.radius = radius;
 }

 //Override the calculateArea method to compute the area of the circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius; 
 }
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 private double length; 
 private double width;  

 //Constructor to initialize length and width of the rectangle
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 //Override the calculateArea method to compute the area of the rectangle
 @Override
 public double calculateArea() {
     return length * width; 
 }
}

//Main class 
public class ShapeMain {
 public static void main(String[] args) {
     Shape circleShape = new Circle(7); 
     Shape rectangleShape = new Rectangle(6, 8);

     //Calculate and print the area of the Circle
     System.out.printf("Area of Circle: %.2f%n", circleShape.calculateArea());

     //Calculate and print the area of the Rectangle
     System.out.printf("Area of Rectangle: %.2f%n", rectangleShape.calculateArea());
 }
}

