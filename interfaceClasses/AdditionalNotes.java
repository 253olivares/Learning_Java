public class AdditionalNotes {
    public static void main(String[] args) {
        // Another way to achieve abstraction in java is with interfaces
        // an interface is a completely "abstract class" that is used to group related
        // methods ith empty bodies
        // ex:

        interface Animal {
            public void animalSound();

            public void run();
        }

        interface SecondInterface {

        }

        // to access the interface methods the interface must be implemented (Kinda like
        // inherited) by another class
        // with the implements keyword (instead of extends). The body of the interface
        // method is provided by the implement class

        // We can do multiple interface
        class pig implements Animal, SecondInterface {

        }

        // notes:
        // like abstract classes, interface cannot be used to create objects
        // Interface methods do not have a body - the body is provided by the implement
        // class
        // On implementation of an interface, you must override all of its methods
        // INterface methods are by default abstract and public
        // Interface attributes are by default public, static, and final
        // An interface cannot contain a constructor
        // Why and when to use an interface
        // To achieve security
        // we would want to use an interface to hide certain details and only sho the
        // important details of an object

        // Java does not support multiple inheritance
        // a class can only inherit from one superclass
        // this is possible to achieve with interface classes, because teh class can
        // implement mulitple interfaces
        //
    }
}
