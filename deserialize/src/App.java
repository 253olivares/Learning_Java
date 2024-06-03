import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Steps to Deserialize
        // 1. Declare your object (dont instantiate)
        // 2. Your class should implement Serializable interface
        // 3. add import java.io.Serializable
        // 4. FileInputStream fileIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. objectName = (Class) in.readObject();
        // 7. in.close(); fileIn.close();

        // create an empty instance
        User user = null;

        // create a try and catch block
        try {
            // file input stream
            FileInputStream fileIn = new FileInputStream("UserInfo.ser");
            // object input stream
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // set our user to readobject
            user = (User) in.readObject();

            // close in and fileIn
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println(user.getName());
        System.out.println(user.getPassword());

        // Important notes
        // Children classes of a parent class that implements Serializable will do so as
        // well
        // static fields are not serialized (They belong to the class, not a individual
        // object)
        // the class's definition ("class file") itself is not recorded, cast it as the
        // object type
        // Fields declared as "transient" aren't serialized, they're ignored
        // serialVersionUID is a unique version ID

        // serialVersionUID = serialVersionUID is a unique ID that functions like a
        // version #
        // verifies that the sender and receiver of a serialized object,
        // have loaded classes for that object that math
        // ensures object will be compatible between machines
        // number must match. otherwise this will cause InvalidClassException
        // A serializable class can declare its own serialVersion UID explicitly

        // it is automatically calculated when our class is created

        long serVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serVersionUID);

        // whenever we change methods of properties our serVersionUID will be different
        // both classes where the data is coming from and being sent too need to match
        // to prevent these errors

    }
}
