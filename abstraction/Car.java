package abstraction;

public class Car extends Vehicle {
    // because this method is abstract in our parent class when we work on our car
    // object
    // we are being forced to create a go method
    // this is useful to make sure required methods do not go missing when creating
    // child methods
    @Override
    void go() {
        System.out.println("The driver is driving the car!");
    }
}
