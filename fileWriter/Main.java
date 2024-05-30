package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter filewriter = new FileWriter("./poem.txt");
            filewriter.write("This is a new comment!");

            // .append allows us to add to our write function additional comments to our
            // file
            filewriter.append("Additional comments!");

            // we want to make sure to close our writer once we are finished
            // good practice to prevent memory leaks
            filewriter.close();
            // When ever created a file writer object we are required to utilize a try catch
            // we utilize this for instances where java can not find the file path to where
            // we are asking it to write our document.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
