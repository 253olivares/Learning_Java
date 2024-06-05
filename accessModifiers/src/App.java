public class App {
    public static void main(String[] args) throws Exception {
        // The public key in our main method and class is an access madifier
        // meaning that it sets the access level for classes, attributes, methods, and
        // constructors
        //

        // modifiers are split into 2 groups
        // access modifiers - controls to the access level
        // non-access modifiers - to not control access level, but provides other
        // functionality

        // access modifiers
        // for classes you have
        // public p class can be access by any other class
        // default - class is only accessible by classes in the same package
        // this is used when we dont specify a medifier

        // For attributes, methods, and constructors we can apply one of the following
        // public - Code is accessible for all classes
        // private - The code is only accessible within the declared class
        // default - The code is only accessible win the same package
        // protected - Code is accessible within the same package and sub classes

        // Non-access modifiers for classes
        // final - the class cannot be inherited y other classes
        // abstract - the class cannot be used to create objects
        // to use abstract classes it must first be inherited by another class

        // access modifiers for attributes and methods
        // final - Attributes and methods cannot be overridden/modified
        // static - Attributes and methods belongs to the class, rather an a object
        // abstract - Can only be used in abstract classes and can only be used on
        // methods
        // the method does not have a body for example abstract void run();
        // the body is provided by the subclass
        // transient - Attributes and methods are skipped when serialized the object
        // contained then
        // synchronized - methods can only be accessed by one thread at a time
        // volatile - The value of an attribute is not cached thread locally, and is
        // always read from the main memory
    }
}
