package superKeyword;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // we can also use the super class with our methods
    public String toString() {
        return this.name + '\n' + this.age + "\n";
    }
}
