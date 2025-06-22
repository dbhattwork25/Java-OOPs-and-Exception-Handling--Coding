// Custom Exception Class
public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("InvalidAgeException: Age must be 18 or above. Provided age: " + age);
    }
}

// Age Validator Class
public class AgeValidator {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        int[] testAges = {15, 25};

        for (int age : testAges) {
            try {
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
