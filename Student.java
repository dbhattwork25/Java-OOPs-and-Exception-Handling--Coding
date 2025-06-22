public class Student {
    // Instance variable
    String name;
    int rollNo;
    char section;

    // Constructor
    Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print student details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Section: " + section);
        System.out.println("------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        // Create two student objects
        Student student1 = new Student("Suhani", 101, 'A');
        Student student2 = new Student("Amit", 102, 'B');

        // Print details
        student1.printDetails();
        student2.printDetails();
    }
}