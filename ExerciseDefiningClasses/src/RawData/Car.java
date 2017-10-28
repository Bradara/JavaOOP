package RawData;

import java.util.LinkedList;
import java.util.List;

class Car {
    private String model;
    private Cargo cargo;
    private Engine engine;
    private Tyre tyres;

    List<Car> cars = new LinkedList<>();

    Car(String model, Cargo cargo, Engine engine, Tyre tyres) {
        this.model = model;
        this.cargo = cargo;
        this.engine = engine;
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyres() {
        return tyres;
    }
}
