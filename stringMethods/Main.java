package stringMethods.src;

public class Main {
    public static void main(String[] args) {

        // String = a Reference data type that can store one or more characters
        // Reference data types have access to useful methods.

        String name = "test";

        // some functions within the string class

        boolean result = name.equals("womp womp");
        // will return false since womp womp =/= test
        // note: strings are case sensitive

        System.out.println(result);

        int result2 = name.length();
        // return length of test or whatever we set name to
        // For this example it will return 4

        System.out.println(result2);

        char result3 = name.charAt(0);
        // this will return the letter at the specific index provided
        // in this case we will return 0

        System.out.println(result3);

        int result4 = name.indexOf(result3);
        // this will return the position we found our character
        // since result is teh character at index 0 it should be t and t in our string
        // is index 0
        // so result4 == 0

        System.out.println(result4);

        boolean result5 = name.isEmpty();
        // a bit self explanitory this checks if our string is empty.
        // Only return true when our string is empty

        System.out.println(result5);

        String result6 = name.toUpperCase();
        // will change all the characters in our string to upper case
        System.out.println(result6);

        String result7 = name.toLowerCase();
        // will do the same as toUpperCase but converts letters in string to lowercase
        // instead;

        System.out.println(result7);

        String result8 = name.trim();
        // will remove empty space before or after a string
        // ex: " " => "" | " test" => "test" | "test " => "test"

        System.out.println(result8);

        String result9 = name.replace('e', 'a');
        // this will replace each instance of the first character with the new character
        // specified
        // for this example it will change test to tast;

        System.out.println(result9);

    }
}
