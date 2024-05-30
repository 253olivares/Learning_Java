package variableScope;

import java.util.Random;

public class DiceRoller {

    // another method to create gloabl variables is to create them higher up inside
    // our class object
    // and make it outside the method they are being called in
    // that will allow all methods to access them

    // Random random
    // int number;

    DiceRoller() {
        Random random = new Random();

        int number = 0;
        roll(number, random);
    }

    // to allow number and random to work we need to pass them into the method
    void roll(int number, Random random) {
        // just doing this does not work bt itelf since number and random were creating
        // within our constructor and not our roll method
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
