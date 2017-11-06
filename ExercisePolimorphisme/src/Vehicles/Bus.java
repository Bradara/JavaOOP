package Vehicles;

public class Bus extends Vehicle{
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void drive(double distance) {
        double consumption = distance * (this.getFuelConsumption()+1.4);

        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        }

        System.out.printf("Bus travelled %s km%n", Main.myFormatter.format(distance));
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }

    protected void driveEmpty(double distance){
        double consumption = distance * this.getFuelConsumption();

        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        }

        System.out.printf("Bus travelled %s km%n", Main.myFormatter.format(distance));
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }
}
