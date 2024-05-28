package logicalOperators.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        // && = (AND) Both conditions must be true;
        // || = (OR) either condition must be true;
        // ! = (NOT) reverses boolean value of a condition

        int temp = 25;

        // and operator
        if (temp > 30) {
            System.out.println("it is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("it is warm outside");
        } else {
            System.out.println("it is cold outside");
        }

        // or operator
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit!");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You have quit the game!");
        } else {
            System.out.println("You are still logged in the game!");
        }

        // not operator
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit!");
        String response2 = scanner.next();

        if (!response2.equals("q") && !response2.equals("Q")) {
            System.out.println("You are still logged in the game!");
        } else {
            System.out.println("You have quit the game!");
        }
    }
}
