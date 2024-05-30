import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        // File = abstract representation of file and directory pathnames

        // if set up correctly the file class will search within the project folder to
        // find a file with its name
        // if we want to search for a file outside our project we have to include the
        // directory path
        File file = new File("message.txt");

        // ex:
        // this is the path name we would use to find files outside our project root
        // folder!
        // File file = new File ("c://programfile//message.txt")

        if (file.exists()) {
            System.out.println("File exits!");
            // then if we want to show our file path name we can call a function to get our
            // path
            // this will only get our file path from our root folder
            // if we want to find our file path from our system directory we have to use a
            // different function
            System.out.println(file.getPath());
            // get absolute path will get our absolute path to our file which is from the C
            // drive
            System.out.println(file.getAbsolutePath());

            // another useful function is to check if the file provided is actually a file
            // or not
            System.out.println(file.isFile());

            // lastly we can also delete a file by calling
            // file.delete()
            // when java runs this function it will delete our file from our project
        } else {
            System.out.println("File does not exist please try again!");
        }

    }
}
