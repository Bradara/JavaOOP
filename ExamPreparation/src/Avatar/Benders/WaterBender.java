package Avatar.Benders;

public class WaterBender extends Bender{
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }

    @Override
    public double getAffinity() {
        return this.waterClarity;
    }

    @Override
    public String toString() {
        return String.format("Water Bender: %s, Power: %d, Water Clarity: %.2f%n", this.getName(), this.getPower(), this.getAffinity());
    }
}
