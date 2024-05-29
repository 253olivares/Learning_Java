package wrapperClasses;

public class Main {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data
        // types
        // reference data types contain useful methods
        // can be used with collections (ex:ArrayList)

        // Primitive // Wrapper
        // --------- // -------
        // boolean Boolean
        // char Character
        // int Integer
        // double Double

        // autoboxing = the automatic conversion that the java compiler makes between
        // primitive and their corresponding object wrapper class.
        // unboxing = the reverse of autoboxing. automatic conversion of wrapper class
        // to
        // primitive;

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;

        String e = "Bro";

        // bc of autoboxing a behaves the same as if we labeled it as boolean
        if (a == true) {
            System.out.println("this is true");
        }
    }
}
