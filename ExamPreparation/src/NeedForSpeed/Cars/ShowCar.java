package NeedForSpeed.Cars;

public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.setStars(0);
    }

    @Override
    public void tune(Integer index){

    }

    @Override
    public void addAddOns(String s){

    }

    @Override
    public void addStars(Integer n) {
        this.stars += n;
    }

    public int getStars() {
        return this.stars;
    }

    void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%d *%n", this.stars);
    }
}
