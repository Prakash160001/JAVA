package labs;
//Abstract Animal class 
class Animal {
 //Method to make a sound
 void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Dog class extending Animal 
class Dog extends Animal {
 //Overriding the makeSound method for the Dog class
 @Override
 void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Cat class extending Animal 
class Cat extends Animal {
 //Overriding the makeSound method for the Cat class
 @Override
 void makeSound() {
     System.out.println("The cat meows.");
 }
}
 public class AnimalMain {
   public static void main(String[] args) {
     //Create an Animal object 
     Animal myAnimal = new Animal();
     
     //Create a Dog object 
     Animal myDog = new Dog();
     
     //Create a Cat object 
     Animal myCat = new Cat();

     System.out.println("Animal Sound:");
     myAnimal.makeSound();
     System.out.println();

     //Displaying sound made by dog
     System.out.println("Dog Sound:");
     myDog.makeSound();
     System.out.println();

     //Displaying sound made by cat
     System.out.println("Cat Sound:");
     myCat.makeSound();
 }
}


