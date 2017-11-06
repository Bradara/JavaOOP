package Vehicles;

public class Car extends Vehicle {

    Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * this.getFuelConsumption();

        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        }

        System.out.printf("Car travelled %s km%n", Main.myFormatter.format(distance));
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }
}
