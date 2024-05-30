package dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // polymorphism = many shapes / forms
        // dynamic = after compilation (during runtime)
        // ex: a corvette is a corvette and a car and a vehicle and an object

        Scanner scanner = new Scanner(System.in);

        // create an general variable
        // and set it later after a user has made their choice
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat):");

        int choice = scanner.nextInt();

        // create cases for what the user chooses
        switch (choice) {
            case 1:
                animal = new Dog();
                animal.speak();
                break;

            case 2:
                animal = new Cat();
                animal.speak();
                break;
            default:
                System.out.println("Choice was invalid");
                break;
        }
    }
}
