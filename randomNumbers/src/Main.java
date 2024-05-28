package randomNumbers.src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // create a random instance
        // not true random sudo random
        Random random = new Random();

        int x = random.nextInt();

        System.out.println("Our random value for X:" + x);

        // to random our limit we can pass in params
        // if we want numbers between 1 - 6 we need to add 1 at the end since
        // computer language starts counting at 0
        int xLimited = random.nextInt(6) + 1;

        System.out.println(xLimited);

        // give us a random boolean value
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
