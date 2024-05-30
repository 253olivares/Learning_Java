import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        // FileReader = read the contents of a file as a stream of characters. one by
        // one
        // read() returns an int value which contains the byte value
        // when read () returns -1, there is not more data to be read

        // reade does one character a a time when whenever it is called
        // so to utilize our read function we need to encapsulate it in a while loop
        // and keep going till their is no more content to read within our file

        try {
            FileReader reader = new FileReader("art.txt");

            // tell our code to set the first character it reads into data
            int data = reader.read();
            // then after that read we ask our data to loop though each time until our data
            // returns a -1
            // it will do this when our file has no more characters to read
            while (data != -1) {
                // print out our value
                System.out.print((char) data);
                // read next character
                data = reader.read();
                // restart loop if it reads a character
            }

            // once our file is completely read we want to close our reader
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
