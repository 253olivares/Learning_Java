package package2;

import package1.*;

// items with the default access modifier can only be seen by items within the same package

// if we removed our public key then we would not be able to access it in a.java anymore since it is in a separate package
public class C {

    public String publicMessage = "this is a public message!";
    // what this does is protect our variable from classes that do not extended this
    // class
    // meaning to access this variable it we need to access it from a extended
    // class of C
    protected String protectedMessage = "This is a protect message!";

    // private variables are only accessable to the class themselves
    // meaning no other class can access new default message at all.
    // we can only call this variable within c methods and variables.

    // this works on both variables and methods
    private String newDefaultMessage = "This is a private message!";

    String defaultMessage = "This is the default!";
}
