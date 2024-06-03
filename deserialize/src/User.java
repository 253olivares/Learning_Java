// saving the state of a user

import java.io.Serializable;

public class User implements Serializable {

    // we can also assign our UID for our class
    private static final long serialVersionUID = 1;

    private String name;

    // we have a keyword we can use to prevent
    // values from being serialized
    // the using transient will prevent value from being serialized
    // this will never be sent
    transient String password2;
    private String password;

    User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

}
