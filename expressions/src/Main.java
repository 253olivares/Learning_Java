package expressions.src;

public class Main {
    public static void main(String[] args) {
        // expressions = operands and operators
        // operands = values, variables, numbers quantity
        // operators = + - * / %

        int friends = 20;

        friends = friends + 1;

        // 11
        System.out.println(friends);

        friends = 20;

        friends = friends / 2;

        // 10
        System.out.println(friends);

        friends = 0;

        friends = friends % 2;

        // 0
        System.out.println(friends);

        // add 1
        friends++;

        // 1
        System.out.println(friends);

        // subtract 1
        friends--;

        // 0
        System.err.println(friends);

        // if for some reason you need to change your data type you need to add
        // () at the start before calculating your new data for example:

        int test = 2;

        // you need to make sure the variable you are changing the data type to is the
        // same
        double womp = (double) test / 3;
    }
}
