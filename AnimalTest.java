public class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();

        genericAnimal.sound();  // Calls Animal's version
        myDog.sound();          // Calls Dog's overridden version
    }
