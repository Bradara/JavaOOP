package NeedForSpeed.Cars;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;
    private boolean isRacer;
    private boolean isParked;

    Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.setBrand(brand);
        this.setModel(model);
        this.setYearOfProduction(yearOfProduction);
        this.setHorsepower(horsepower);
        this.setAcceleration(acceleration);
        this.setSuspension(suspension);
        this.setDurability(durability);
        this.setParked(false);
        this.setRacer(false);
    }

    public boolean isRacer() {
        return isRacer;
    }

    public void setRacer(boolean racer) {
        isRacer = racer;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getSuspension() {
        return suspension;
    }

    void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public abstract void tune(Integer index);
    public abstract void addAddOns(String s);
    public abstract void addStars(Integer n);


    void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getDurability() {
        return durability;
    }

    void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d%n%d HP, 100 m/h in %d s%n%d Suspension force, %d Durability%n", this.brand, this.model, this.yearOfProduction, this.horsepower, this.acceleration, this.suspension, this.durability);
    }
}
