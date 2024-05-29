package variablesInJava;

public class Main {
    public static void main(String[] args) {
        // working with values and variables in java

        /*
         * to store variables in java we meed to specify the data type before storing it
         * common data types:
         * boolean true or false
         * byte -128 to 127
         * short -32,768 to 32,767
         * int -1 billion to 1 billion
         * long any value up to quintillion
         * float 2.34234 6-7 digits
         * double 3.242 up to 15 digits
         * char '@#!$' single characters / letters / ASCII value
         * FOR CHAR DATA VALUES NEEDS TO BE WRAPPED AROUND '' INSTEAD OF ""
         * string 'Hello World' sequence of characters
         * 
         * We need to specify a data type bc the computer needs to know how many
         * bites to use to store the variable
         * 
         * So its important to know which data types to use
         */

        // To declare a variable we need to call data type followed by its variable name

        // integer x with the value of 123
        int x = 123;

        int y; // declaration

        y = 123; // initialization

        // add both variables and print our sum
        System.out.println(x + y);

        // we can string concat our int variable and string
        System.err.println("My number is: " + x + y);
        // if we wrap our viarables around () our code will get the sum of the two
        // numbers
        // before concating them to our string
        System.err.println("My number is: " + (x + y));

        // now we have an example of a really long variable that is outside the space
        // of a integer since it only allows variables up to 1 billion
        // so instead opf int it will be changed to a long.
        // int newNumber = 1000000000000;

        // when doing this we need to follow the number with an L to signify a L;
        long newNumber = 10000000000000L;

        // same applys to float an f has to be added at the end of a number
        float secondNumber = 100.22f;

        // doubles provide the same function but do not require the f at the end of our
        // number

        double thirdNumber = 100.22;

        // for booleans its just simple as setting our type and initizing it
        // one dif of a boolean however compared to others is that a value needs to be
        // set

        boolean trueorFalse = true;

        // chars are unique since the only hold one value

        // this is legal
        char symbol = '$';

        // not legal
        // char symbol = '$#%';

        String name = "Miguel Olivares";
    }
}
