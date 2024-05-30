package package1;

import package2.*;

public class A {

    protected String protectedMessage = "This is a protect message!";

    public static void main(String[] args) {

        C c = new C();

        // this will not work since our default message is using its default modifier
        // System.out.println(c.defaultMessage);

        System.out.println(c.publicMessage);

    }
}
