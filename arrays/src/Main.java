package arrays.src;

public class Main {
    public static void main(String[] args) {

        String[] cars = { "Camaro", "Corvette", "Tesla" };

        cars[0] = "Mustang"; // Camaro => "Mustang"

        System.out.println(cars[0]); // Mustang
        System.out.println(cars[1]); // Corvette
        System.out.println(cars[2]); // tesla

        System.out.println(cars[4]); // error

        // additionally we can not put in data does not fit our data type for example

        // not valid since a number exists on our 3rd spot
        // String [] test = {"test","test",3}

        // we can also predetermine the size of our array array

        // creates an empty array with 3 spots
        String[] car = new String[3];

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
