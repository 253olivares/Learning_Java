package swappingVariables;

public class Main {
    public static void main(String[] args) {

        // to swap our variable values we want to introduce a new
        // variable that holds one of our values we are switching to
        // to reintroduce it after the switch
        String x = "Watter";
        String y = "Kool-Aid";

        String temp;

        temp = y;
        x = y;
        y = temp;

        System.out.println("X: " + x);
        System.out.println("Y:" + y);
    }
}
