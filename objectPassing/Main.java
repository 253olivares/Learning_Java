package objectPassing;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car = new Car("Sudan");

        Car car2 = new Car("BMW");

        garage.park(car);
        garage.park(car2);
    }
}
