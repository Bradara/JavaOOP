package NeedForSpeed;

import NeedForSpeed.Cars.Car;
import NeedForSpeed.Cars.PerformanceCar;
import NeedForSpeed.Cars.ShowCar;
import NeedForSpeed.Races.CasualRace;
import NeedForSpeed.Races.DragRace;
import NeedForSpeed.Races.Race;

import java.util.HashMap;
import java.util.Map;

class CarManager {
    private static Map<Integer, Car> cars = new HashMap<>();
    private static Map<Integer, Race> races = new HashMap<>();
    private static Garage garage = new Garage();

    static void register(int id, String type, String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        //register 1 Performance BMV M92 2013 300 4 150 75
        if (type.equalsIgnoreCase("Performance")) {
            cars.putIfAbsent(id, new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability));
        } else if (type.equalsIgnoreCase("Show")) {
            cars.putIfAbsent(id, new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability));
        }
    }

    static void open(int id, String type, int length, String route, int prizePool) {
        //open 1 Drag 10 BeverlyHills 50000
        if (type.equalsIgnoreCase("Drag")) {
            races.putIfAbsent(id, new DragRace(length, route, prizePool));
        } else if (type.equalsIgnoreCase("Casual")) {
            races.putIfAbsent(id, new CasualRace(length, route, prizePool));
        } else if (type.equalsIgnoreCase("Drift")) {
            races.putIfAbsent(id, new DragRace(length, route, prizePool));
        }
    }

    static void park(int id) {
        Car c = cars.get(id);

        if (c.isRacer()) {
            return;
        }

        c.setParked(true);
        garage.parkCar(c);
    }

    static void participate(int carId, int raceId) {
        Car c = cars.get(carId);

        if (c.isParked()) {
            return;
        }

        c.setRacer(true);
        races.get(raceId).addParticipant(c);
    }

    static String check(int id) {
        Car car = cars.get(id);

        return car.toString();
    }

    static String start(int id) {
        Race r = races.get(id);
        r.getParticipants().forEach(car -> car.setRacer(false));
        r.setOpen(false);
        return r.toString();
    }

    static void unpark(int id) {
        Car car = cars.get(id);
        car.setParked(false);
        garage.unparkCar(car);

    }

    static void tune(int tuneIndex, String addOn) {
        garage.tune(tuneIndex, addOn);
    }
}
