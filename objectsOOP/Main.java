package objectsOOP;

public class Main {
    public static void main(String[] args) {

        // OOP - Object oriented programming = an instance of class that may contain
        // attributes and methods
        // Ex: (Phone, Desk, Computer, Coffee-cup)

        // ex:
        /*
         * Object Coffee
         * 
         * String color = "white";
         * 
         * Double temp = 20.0;
         * 
         * boolean empty = true;
         * 
         * drink(){
         * System.out.print("You have drank the coffee!");
         * }
         * 
         * spill(){
         * System.out.print("You spill the coffee :/");
         * }
         */

        Car myCar = new Car();

        // create a second object instance
        // it will have the same details as the first as we are not updating any of its
        // information when creating this instance!
        Car myCar2 = new Car();

        System.out.println(myCar.color);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.brake();
        myCar.carInformation();

    }
}
