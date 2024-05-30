package polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphism = greek word for poly-"many", morph-"form"
        // The ability of an object to identify as more than one type
        // Objects ability to identify as more than one data type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        // this will cause issues bc our array only knows it will take objects
        // of car. So putting in other objects like boat and bicycle will cause issues
        // Car[] racers = {car, bicycle, boat};

        // instead of just specifying one object type
        // we can call the parent class to store all these different types in one array
        // Correct way of doing this:
        Vehicle[] racers = { car, bicycle, boat };

        // for (int i = 0; i < racers.length; i++) {
        // racers[i].go();
        // }
        // for loop option 2
        for (Vehicle x : racers) {
            x.go();
        }
    }
}
