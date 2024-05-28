package ifStatements.src;

public class Main {
    public static void main(String[] args) {
        // if statements = performs a block of code if its condition is true
        // functions identical to if statements in javascript

        int age = 19;

        if (age >= 19 && age <= 300) {
            System.out.println("You are an grown adult!");
        } else if (age == 23) {
            System.out.println("You are 23");
        } else {
            System.out.println("You are a baby or lying about your age!");
        }
    }
}
