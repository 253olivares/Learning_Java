package switchStatement.src;

public class Main {
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a
        // list of values

        // for ex:

        String day = "Monday";

        switch (day) {
            case "Sunday":
                System.out.println("It is sunday dawg!");
                // break will stop our code from running once it has found a match
                break;
            case "Monday":
                System.out.println("It is Monday yippie!");
                // break our once found
                break;
            default:
                // if no match is found then run the code in default
                System.out.println("Day not recognized please try again!");
                break;
        }
    }
}
