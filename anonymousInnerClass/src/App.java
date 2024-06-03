public class App {
    public static void main(String[] args) throws Exception {
        // anonymous class = an inner class without a name
        // only a single object is created from one
        // The object may have "extras" or "changes"
        // and no need to create a seperate innerclass
        // when we only need it once
        // helps us avoid clutter

        // syntax is similar to a constructor
        // except that there is also a class definit
        // within a block of code
        // Great for listeners

        // we can override our methods within a class
        Greeting greeting = new Greeting() {
            @Override
            public void Welcome() {
                System.out.println("New Message");
            }
            // doesnt have to be an override we can add new
            // new methods
        };

        Greeting greeting2 = new Greeting();

        greeting.Welcome();
        greeting2.Welcome();

        MyFrame myFrame = new MyFrame();
    }
}
