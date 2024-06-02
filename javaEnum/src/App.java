
enum Planet {
    MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5), SATURN(6), URANUS(7), NEPTUNE(8), PLUTO(9);

    int number;

    Planet(int number) {
        this.number = number;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // enum = enumerated (ordered listing of items in a collection
        // Grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet) {
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here!");
                break;
            default:
                System.out.println("You can't live here!");
                break;
        }
        System.out.println("This is planet number: " + myPlanet.number);
    }

}
