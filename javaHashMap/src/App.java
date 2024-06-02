import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // HashMap implements the map interface (need import)
        // Hashmap is similar to ArrayList, but with key value pairs
        // stores objects, need to use wrapperClass
        // ex: (name,email),(usename,userID),(country,capital)

        HashMap<String, String> countries = new HashMap<String, String>();

        // we add to our hasmap using the put method
        // then add our key and value pair

        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // to remove from our hash map we call our remove method
        // countries.remove("") // send the key of the value pair we want to remove'

        // if we want to clear everything then we have to
        // countries.clear();
        // gets rid of everything within

        // get the length
        System.out.println(countries.size());

        // we cab replave values as well
        // we can change by identifying the key and what the new value is
        countries.replace("USA", "New York");

        // using contains key we can check to see if a key exists
        // check for a key
        countries.containsKey("USA");
        // will usually return true or false depending on if it found the key

        System.out.println(countries);
        System.out.println(countries.get("USA"));

        // display each of our keys and values
        for (String i : countries.keySet()) {
            System.out.println(i);
            System.out.println(countries.get(i));
        }
    }
}
