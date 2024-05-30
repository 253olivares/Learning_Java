package copyObjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Kia", "Sedan", 2018);
        Car car2 = new Car("Ford", "Mustang", 2022);

        // this is a bad idea when copying objects
        // car2 = car1;

        // the ideal method would be to create a copy method within our class
        // ex:
        car2.copy(car1);
        // along with creating a copy method we pass our object we want to copy

        // another method is to create a overload constructor
        Car car3 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}
