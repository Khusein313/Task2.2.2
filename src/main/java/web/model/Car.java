package web.model;

public class Car {
    private int id;
    private String brand;
    private String condition;

    public Car(int id, String brand, String condition) {
        this.id = id;
        this.brand = brand;
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getCondition() {
        return condition;
    }
}
