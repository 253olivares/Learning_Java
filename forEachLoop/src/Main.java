package forEachLoop.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // for-each = traversing technique to iterate through the elements in an array /
        // collection
        // less steps, more readable
        // less flexible

        String[] animals = { "cat", "dog", "rat", "bird" };

        // : stands for in
        // so we are sauing for each x in animals referencing each value in our array
        for (String x : animals) {
            System.out.println("x: " + x);
        }

        ArrayList<String> newAnimalList = new ArrayList<String>();

        newAnimalList.add("Cat");

        newAnimalList.add("Rat");

        newAnimalList.add("Tiger");

        for (String y : newAnimalList) {
            System.out.println("y: " + y);
        }
    }
}
