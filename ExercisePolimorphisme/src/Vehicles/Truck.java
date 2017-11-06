package Vehicles;

public class Truck extends Vehicle{

     Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * this.getFuelConsumption();

        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        }

        System.out.printf("Truck travelled %s km%n", Main.myFormatter.format(distance));
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }
}
