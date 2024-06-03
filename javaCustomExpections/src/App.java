import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // exception = an event, after execution, that disrupts the normal of the
        // execution
        //

        // user defined exceptions = custom exceptions
        // DuplicateEmail, InvalidCreditException, ageException

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occurred: " + e);
        }

    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("\n" + "User is below age!");
        } else {
            System.out.println("You are now signed up!");
        }
    }
}
