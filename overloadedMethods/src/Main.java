package overloadedMethods.src;

public class Main {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name bu have different
        // parameters
        // method name + parameters = method signature

        // the idea is to have multiple methods with the same name but different params
        // and the code will execute the method where the number of params
        // match the number of variables being passed!

        int x = add(5, 3, 5);

        System.out.println("x: " + x);

        // concept works for data types in the param as well so it will create a new
        // signature depending on data types
    }

    static int add(int a, int b) {
        System.out.println("Overloaded method 1!");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloaded method 2!");
        return c + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overloaded method 3!");
        return c + b + c + d;
    }

    static int add(String name, int b) {
        System.out.println(name + b);
        return b;
    }
}
