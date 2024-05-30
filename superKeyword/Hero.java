package superKeyword;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        // this works but is not the recommended method of doing this
        // the suggested method is to declare name and age in the class where its shared
        // with all child components
        // this.name = name;
        // this.age = age;

        // using super helps cut down on code
        // we call our super and pass over the values that are shared in our parent
        // class
        // super calls the constructor and the parent class assigns the shared variables
        super(name, age);
        this.power = power;
    }

    // we create another to string that overrides our previous to string
    // then we use super to execute our parent to string and add our power to the
    // end of our string.
    // super returns the result of our parent method so we can add to it.
    public String toString() {
        return super.toString() + this.power;
    }
}
