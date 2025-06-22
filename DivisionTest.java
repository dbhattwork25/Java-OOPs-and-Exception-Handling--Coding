public class DivisionTest {
    public static void main(String[] args) {
        try {
            // Simulate input via command line arguments
            // args[0] = numerator, args[1] = denominator

            if (args.length < 2) {
                throw new ArrayIndexOutOfBoundsException("Two arguments required: numerator and denominator");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}
