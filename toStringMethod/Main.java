package toStringMethod;

public class Main {
    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        // that returns a string that "textually represents" an object
        // can be used both implicitly and explicitly

        Car car = new Car();

        // just doing this gives us the memory address of our object
        // System.out.println(car.toString());

        // now when we call car instead of getting our address we get our new method
        // when we override our toString method.
        System.out.println(car);

    }
}
