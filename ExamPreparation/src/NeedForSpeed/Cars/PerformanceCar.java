package NeedForSpeed.Cars;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower*3/2, acceleration, suspension/4*3, durability);
        this.addOns = new ArrayList<>();
    }

    public List<String> getAddOns() {
        return this.addOns;
    }

    @Override
    public void addAddOns(String s){
        this.addOns.add(s);
    }

    @Override
    public void addStars(Integer n) {

    }

    @Override
    public void tune(Integer index){
        this.setHorsepower(this.getHorsepower() + index);
        this.setSuspension(this.getSuspension() + index/2);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Add-ons: %s%n", this.addOns.size() > 0? String.join(", ", this.addOns):"None");
    }
}
