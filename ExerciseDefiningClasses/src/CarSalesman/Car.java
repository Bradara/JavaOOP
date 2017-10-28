package CarSalesman;

public class Car {
    private String  model;
    private Engine engine;
    private String weight;
    private String color;

    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    Car(String model, Engine engine, String weightOrColor) {
        this(model, engine);
        if (weightOrColor.matches("^\\d+$")) {
            this.weight = weightOrColor;
        } else {
            this.color = weightOrColor;
        }
    }

    Car(String model, Engine engine, String weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n%s%n  Weight: %s%n  Color: %s", model, engine, weight, color);
    }
}
