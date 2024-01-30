package task11;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Seventhques {
    public static void main(String[] args) {
        try {
            int enteredAge = getEnteredAge(); // Assume this method gets user input for age
            validateAge(enteredAge);
            System.out.println("Valid age: " + enteredAge);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }
  static int getEnteredAge() {
          return 16;
    }
}
