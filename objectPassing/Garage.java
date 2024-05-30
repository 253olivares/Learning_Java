package objectPassing;

public class Garage {

    Car[] cars = new Car[3];

    // will only accept car objects
    void park(Car car) {
        System.out.println("The " + car.name + " has been parked!");
    }
}
