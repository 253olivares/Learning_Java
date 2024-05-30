package package2;

// to inherit our package1 class we need to import
import package1.A;

public class Asub extends A {
    // pasting our main into a sub works bc asub is in the same package as C
    public static void main(String[] args) {

        // C c = new C();

        // System.out.println(c.defaultMessage);
        // this will create a self instance of our class
        // and be able to access our protected message because it is a child of A
        // protected allows our variable to reach this class since its a child
        Asub asub = new Asub();
        asub.getProtectedMessage();
    }

    void getProtectedMessage() {
        System.out.println(this.protectedMessage);
    }

}
