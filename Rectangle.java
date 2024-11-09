package anu;

import java.util.*;

//Class representing a rectangle
class Rectangle {
 // Attributes for length and width
 private int length;
 private int width;

 // Constructor to initialize length and width
 public Rectangle(int length, int width) {
     this.length = length;
     this.width = width;
 }

 // Method to calculate the area of the rectangle
 public int calculateArea() {
     return length * width;
 }

 public static void main(String[] args) {
     Random random = new Random();

     // Instantiate two Rectangle objects with random lengths and widths
     Rectangle rectangle1 = new Rectangle(random.nextInt(11) + 1, random.nextInt(11) + 1);
     Rectangle rectangle2 = new Rectangle(random.nextInt(11) + 1, random.nextInt(11) + 1);

     // Calculate the areas of both rectangles
     int area1 = rectangle1.calculateArea();
     int area2 = rectangle2.calculateArea();

     // Compare the areas using relational operators
     if (area1 > area2) {
         System.out.println("Rectangle 1 > Rectangle 2");
     } else if (area1 < area2) {
         System.out.println("Rectangle 1 < Rectangle 2");
     } else {
         System.out.println("They are equal");
     }

     // Print the areas for reference
     System.out.println("Area of Rectangle 1: " + area1);
     System.out.println("Area of Rectangle 2: " + area2);
 }
}
