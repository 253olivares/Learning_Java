package printf.src;

public class Main {
    public static void main(String[] args) {
        // printf() and optional method to control, format, and display text to the
        // console window
        // Two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d ", 123);

        System.out.printf("%d This is a format string", 123);

        // conversion-character
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Miguel";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b ", myBoolean);
        System.out.printf("%c ", myChar);
        System.out.printf("%s ", myString);
        System.out.printf("%d ", myInt);
        System.out.printf("%f ", myDouble);

        // width
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString); // HELLO W ____

        // percision
        // set number of digits of pervision when outputting floating point values
        System.out.printf("You have this much money %.2f", myDouble); // x.00

        // flags
        // add an effect to output based on the flag to format specifier
        // - : left justify
        // + : output a plus or minus sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000;
        System.out.printf("You have this much money %20f", myDouble);
    }
}
