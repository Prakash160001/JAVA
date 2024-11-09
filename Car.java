package Car;

import java.util.Scanner;

//Class representing a Car
class Car {
 // Attributes
 private String make;   
 private String model;  
 private short year;    
 private int price;     

 // Constructor to initialize car details
 public Car(String make, String model, short year, int price) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.price = price;
 }

 // Method to display car details
 public void displayInfo() {
     System.out.println("Car Details:");
     System.out.println("Make: " + make);
     System.out.println("Model: " + model);
     System.out.println("Year: " + year);
     System.out.println("Price: " + price);
     System.out.println();
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); // Scanner for user input

     System.out.print("Enter car make: ");
     String make = scanner.nextLine();

     System.out.print("Enter car model: ");
     String model = scanner.nextLine();

     System.out.print("Enter car year: ");
     short year = Short.parseShort(scanner.nextLine());

     System.out.print("Enter car price: ");
     int price = Integer.parseInt(scanner.nextLine());

     // Create a Car object with user input
     Car c = new Car(make, model, year, price);

     // Display the car details
     c.displayInfo();

     scanner.close();
 }
}

	


