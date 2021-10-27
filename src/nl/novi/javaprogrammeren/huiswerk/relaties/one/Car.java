package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {

    private String licensePlate;
    private String brand;
    private String type;
    private int amountOfKmDriven;

    private CarOwner owner;

    public String getLicensePlate() {
        return licensePlate;
    }

    public Car(String licensePlate, String brand, String type, int amountOfKmDriven) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.type = type;
        this.amountOfKmDriven = amountOfKmDriven;
    }

    public CarOwner getOwner() {
        return owner;
    }

    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountOfKmDriven() {
        return amountOfKmDriven;
    }

    public void setAmountOfKmDriven(int amountOfKmDriven) {
        this.amountOfKmDriven = amountOfKmDriven;
    }
}
