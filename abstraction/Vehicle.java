package abstraction;

// adding abstract prevents us or other users
// from creating a vehicle object without declaring one of our legal child classes
public abstract class Vehicle {

    // we can also use abstract on methods
    // doing this forces users to make a go override in car
    // good use case would be to make requires for child classes
    abstract void go();
}
