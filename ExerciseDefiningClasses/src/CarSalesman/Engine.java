package CarSalesman;

public class Engine {
   private String model;
   private int power;
   private String displacement;
   private String efficienty;

    Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficienty = "n/a";
    }

    Engine(String model, int power, String displOrEfecciency) {
this(model, power);
        if (displOrEfecciency.matches("^\\d+$")) {
            this.displacement = displOrEfecciency;
        }else{
        this.efficienty = displOrEfecciency;
        }
    }

    Engine(String model, int power, String displacement, String efficienty) {
        this(model, power);
        this.displacement = displacement;
        this.efficienty = efficienty;
    }

    @Override
    public String toString() {
        return String.format("  %s:%n    Power: %d\n    Displacement: %s\n    Efficiency: %s", model, power, displacement, efficienty);
    }
}
