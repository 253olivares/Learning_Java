package objectsOOP;

public class Car {

    String make = "Kia";
    String model = "Sedan";
    int year = 2018;
    String color = "black";
    double price = 2000.00;

    void drive() {
        System.out.println("Drive has started and you are driving!");
    }

    void brake() {
        System.out.println("You press on the breaks and the car stops!");
    }

    void carInformation() {
        System.out.println(
                "You tell the cop your car information:\n   Make:" + make + "\n   Model:" + model + "\n   Year:"
                        + year + "\n");
    }

}
