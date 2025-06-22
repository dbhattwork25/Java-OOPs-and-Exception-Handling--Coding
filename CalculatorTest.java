public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    // Add a double and an integer
    public double add(double a, int b) {
        return a + b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(5, 10));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));
        System.out.println("add(double, double): " + calc.add(3.5, 4.5));
        System.out.println("add(int, double): " + calc.add(7, 2.5));
        System.out.println("add(double, int): " + calc.add(6.2, 4));
    }
}
