package dev.olivares.service;

import java.util.List;
import java.util.Optional;

// this service will hold our objects.
// normally we would want to create a specific service for each model but for this example we are going to 
// use generic to show case an example of a method where we can cur down on code by using one service for multiple objects
public interface CrudService<T> {

    // since it is a interface we do not need a body for our list just that any
    // object that inherits our interface will have access to an list method
    List<T> list();

    Optional<T> get(int id);

    void update(T t, int id);

    void delete(int id);
}
