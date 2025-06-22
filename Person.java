public class Person {
    // Instance Variable
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print details
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing their details
        person1.printDetails();
        person2.printDetails();
    }
}