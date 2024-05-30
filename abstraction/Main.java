package abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated buy can have a subclass
        // abstract methods are declared without implementation.

        // before abstraction we can create both classes
        // Vehicle vehicle = new Vehicle();
        Car car = new Car();

        // after adding abstraction this no longer functions
        // Vehicle vehicle = new Vehicle();

        // this will function after overriding our method from vehicle with a new go
        // method in car
        car.go();

    }
}
