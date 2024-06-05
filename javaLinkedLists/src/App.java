import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Java LinkedList
        // Linked list class is almost identical to using arraay lists

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Bwong");
        cars.add("wOsm");
        cars.add("Yumm");
        cars.add("mAzs");
        System.out.println(cars);

        // ArrayList vs Linked List
        // the linked list class is a collection which can contain many object of the
        // same type, just like the ArrayList

        // the LinkedList class has all the same methods as the ArrayList class because
        // they both implement the list interface. This means you can add items, change
        // items, remove items,a nd clear the list in the same way

        // Despite the similiar interface of the arraylist and linkedlist class both
        // classes are built very differently

        // How the Array List works
        // the ArrayList class has a regular array inside of it
        // when an element is added, it is palced into the array
        // if the array is not big enough a new larger array is create to replace the
        // old one.

        // How the LinkedList works
        // the LinkedList stores its items in "Containers". The list has a link to the
        // first container and each container has a link to the next container in the
        // list
        // to add elements to the list the elements is placed into a new container and
        // that container is liked to one of the other containers in the list

        // so when should I use each?

        // Use ArrayList for storing and accessing data
        // use LinkedList to manipulate data

        // LinkedList Methods
        // For many cases the arraylist is more efficient as it is common to need access
        // to random item in the list, but the linked List provides several method to do
        // certain operations more efficiently

        // addFirst() - add an item to the start of a list
        // addLast() - add an item to the end of the list
        // removeFirst() - remove an item from the start of the list
        // removeLast() - remove an item from the end of the list
        // getFirst() - get the item at the beginning of the list
        // getLast() - get the item at the end of the list
    }
}
