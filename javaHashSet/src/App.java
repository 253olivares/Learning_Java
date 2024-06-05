import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        // Java HashSet
        // A hashSet is a collection of items where every item is unique, and it is
        // found in the java.util package

        // Create a hashset object called cars and store Strings

        HashSet<String> cars = new HashSet<String>();

        // addItems
        // the HashSet class has many useful methods for example, to ad items to it, use
        // the add() method

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fords");
        cars.add("BMW");

        System.out.println(cars);

        // when printing the cars array it will show all out items above but only show
        // bmw once
        // Hash sets ensures we do not get duplicate values

        // check if an item exits
        // we can check for an item using contains() method

        cars.contains("BMW");

        // remove an item
        // we remove the item by calling it itself
        cars.remove("BMW");

        // To remove all the items use the clear() method
        cars.clear();

        // hashset size
        // to find out how many items there are use the size method
        cars.size();

        // Loop through a hashset
        // Loop through the items of a hash set with a foreach loop

        for (String i : cars) {
            System.out.println(i);
        }

        // Just like with arrayList and HashMap
        // we can not pass primitive types we can only send wrapped types
        // wrapped types
        // boolean -> Boolean
        // int -> Integer
        // char -> Character
        // double -> Double
    }
}
