package constructors;

public class Human {

    String name;
    int age;
    double weight;

    static String dec = "You are a human!";

    // out constructor will usually be our class name
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating!");
    }
}
