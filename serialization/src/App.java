import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Serialization = the process of converting an object into a byte stream.
        // persists (saves the state) the object after the program exits
        // this byte stream can be saved as a file or sent over a network
        // can be sent to a different machine
        // Byte stream can be saved as a file (.ser) which is platform independent
        // this of this as if you're saving a file with the objects information

        // Deserialization = the reverse process of converting a byte stream into an
        // object.
        // (Think of this as if you're loading a saved file).

        // Steps to serialize
        // 1. Your object class should implement serializable interface
        // 2. add import java.io.Serializable
        // 3. FileOutputStream fileOut = new FileOutputStream(file path)
        // 4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
        // 5. out.writeObject(objectName)
        // 6. out.close(); fileOut.close()

        User user = new User("Miguel", "secretPassword!");

        user.sayHello();

        try {
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(user);

            fileOut.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Object info saved!");
    }
}
