class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo! Moo!");
    }
}

// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        // Using parent class reference for each subclass object
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        // Calling overridden methods
        myDog.makeSound();  // Dog's version
        myCat.makeSound();  // Cat's version
        myCow.makeSound();  // Cow's version
    }
}