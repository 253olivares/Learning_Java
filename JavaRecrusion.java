public class JavaRecrusion {
    public static void main(String[] args) {
        // Java recursion
        // recursion is a tech of making a function call itself
        // this technique provides a way to break complicated problems into simple
        // problems

        // Recursion example
        // adding 2 numbers is easy to do but adding a range of numbers is more
        // complicated

        int result = sum(10);
        System.out.println(result);

    }

    public static int sum(int k) {
        // the code loops itself
        // sees 10 is greater then 0
        if (k > 0) {
            // add to our result returning what k + k2 + k3 until 10 becomes 0
            // the sum in this program returns our k - 1 until it hits 0
            // for example 10-1 : 9 then 9-1 : 8 then 8-1 : 7 ...
            // adding up all these returns
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // recursive examples number 2

    // this programming will stop looping when the second value entered
    // "The end value" is greater than our first value entered "the start value"
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
