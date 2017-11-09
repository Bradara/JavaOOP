package Avatar.Nations;

import Avatar.Benders.Bender;
import Avatar.Monuments.Monument;

import java.util.ArrayList;
import java.util.List;

public abstract class Nation {
    private List<Bender> benders;
    private List<Monument> monuments;
    private double totalPower;

    Nation() {
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
        this.totalPower = 0.0;
    }

    public void addBender(Bender bender){
        this.benders.add(bender);
    }

    public void addMonument(Monument monument){
        this.monuments.add(monument);
    }

    public void calcTotalPower(){
        double power = this.benders.stream().mapToDouble(b -> b.getPower() * b.getAffinity()).sum();
        power += (power /100)* this.monuments.stream().mapToDouble(Monument::getAffinity).sum();
        this.totalPower = power;
    }

    public void clearNation(){
        this.benders = new ArrayList<>();
        this.monuments = new ArrayList<>();
    }

    public List<Bender> getBenders() {
        return benders;
    }

    public List<Monument> getMonuments() {
        return monuments;
    }

    public double getTotalPower() {
        return totalPower;
    }
}
