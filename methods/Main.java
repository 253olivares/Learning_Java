package methods;

public class Main {
    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon
        // every time our java code executes it runs our main method.

        int x = 3;
        int y = 4;

        // because we are dealing with object oriented programming inside our main
        // function that runs the code
        // we call our add function

        hello("Miguel", 23);
        int z = add(x, y);

        System.out.println(z);
    }

    // example set up
    // this is our method
    static void hello(String name, int age) {
        System.out.println("Hello World! " + name);
        System.out.println("You are " + age);
    }

    // we create our function that we want to call outside
    // identify what our function returns in this case it will return an integer

    // then we define our variables we are passing in this case x and y

    // then return our value we want to return after our function is complete
    static int add(int x, int y) {
        int z = x + y;

        return z;
    }
}
