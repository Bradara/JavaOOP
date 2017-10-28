package SpeedRacing;

class Car {
    private String Model;
    private double fuelAmount;
    private double costPerKm;
    private int distanceTraveled;

    Car(String model, double fuelAmount, double costPerKm) {
        Model = model;
        this.fuelAmount = fuelAmount;
        this.costPerKm = costPerKm;
        this.distanceTraveled = 0;
    }

    void drive(double km){
        if (this.fuelAmount/this.costPerKm <km) {
            throw new IllegalArgumentException("Insufficient fuel for the drive");
        } else {
            this.fuelAmount -= km*this.costPerKm;
            this.distanceTraveled+=km;
        }
    }

    public String  toString(){
        return String.format("%s %.2f %d", this.Model, this.fuelAmount, this.distanceTraveled);
    }
}
