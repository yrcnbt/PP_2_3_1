package web.model;

public class Car {
    private String brand;

    private String model;

    private String bodyType;

    public Car(String brand, String model, String bodyType) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", bodyType = '" + bodyType + '\'' +
                '}';
    }
}
