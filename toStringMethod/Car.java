package toStringMethod;

public class Car {

    String make = "Ford";
    String modal = "Mustang";
    String color = "red";
    int year = 2023;

    // this overrides our string representation of our object
    // so when to string is ran instead of returning our memory address
    // we return our objects details
    public String toString() {
        return make + "\n" + modal + "\n" + color + "\n" + year;
    }
}
