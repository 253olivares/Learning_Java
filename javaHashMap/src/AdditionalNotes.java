import java.util.HashMap;

public class AdditionalNotes {
    public static void main(String[] args) {
        // In the ArrayList chapter, you learned that Array store items as an ordered
        // collection, and you ahve to access tehm with an index number
        // a hashmap however stores items in key/value pairs, and you can access them by
        // an index of another type

        // On object is used as a key (index) to another object (value). It can store
        // different types:
        // String keys and Integer values, or the same type, like: String keys and
        // String values:

        // declaring our hashmap
        // when declaring we need to specify our object key type and value types
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add Items
        // The hashmap class has many useful methods. For example, to ad items to it,
        // use the put()

        capitalCities.put("key", "KeyValue");

        // Access an Item
        // To access a value in the HashMap, use the get() method to refer to its key
        capitalCities.get("key");

        // Remove an item
        capitalCities.remove("key");

        // To remove everything us the clear() metho
        capitalCities.clear();

        // HashmapSize
        // to find out how many items there are us the size method
        capitalCities.size();

        // Loop through a hashmap
        // Loop through the items of a hashmap with a for-each loop
        // use the keyset() method if you only want the kets, and use the values method
        // if you want the values

        // get our key values
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // get our value values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Other Types
        // Key and values in hashmap are actually objects. In the examples above, we
        // used objects of the type String. Remember that a String in java is an object.
        // to use other types such as int you must specify and equivalent wrapper class

        // Just like with ArrayLists we can not use primitive Types

    }
}
