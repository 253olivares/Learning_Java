public class AdditionalNotes {
    public static void main(String[] args) {
        // Java Exceptions
        // When executing java code, different errors can occur: coding errors made by
        // the programmer, errors due to wrong input, or other unforseeable things

        // when an error occurs, Java will normally stop and generate an error message.
        // The technical term for this is: Java wil thro an exception (throw an error)

        // Java try and catch
        // the try statement allows you to define a block of code to be tested for
        // errors while it is being executed
        // the catch statement allows us to define a block of code to be executed
        // The try and catch keywords come in pairs

        // ex:
        try {

        } catch (Exception e) {

        }
        // consider the following example
        // this will generate an error, because myNumbers[10] does not exist
        // int[] myNumbers = {1,2,3};
        // System.out.println(myNumbers[10]);
        // try and catch will prevent our code from crashing when catching our error
        // above

        // Finally
        // The finally statment lets you execute code, after try...catch regardless of
        // the resut

        // The throw keyword
        // the throw statement allows you to create a custom error.

        // The throw statement is used together with an exception type
        // there are many exceptions types available in java
        // arithmeticException
        // FileNotFoundException
        // ArrayIndexOutOfBoundsException
        // SecurityException

        checkAge(15);
    }

    static void checkAge(int age) {
        if (age < 18) {
            // thorw arithetic exceptions
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            // otherwise print permission granted
            System.out.println("Access granted - You are old enough!");
        }
    }
    
}
