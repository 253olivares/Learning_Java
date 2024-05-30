package copyObjects;

// taking object from previous module to practice this module
public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x) {
        this.copy(x);
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newyear) {
        this.year = newyear;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public void copy(Car x) {
        // we have to call the getter for our copy object as we will not be able to
        // access its private info since
        // they are private
        setMake(x.getMake());
        setModel(x.getModel());
        setYear(x.getYear());
    }

}
