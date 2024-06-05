public class AdditionalNotes {
    public static void main(String[] args) {
        // An enum is a special "class" that represents a group of constants
        // (unchangeable variables, like final variables)

        // To create an enum, use the enum keyword (instead of class or interface), and
        // separate the constants with a comma,

        enum Level {
            LOW,
            MEDIUM,
            HIGH
        }

        // you can access enum constants with the dot syntax
        Level myVar = Level.MEDIUM;

        // Enum is short for "enumerations", which means "specifically listed"

        // enums can be declare either within or outside a class
        // my previous example declared it within but they can also be declares outside

        // enums can be used in switch statements

        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;

            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Loop through an Enum
        // the enum type has a values() method, which returns an array of all enum
        // constants
        // this method is useful when you want to loop through the constants of an enum

        // we can do a constant loop using our values method
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }

        // An enum can, just like a class, have attributes and methods. The only
        // difference is that enim constant are public, static, and final

        // an enum cannot be used to create object, and it cannot extend other classes
        // (but it can implement interfaces)

        // Why and when yo use enums
        // use enums when you have values you know arent going to change, like month
        // days, days, colors, deck of cards, etc.

    }
}
