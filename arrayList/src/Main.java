package arrayList.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase
        // Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        // after we create our arraylist we call the built in add function
        food.add("First test!");
        food.add("Chicken");
        food.add("Hotdog");

        // this appends a new string item to our array;

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // some useful methods we can use from our array list;
        food.set(0, "sushi");
        // replace our value at index with input value

        food.remove(2);
        // just removes our value at set index

        food.clear();
        // cleans our array
    }
}
