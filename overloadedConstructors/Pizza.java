package overloadedConstructors;

public class Pizza {

    String bread;
    String sauce;
    String cheese;
    String topping;

    // define our variables we will be receiving
    Pizza(String bread, String sauce, String cheese, String topping) {
        // set our values in the object
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    // cheese pizza constructor
    // overloaded Constructor
    Pizza(String bread, String sauce, String cheese) {
        // set our values in the object
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // Tommatoe pizza constructor
    // overloaded Constructor
    Pizza(String bread, String sauce) {
        // set our values in the object
        this.bread = bread;
        this.sauce = sauce;
    }
}
