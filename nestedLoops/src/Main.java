package nestedLoops.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            // this is in charge of our rows

            // when we leave our column row
            // we break the line and create a new row and repeat the process.
            System.out.println();
            for (int x = 1; x <= columns; x++) {
                // this is in charge of our columns once we have finished printing our symbol
                // the number of times we want it to exist in a row we exit the for loop
                System.out.print(symbol);
            }
        }
    }
}
