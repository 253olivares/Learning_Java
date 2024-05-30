package encapsulation;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
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
}
