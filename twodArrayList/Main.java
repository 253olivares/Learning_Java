package twodArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // you can change the size of these lists during run time
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("Donuts");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Cookie");

        ArrayList<String> produceList = new ArrayList();

        produceList.add("Tomatoes");
        produceList.add("Peppers");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList();

        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

        System.out.println(groceryList.get(1).get(0)); // this will get the first element in our second array;
        // in larger array lists we just start chaining array list action when we want
        // to edit or change nests elements
    }
}
