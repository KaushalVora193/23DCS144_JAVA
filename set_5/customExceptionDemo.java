// User-defined exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class customExceptionDemo {
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException(" Age is less than 18, Not Allowed!");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); 
        } catch (CustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
