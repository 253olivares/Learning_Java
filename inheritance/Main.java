package inheritance;

public class Main {
    public static void main(String[] args) {
        // inheritance = process that allows one class to acquire attributes and methods
        // of other classes

        // despite not having anything in each class currently methods works since they
        // inherit these methods from our vehicle class
        Car car = new Car();
        car.go();
        car.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();

        // a helpful property of inheritance is that each object while sharing methods
        // and variables
        // they can each create their own methods and varaibles that are not shared for
        // exmaple below we created
        // a door variable in car that only our car can access bc of the car class
        System.out.println(car.doors);

        // will not work
        // System.out.println(bicycle.doors);

    }
}
