public class App {
    public static void main(String[] args) throws Exception {
        // method chaining = a common syntax for invoking multiple method calls in OOP
        // condense code into less lines

        String name = "  Miguel";
        // Method chaining allows us to condense code by executing mutliple methods

        // name = name.concat(" Olivares")
        // name = name.trim()
        // name = name.toUpperCase()

        // these 3 methods can be done in one line of code

        System.out.println(name.concat(" Olivares").trim().toUpperCase());
        // expected output: MIGUEL OLIVARES

        // The drawback is that it does make code harder to read for very complex method
        // chains

    }
}
