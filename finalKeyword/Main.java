package finalKeyword;

public class Main {
    public static void main(String[] args) {
        // anything final can not be change later in the program.
        // this is the equivalent to using const

        // legal
        double pi = 3.1456;

        pi = 4;

        System.out.println(pi);

        final double pi2 = 3.16123;

        // illegal
        // pi2 =4;

    }
}
