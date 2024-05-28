package forLoop.src;

public class Main {
    public static void main(String[] args) {

        // for loop = executes a block of code a limited amount of times!

        // this is the same as the method is is done within javascript
        // set our index to 0
        // check our condition
        // if our condition is false run code
        // then add one and repeat again
        for (int i = 0; i < 20; i++) {
            if (i == 5) {
                System.out.println("Floop");
            } else {
                System.out.println(i + 1);
            }
        }

    }
}
