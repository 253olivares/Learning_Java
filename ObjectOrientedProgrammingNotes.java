public class ObjectOrientedProgrammingNotes {
    public static void main(String[] args) {
        // OOP
        // Procedural programming is about writing procedures or methods that perform
        // operations
        // on the data, While object oriented programming is about creating objects that
        // can contain both data and methods

        // benefits of OOP
        // Faster and easier to execute
        // provide clear structure
        // helps keep java code DRY
        // easier to maintain
        // easier to debug
        // easier to modify
        // OOP makes it possible to create fully reusable applications
        // with less code and shorter development time

        // DRY is about reducing the repetition of code

        // When programming in OOP
        // we have two main aspects
        // classes and objects
        //

        // Class is a template for an object
        // Object is an instance of the class

        // ex:
        // Class : Car
        // Objects : Volvo, Audi, Toyota

        // calling and creating an instance of our obj
        ObjectOrientedProgrammingNotes obj = new ObjectOrientedProgrammingNotes();

        // createing multiple instance of the same class
        MainClass myObj = obj.new MainClass(); // object 1
        MainClass myObj2 = obj.new MainClass(); // object 2
        System.out.println(myObj.x);
    }

    // Everything in java is associated with classes and objects, along with its
    // attributes and methods.
    // For example: in real life, a car is an object
    // the car has attributes such as weight and color
    // and methods such as drive and brake

    // to create a class use the keyword class

    // normally this would be created within its own file
    // when classes are created they need to match the file name
    // otherwise this is a nested class

    // class name = main
    private class MainClass {
        // attributes
        int x = 5;
    }
    // we can now call this class in our public static void main and print our our
    // attribute

}
