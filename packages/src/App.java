
// we can click on our imports and see the class package we are importing
import javax.swing.Icon;
// if we place a class with a seperate package we need to specify its directory
import tools.*;

public class App {
    public static void main(String[] args) throws Exception {
        // java treats folders as packages
        Tool toolbox = new Tool();

    }
}
