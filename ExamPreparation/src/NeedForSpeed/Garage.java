package NeedForSpeed;

import NeedForSpeed.Cars.Car;
import NeedForSpeed.Cars.PerformanceCar;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> parkedCars;

    Garage() {
        this.parkedCars = new ArrayList<>();
    }

    List<Car> getParkedCars() {
        return parkedCars;
    }

    void parkCar(Car car) {
        if (!this.parkedCars.contains(car)) {
            this.parkedCars.add(car);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

     void unparkCar(Car car) {
        this.parkedCars.remove(car);
    }

     void tune(Integer tuneIndex, String addOns) {

        this.parkedCars.forEach(car -> {
            if(car.getClass().getSimpleName().equalsIgnoreCase("PerformanceCar")){
                car.addAddOns(addOns);
                car.tune(tuneIndex);
            }
            if (car.getClass().getSimpleName().equalsIgnoreCase("ShowCar")) {
                car.addStars(tuneIndex);
                car.tune(tuneIndex);
            }
        });
    }
}
