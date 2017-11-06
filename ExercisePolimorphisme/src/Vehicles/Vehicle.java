package Vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected double getFuelQuantity() {
        return fuelQuantity;
    }

    protected double getFuelConsumption() {
        return fuelConsumption;
    }

    protected abstract void drive(double distance);
    protected void refuel(double quantity){
        if (quantity > this.tankCapacity - this.fuelQuantity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        if (quantity < 1) {
            System.out.println("Fuel must be a positive number");
            return;
        }

        this.fuelQuantity += quantity;
    };

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

    void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
