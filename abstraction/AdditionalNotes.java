public interface AdditionalNotes {
    public static void main(String[] args) {
        // Data abstraction is the provess of hiding certain details and showing only
        // essential information
        // Abstraction can be achieved with either abstract classes or interfaces
        // abstract keyword is a non access modifier, used for classes and methods

        // Abstract class: is a restricted class that cannot be used to create objects
        // abstract method: can only be used in an abstract class, and it does not have
        // a body.
        // The body is provided by the subclass (inherited from).

        // an abstract class can have both abstract and regular methods

        // ex:
        // this class cannot be accessed without creating an inherited class
        abstract class Animal {
            public abstract void animalSound();

            public void sleep() {
                System.out.println("zzzz");
            }
        }

        // this returns an error cuz its not possible
        // Animal myObj = new Animal();

        class Pig extends Animal {
            public void animalSound() {
                System.out.println("The pig says: wee wee!");
            }
        }

        // we can now call the pig lass and use the sleep method
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

    }
}
