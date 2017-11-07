package Avatar.Benders;

public class WaterBender extends Bender{
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }
}
