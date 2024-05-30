package arrayOfObjects;

public class Main {
    public static void main(String[] args) {
        // Empty array that is set to be integers
        int[] numbers = new int[3];
        // empty array of 4 set to be char values
        char[] characters = new char[4];
        // empty array that is set to be string values
        String[] strings = new String[5];

        // make our array and let java know that all the elements within our array will
        // be
        // of the Food object
        // Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");

        Food food2 = new Food("Hamburger");

        Food food3 = new Food("Hotdog");

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        // we can also directly set our object array instead of creating the object
        // before and setting it after
        Food[] refrigerator = { food1, food2, food3 };

        System.out.println(refrigerator[0].name);
    }
}
