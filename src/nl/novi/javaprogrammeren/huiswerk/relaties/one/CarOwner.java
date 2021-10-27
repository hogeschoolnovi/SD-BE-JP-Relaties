package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {

    private String fullName;
    private int age;
    private List<Car> cars;

    public CarOwner(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        cars = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean addCar(Car car) {
        if(!containsLicensePlate(car)) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public boolean containsLicensePlate(Car car) {
        for(Car ownedCar: cars) {
            if(ownedCar.getLicensePlate().equals(car.getLicensePlate())) {
                return true;
            }
        }
        return false;
    }

    public List<Car> getCars() {
        return cars;
    }
}
