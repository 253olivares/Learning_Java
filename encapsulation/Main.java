package encapsulation;

public class Main {
    public static void main(String[] args) {

        // encapsulation = attributes of a class will be hidden or private
        // can only be accessed only though methods (getters and setters)
        // You should make attributes private if you dont have a reason to make them
        // public / protected to other classes

        // Layer of security for classes

        Car car = new Car("Chevrolet", "Camaro", 2008);

        // this will not work as we made our year private so we have to use a getter to
        // get our variable
        // System.out.println(car.year);

        // now to get our year what we should do is call our get year
        System.out.println(car.getYear());

        // if we wanted to later change our year we have to create a setter as our year
        // property is private to us outside the class
        // car.year = 2000; //illegal

        car.setYear(2000);
        System.out.println(car.getYear());
    }
}
