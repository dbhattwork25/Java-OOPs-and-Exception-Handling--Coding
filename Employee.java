public class Employee {
    // Private instance variables
    private int id;
    private String name;
    private double salary;

    // Public getter for id
    public int getId() {
        return id;
    }

    // Public setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary with basic validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be positive.");
        }
    }

    // Method to display employee details
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("------------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setId(1001);
        emp.setName("Damodar");
        emp.setSalary(75000.00);

        // Displaying values
        emp.printDetails();

        // Trying to set invalid salary
        emp.setSalary(-5000);  // Will show error message
    }
}