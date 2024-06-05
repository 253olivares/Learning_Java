import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AdditionalNotes {
    public static void main(String[] args) {
        // ARRAYLIST
        // The arraylist class ins a resizable array, which can be found in the
        // java.util package

        // The difference between a built-in array and an ArrayList in Java, is that the
        // size of an array
        // cannot be modified (if you cant to add or remove elements to/from an array,
        // you have to create a new one)
        // While elements can be added and removed from an ArrayList whenever you want.
        // The syntax si also slightly different

        // ex
        ArrayList<String> cars = new ArrayList<String>();

        // The ArrayList class has many useful methods. For example, to add elements to
        // the list,
        // use the add() method

        cars.add("car1");
        cars.add("BMW");

        // You cana lso add an itme as a specified position by referring to the index
        // number

        // adding by index number
        // any value in current index will be shift to the right
        cars.add(0, "Wmom");

        System.out.println(cars);

        // to access items from within our array we just need to identify the index we
        // want using the get method
        cars.get(1);
        System.out.println(cars.get(0));

        // To modify an element, use the set() method and refer to the index number
        cars.set(0, "Opel");

        // we can remove our item by calling our cars array and specifying the index we
        // want to reomve
        // Remove an item
        cars.remove(0);

        // To remove all the element in the arraylist we can us the clear method
        cars.clear();

        // ArrayList Size
        // to find out how many elements an arraylist has we can use the size method
        // cars.size() // will return the size of our method

        cars.size();

        // Loop through an ArrayList
        // to loop through the elements of an ArrayList with a for loop, and use the
        // size() method to specift how many times we should loop
        for (int i = 0; i <= cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // we can also loop through using a for each loop
        for (String i : cars) {
            System.out.println(i);
        }

        // other Types
        // elements in an Array list are actually objects. In the example above, we
        // created elements (objects) of type "String".
        // Remember that a String in Java is an object (not a primitive type). To use
        // other types such as int, you must specify and equivalent wrapper class
        // Integer instead of int
        // Boolean instead of boolean
        // Character instead of char
        // Double instead of double

        // Sort an ArrayList
        // Another useful class in the java.util package is the Collections class, which
        // include the sort() method for sorting lists alphabetically or numerically;

        Collections.sort(cars);

    }
}
