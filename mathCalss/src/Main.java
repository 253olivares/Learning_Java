package mathCalss.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // double x = 3.14;
        // double y = -10;

        // // allows u to compare two values and return the largest
        // double z = Math.max(x, y);

        // System.out.println(z);

        // // return the smaller number
        // double min = Math.min(x, y);

        // System.out.println(min);

        // double abs = Math.abs(y);

        // // display the absolute variable which negates all negative values and turns
        // // them positive
        // System.out.println(abs);

        // double sqrt = Math.sqrt(x);

        // // you need to make this value poositive first as it will return an error if
        // // negative
        // System.out.println(sqrt);

        // // round our number
        // double round = Math.round(x);

        // // will always round up
        // double ciel = Math.ceil(x);

        // // will always round down.
        // double floor = Math.floor(x);

        // find the value of a hypotenuse triangle
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

        System.out.println("Your length for side C is: " + c);

        // after you are done using a scanner it is good practice to close your scanner
        // to prevent memory leaks
        scanner.close();
    }
}
