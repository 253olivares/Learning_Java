package staticKeyword;

public class Friends {

    String name;
    // this variable is unique to our friends class
    // this is shared to each object
    static int numberOfFriends = 0;

    // of we remove static to our variable then the variable becomes unique to each
    // friends instance and can no longer be referenced using just
    // Friends.numberOfFriends

    Friends(String name) {
        this.name = name;
        // every time an instance of our object is created we add one instance to the
        // number of friends count
        numberOfFriends++;
    }

    // since this is static when we call this method we will call it using
    // Friends.method name not instanceName.method
    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends!");
    }

}
