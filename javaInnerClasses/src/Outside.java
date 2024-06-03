public class Outside {

    String x = "Hello ";

    Outside() {

    }

    public class Inside {
        String y = "World!";

        public void Greeting() {
            System.out.println("Method inside a inner class.");
        }
    }
}
