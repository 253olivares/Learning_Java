public class AdditionalNotes {

    static void main(String[] args) {
        // Java wrapper classes
        // Wrapper classes provide a way to use primitive data types like (int,
        // booleans) as objects
        // The table below shows primitive types and the equivalent wrapper class
        // wrapper classes
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double
        // boolean -> Boolean
        // char -> Character

        // Sometimes you must user wrapper classes, for example when working with
        // Collection objects such as ArrayList, where primitive types cannot be used
        // (the list can only store objects

        // Creating wrapper objects
        // To create a Wrapper object, use the wrapper clase instead of a primitive typ
        // to get the value
        // you can just print the object

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt + " " + myDouble + " " + myChar);

        // The benefits of this approache is that these objects come with methods we can
        // use to modify our project
        // for example the following methods are used to get the value associated with
        // the corresponding wrapper object
        // intValue(), byteValue(), shortValue() ...

        System.out.println(myInt.intValue() + " " + myDouble.doubleValue() + " " +
                myChar.charValue());

        // another useful method is the toString() method, which is used to convert
        // wrapper objects to strings

    }
}
