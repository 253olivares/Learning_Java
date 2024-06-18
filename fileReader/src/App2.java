import java.io.File;

public class App2 {
    public static void main(String[] args) {
        // additional notes
        // the file class from java.io allows us to work with giles
        File myObj = new File("filename.txt");

        // this allows us to specify files we want to acces or modify

        // Some methods that come with the file class are
        // canRead() - test whether the file is readable or not
        // canWrite() - tests whether the file is writable or not
        // createNewFile() - creates an empty file
        // delete() - deletes a file
        // exists() - tests if file exists
        // getName() - Returns name of file
        // getAbsolutePath() - Returns the absolute pathname of the file
        // length() - Returns the size of the file in bytes
        // list() - Returns an array of files in directory
        // mkdir() - creates a directory

        // Java create and write to files
        // To create a file in java we can use createNewFile() method.
        // will usually return a boolean telling us if the file was created or not

        // ex: myObj.createNewFile()

        // if we wanted to create a file in a specific directory then we need to specify
        // the path using double backslash

        // C:\\Users\\MyName\\filename.txt
        // will require system permission

        // Write to a file
        // if we want to write to a ile we need to call a different class called
        // FileWriter
        // FileWriter comes with write() to write some text to the file created

        // FileWriter myWriter = new FileWriter("filename.txt")
        // myWriter.write("Files in java might be tricky but it is fun enough!")

        // Just like some other libraries that listen it needs to be closed when no
        // longer used
        // myWriter.close()

        // Read a file
        // we can use our scanner class to read our documents
        // File myObj = new File("filename.txt")
        // Scanner myReader = new Scanner(myObj)

        // While (myReader.hasNextLine()){
        // String data = myReader.nextLine();
        // System.our.println(data);
        // }
        // myReader.close();

        // Java Delete a file
        // we can delete files in java using the delete() method

        // myObj.delete();

        // we can also delete folders but they have to be empty to begin with

        // File myObj = new File("C:\\Users\\MyName\\Test");
        // myObj.delete();
        // delete folder
    }
}
