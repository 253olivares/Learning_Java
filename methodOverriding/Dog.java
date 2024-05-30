package methodOverriding;

public class Dog extends Animal {

    // this is just to tell other that this method is overriding another method of
    // the same name!
    @Override
    void speak() {
        System.out.println("The dog goes bark");
    }

}
