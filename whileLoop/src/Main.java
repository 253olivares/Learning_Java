package whileLoop.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // While loop = executes a block of code as long as it's condition remains true.

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // as long as our codition in while is true it will continue to render the code
        // within
        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // for a do loop the difference
        // is setting the wile to the end and executes the code first before checking
        // meaning the block of code will always run once at the very least.

        // for ex:
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } while (name.isBlank());

        System.out.println("Hello " + name);

    }
}
