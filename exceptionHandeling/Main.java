package exceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exception = an event that occurs during the execution of a program that
        // disrupts the normal flow of instructions.

        // try blocks are an easy method for error handling.
        // if our code detects an error in any user input or code execution
        // it will stop the code and run what ever we have in our catch block

        Scanner scanner = new Scanner(System.in);

        try {
            // ex of exception handling;

            System.out.println("Enter a while number to divide:");
            int x = scanner.nextInt();

            System.out.println("Enter a while number to divide by:");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result is: " + z);
            // when we create a catch block we accept a value of our error
            // when we do we need to specify what time of error we are expecting to receive
            // in this case arithmetic exception as our scanner should only
            // be relieving integers
        } catch (ArithmeticException e) {
            System.out.println("Please make sure to enter an whole number!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter in a number no letters or symbols!");
            // sometimes if a user is not sure what error to expect they can
            // pass Exception which just takes in all errors
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        // after catch we can provide a finally block
        // this block runs whenever our code finishes
        // this runs no matter if the code is successful or not
        // this is important to include to close an listener or scanner that may of be
        // created at the start of the code
        // that is no longer needed
        finally {
            System.out.println("This will always print!");
            scanner.close();
        }

    }
}
