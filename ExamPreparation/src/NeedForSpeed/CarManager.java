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

    static void register(String... input) {
        //register 1 Performance BMV M92 2013 300 4 150 75
        if (input[2].equalsIgnoreCase("Performance")) {
            cars.putIfAbsent(Integer.parseInt(input[1]), new PerformanceCar(input[3], input[4], Integer.valueOf(input[5]), Integer.valueOf(input[6]), Integer.valueOf(input[7]), Integer.valueOf(input[8]), Integer.valueOf(input[9])));
        } else if (input[2].equalsIgnoreCase("Show")) {
            cars.putIfAbsent(Integer.parseInt(input[1]), new ShowCar(input[3], input[4], Integer.valueOf(input[5]), Integer.valueOf(input[6]),Integer.valueOf(input[7]),Integer.valueOf(input[8]),Integer.valueOf(input[9])));
        }
    }

    public static void open(String[] input) {
        //open 1 Drag 10 BeverlyHills 50000
        if (input[2].equalsIgnoreCase("Drag")) {
            races.putIfAbsent(Integer.valueOf(input[1]), new DragRace(Integer.valueOf(input[3]), input[4], Integer.parseInt(input[5])));
        } else if (input[2].equalsIgnoreCase("Casual")) {
            races.putIfAbsent(Integer.valueOf(input[1]), new CasualRace(Integer.valueOf(input[3]), input[4], Integer.parseInt(input[5])));
        } else if (input[2].equalsIgnoreCase("Drift")) {
            races.putIfAbsent(Integer.valueOf(input[1]), new DragRace(Integer.valueOf(input[3]), input[4], Integer.parseInt(input[5])));
        }
    }

    public static void park(Integer carID) {
        Car c = cars.get(carID);

        if (c.isRacer()) {
            return;
        }

        c.setParked(true);
        garage.parkCar(c);
    }

    public static void participate(Integer carID, Integer raceID) {
        Car c = cars.get(carID);

        if (c.isParked()) {
            return;
        }

        c.setRacer(true);
        races.get(raceID).addParticipant(c);
    }

    public static String check(Integer carID) {
        Car car = cars.get(carID);

        return car.toString();
    }

    public static String start(Integer raceID) {
        Race r = races.get(raceID);
        r.getParticipants().forEach(car -> car.setRacer(false));
        return r.toString();
    }

    public static void unpark(Integer carID) {
        Car car = cars.get(carID);
        garage.unparkCar(car);

    }

    public static void tune(Integer tuneIndex, String addOns) {
        garage.tune(tuneIndex, addOns);
    }
}
