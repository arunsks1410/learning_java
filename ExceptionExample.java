// Builtin Exception

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.management.RuntimeErrorException;

class ExceptionExample {
    public static void main(String[] args) {

        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("line no 3");
            System.out.println("line no 4");
            System.out.println(numbers[3]);
        } catch (Exception e) {
            System.out.println("exception : " + e);
            // System.out.println("Invalid index array size is only : " + numbers.length);
        }
        System.out.println("line no 12 ");
        System.out.println("line no 13 ");
    }
}

// User defined Exception example

class UserAlreadyExists extends Exception {
    UserAlreadyExists(String message) {
        super(message);
    }

}

class UserDefinedExceptionExample {
    public static void main(String[] main) throws FileNotFoundException { // handling excpetions via methods
        try {
            System.exit(0); // Shutting down the JVM
            FileReader fc = new FileReader("InterfaceExample.java"); // compile time exception check if we dont handle
                                                                     // exception compiler will throw an error.
            String name = "krishna";
            if (name.equals("krishna")) {
                throw new UserAlreadyExists("user ALreay exist !!!! ");
            }
            String number = "hello123";
            int num = Integer.parseInt(number);

        } catch (UserAlreadyExists e) {
            System.out.println("Exception ! " + e);
        } catch (NumberFormatException e) {
            System.out.println("Number format Exception !! " + e);
        }
        // catch (FileNotFoundException e) {
        // System.out.println("file not found exception check !!! ");
        // }
        finally {
            // throw new RuntimeErrorException("Exception in finally");
            // throw new UserDefinedExceptionExample("user already exists");
            // System.out.println("inside finally !!!! ");
        }

        System.out.println("line number 40 : ");

    }
}

// creating exception in finally
// finally will override all the exception and if it found any then will throw
// the exception mentioned in finally block.
class FinallyExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println("Executing ");
            int x = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            throw new RuntimeException("run time exception !!! ");
        }
    }
}

// Multiple way to handle Exception in single catch block
// try {
//     int[] arr = new int[5];
//     arr[10] = 100; // ArrayIndexOutOfBoundsException
//     int x = 10 / 0; // ArithmeticException
// } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//     System.out.println("Handled: " + e);
// }
