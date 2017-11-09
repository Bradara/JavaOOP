package Avatar.Benders;

public class AirBender extends Bender{
    private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity) {
        super(name, power);
        this.aerialIntegrity = aerialIntegrity;
    }

    @Override
    public double getAffinity() {
        return this.aerialIntegrity;
    }

    @Override
    public String toString() {
        return String.format("Air Bender: %s, Power: %d, Aerial Integrity: %.2f%n", this.getName(), this.getPower(), this.getAffinity());
    }
}
