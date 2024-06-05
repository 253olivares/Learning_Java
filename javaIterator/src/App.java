import java.util.ArrayList;

import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Java Iterator
        // An Iterator is an object that can be used to loop through collections
        // Like ArrayList and Hashset
        // It is called an iterator because iterating is the technical term for looping

        // to use an iterator you much import it from java util package

        // getting an iterator

        // the iterator method can be used to get an Iterator for any collection

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Check");
        cars.add("second");
        cars.add("Third addition");

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        // Loop through a collection
        // To loop through a collection, use the hasNext() and next() methods of the
        // Iterator

        // create a while loop that checks to see if we have a following item in our
        // array
        // if we do execute our code
        while (it.hasNext()) {
            // display item
            System.out.println(it.next());

        }

        // Removing items from a collection
        // Iterators are designed to easily change the collections that they loop
        // through. The remove() method can remove items from a collection while looping

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        // current array
        System.out.println(numbers);
        Iterator<Integer> it2 = numbers.iterator();
        while (it2.hasNext()) {
            // grab current number we are on
            Integer i = it2.next();
            if (i == 9) {
                // current number we are on
                it2.remove();
            } else {
                System.out.println(i);
            }

        }

    }
}
