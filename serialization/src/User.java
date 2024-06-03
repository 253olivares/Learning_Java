// saving the state of a user

import java.io.Serializable;

public class User implements Serializable {
    private String name;
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
