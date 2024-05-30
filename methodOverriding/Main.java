package methodOverriding;

public class Main {
    public static void main(String[] args) {
        // method overriding = declaring a method in sub class
        // which is already present in parent class
        // done so that a child class can give its own implementation

        Dog dog = new Dog();
        // we can over ride inherited methods within our class
        dog.speak();

        Animal animal = new Animal();
        animal.speak();
    }
}
