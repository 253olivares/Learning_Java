public class App {
    public static void main(String[] args) throws Exception {
        // inner class = a class inside of another class
        // useful if a class should be limited in a scope
        // usually private, but not necessary
        // helps group classes that belong together
        // extremely useful for listeners for specific precursor for anonymous inner
        // classes

        Outside out = new Outside();
        Outside.Inside in = out.new Inside();

        System.out.println(out.x + in.y);
        in.Greeting();
    }
}
