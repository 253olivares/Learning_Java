package constructors;

public class Main {

    int modelYear;
    String modelname;

    public Main(int year, String name) {
        this.modelYear = year;
        this.modelname = name;
    }

    public static void main(String[] args) {

        // constructor = a special method that is fired when a object is instantiated
        // (created)
        // this is where users usually set their object information such as names,
        // types, prices, and so on depending on the class being created

        Human human = new Human("Rick", 65, 79);
        // new human stance with unqiue information
        Human human2 = new Human("Morty", 16, 50);

        // we can now call each variable within the class that will be unique to the
        // class unless it is static
        // static variable and methods remain the same across objects and can be access
        // without creating an instance of an object
        System.out.println(Human.dec);

        System.out.println(human.name);

        human2.eat();
    }
}
