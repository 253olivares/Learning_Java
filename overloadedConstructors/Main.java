package overloadedConstructors;

public class Main {
    public static void main(String[] args) {
        // Overloaded constructors = multiple constructors within a class with the same
        // name, but have different parameters
        // name + Parameters = signature
        // same practice as overloading methods but now we are doing it with
        // constructors

        // create our object
        Pizza pizza = new Pizza("Flatbread", "Tomatoe", "Mozz", "Sausage");

        System.out.println("These are the ingredients of the pizza you made!");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }
}
