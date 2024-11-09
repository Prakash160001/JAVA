package Car;

import java.util.Scanner;

//Class representing a Calculator
class Calculator {
 // Method to add two integers
 public int add(int a, int b) {
     return a + b;
 }

 // Method to add three integers
 public int add(int a, int b, int c) {
     return a + b + c;
 }

 // Method to add two doubles
 public double add(double a, double b) {
     return a + b;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); // Scanner for user input
     Calculator c = new Calculator();  // Create a object

     // Adding two integers
     System.out.print("Enter first integer: ");
     int int1 = scanner.nextInt();
     System.out.print("Enter second integer: ");
     int int2 = scanner.nextInt();
     System.out.println("Sum of two integers: " + c.add(int1, int2));

     // Adding three integers
     System.out.print("Enter third integer: ");
     int int3 = scanner.nextInt();
     System.out.println("Sum of three integers: " + c.add(int1, int2, int3));

     // Adding two doubles
     System.out.print("Enter first double: ");
     double double1 = scanner.nextDouble();
     System.out.print("Enter second double: ");
     double double2 = scanner.nextDouble();
     System.out.println("Sum of two doubles: " + c.add(double1, double2));
     
     scanner.close();

     
 }
}
