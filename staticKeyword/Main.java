package staticKeyword;

public class Main {
    public static void main(String[] args) {
        // static = modifier. a single copy of a variable/method is created and shared.
        // the class "owns" the static member.

        Friends friend1 = new Friends("Jacob");
        Friends friend2 = new Friends("Patrick");

        System.out.println(Friends.numberOfFriends);

        System.out.println(friend1.name);
        System.out.println(friend2.name);

        Friends.displayFriends();
    }
}
