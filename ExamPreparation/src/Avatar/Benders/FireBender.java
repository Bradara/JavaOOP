package Avatar.Benders;

public class FireBender extends Bender{
    private double heatAggression;

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
        this.heatAggression = heatAggression;
    }

    @Override
    public double getAffinity() {
        return this.heatAggression;
    }

    @Override
    public String toString() {
        return String.format("Fire Bender: %s, Power: %d, Heat Aggression: %.2f%n", this.getName(), this.getPower(), this.getAffinity());
    }
}
