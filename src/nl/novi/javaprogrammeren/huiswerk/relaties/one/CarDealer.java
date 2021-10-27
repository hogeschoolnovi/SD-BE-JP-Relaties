package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private String companyName;
    private List<Car> cars;

    public CarDealer(String companyName) {
        this.companyName = companyName;
        cars = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void transferCarToOwner(Car car, CarOwner carOwner) {
        if(carOwner.getAge() > 18 && carOwner.addCar(car)) {
            car.setOwner(carOwner);
            this.removeCar(car);
        }

    }

    public boolean addCar(Car car) {
        if(!containsLicensePlate(car)) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public void removeCar(Car car) {
        if(containsLicensePlate(car)) {
            cars.remove(car);
        }
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
