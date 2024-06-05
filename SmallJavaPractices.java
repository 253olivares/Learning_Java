
// class names when creating them need to match the file name
public class SmallJavaPractices {
    // main method string needed to begin a program or code string in java
    public static void main(String[] args) {
        // printing string
        System.out.println("string");

        // Single comment

        /*
         * Multiple comment line
         * 
         */

        String myString = "string"; // has to wrapped in "" and not ''
        int myint = 2; // integers (whole numbers), without decimals 123 or -123
        float myFloat = 1.223f; // store floating point numbers with decimals such as 19.99 or -19.99
        char myCharacters = '!'; // stores a single characters such as 'a' or 'B'.
        // special note about char : These characters must be surounded by '' and not ""
        // these are single value
        boolean myBoolean = false; // stores a true or false value

        // type variableName = variableValue;

        // declare mulitpleVariables

        // we can declare multiple variables using commons to separate each variables
        int x = 5, y = 6, z = 23;

        // rules for nameing our variables / identifiers
        // names can contain letters, digits, underscores, and dollar signs
        // names must begin with a letter,
        // names should start with a lowercase letter, and cannot contain whitespace
        // names can also begin with $ and _
        // names are case sensitive
        // you can not used reserved works like in or boolean for names

        // data types are split into 2 groups

        // primitive : byte, short, int, long, float, double, boolean, and char

        // non-primitive : String, Arrays, and Classes

        // primitive data types
        // byte - 1 byte - stores while numbers from -128 127
        // short - 2 bytes - stores while numbers from -37,768 ti 32,767
        // int - 4 bytes - stores whole numbers from -2,147,483,648 to 2,147,483,648
        // long - 8 bytes - Stores whole numbers from -9,223,372,036,854,775,808 to
        // 9,223,372,036,854,775,807
        // add L at the end of a number
        // float - 4 bytes - Stores fractional numbers. Suffficient for storing 6 to 7
        // decimal digits
        // add f at the end of a number
        // double - 8 bytes - Stores fractional numbers. suffifient for storing 15
        // decimal digits
        // add d at the end of a number
        // boolean - 1 bit - stores true or false
        // char - 2 bytes - stores a single character or letter

        // non primitive data types are called reference types
        // there are a couple ways of easily telling the difference between primitive
        // and non-primitive

        // primitive types are pre defined. They come included in java (except for
        // String)
        // non-primitive types can be used to call methods and perform certain
        // operations
        // primitive types will always have a vlaue
        // non-primitive values may be null
        // primitive types start with lowercase letters while non primitive do not

        // java type casting
        // we can assing a value of one primitive type to another
        // widening casting (automatically done)
        // byte -> short -> char -> int -> long -> float -> double
        // narrow casting
        // double -> float -> long -> int -> char -> short -> byte

        // number starts as a float and is cast into becoming a int
        int castingNumber = (int) 2.22f;

        int number2 = (int) '2';

        // java operators
        // operators in java let us perform different types
        // of operations on variables and values within java
        // common type +
        int newAdd = 1 + 1;

        // we have several different type of operators we can use
        // arithmetic operator
        // assignment operator
        // Comparison operator
        // logical operator
        // bitwise operator

        // Addition +
        // Subtraction -
        // Multiplication *
        // Division /
        // Modulus %
        // Increment ++
        // Decrement --

        // assignment operator
        // =

        // addition assignment
        // +=

        // list of assignment operators
        // =
        // +=
        // -=
        // *=
        // /=
        // %=
        // &=
        // !=
        // ^=
        // >>=
        // <<=

        // java comparison operator
        // ==
        // !=
        // >=
        // <=
        // <
        // >

        // Java logical operators
        // &&
        // ||
        // !

        // some wrapper classes like String come with methods that can be called
        // to manipulate our string data

        // string length
        String text = "Womp Womp";
        System.out.println(text.length());

        // More string methods
        // change the text to be upper or lower case
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        // find a character in a string
        System.out.println(text.indexOf('0'));

        // String contatenation
        String fName = "Miguel";
        String lName = "Olivares";

        System.out.println(fName + " " + lName);
        // or System.out.println(fName.concat(lName))
        // expected output Miguel Olivares

        // java math
        // we have some math methods we can call to run math functions with java

        // return the largest number for the values provided
        int max = Math.max(5, 10);

        // return the smallest number for the values provided
        int min = Math.min(3, 7);

        // return square root for number provided
        int sqrt = (int) Math.sqrt(2);

        // return absolute value of the value provided
        int absoluteValue = Math.abs(-2);

        // return a number between 0 and 1
        double randomNumber = Math.random();

    }
    // A method is a block of code which only runs when its being called
    // you can pass data, known as parameters into a method

    // Why use methods? To reuse code: define the code once and use it multiple
    // times

    // create a method
    // define the name of a method followed by parentheses ()

    // example method
    static void printMethod() {
        System.out.println("Print out code!");
    }

    // printMethod - is the name of our method
    // static mean the method belongs to the class and not an object of our class
    // void means the method does not return a value

    // we can pass parameters to our methods to act as variables within the method

    // parameters are specified after the method name inside the parentheses
    // you can add as much as you want just make sure to separate by parenthesis

    static void printMethod2(String name1, String name2, int number1) {
        System.out.println(name1 + " " + name2 + number1);
    }

    // when declaring methods we can call a return value that tells java what it
    // should expect when it calls the method
    // calling the method

    static String printMethod3(String x) {
        return (String) x;
    }

    // Method overload
    // one unique feature of java is allowing us to create an overloaded method
    // an overloaded method allows us to have methods with the same name
    // but different params
    // the code will call the method that fits the params provided
    // ex:

    static String printMethod4(String x) {
        return x;
    }

    // both methods have the same name but are registered differently because of the
    // params
    static String printMethod4(String x, int y) {
        return x + y;
    }

    // Java scope
    // Java variables are only accessible inside the region they are created
    // this is called scope

    // Method scope
    // anything defined inside a method is only available within the method defined

    public void printMethod5() {
        String x = "crab";
        System.out.println(x);
    }

    public void printMethod6() {
        //
        // this will not work since x is defined in the method above this one
        // System.out.println(x);

        // if we wanted to use x in multiple methods we need to pass it or define
        // our variable outside the method inside the class itself
    }

}
