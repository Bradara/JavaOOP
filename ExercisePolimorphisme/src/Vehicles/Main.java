package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static DecimalFormat myFormatter = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] carData = br.readLine().split("\\s+");
        String[] truckData = br.readLine().split("\\s+");
        String[] busData = br.readLine().split("\\s+");

        Car car = new Car(Double.parseDouble(carData[1]), Double.parseDouble(carData[2]), Double.parseDouble(carData[3]));
        Truck truck = new Truck(Double.parseDouble(truckData[1]), Double.parseDouble(truckData[2]), Double.parseDouble(truckData[3]));
        Bus bus = new Bus(Double.parseDouble(busData[1]), Double.parseDouble(busData[2]), Double.parseDouble(busData[3]));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String[] input = br.readLine().split("\\s+");
            try {
                proceedInput(input, car, truck, bus);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

    private static void proceedInput(String[] input, Car car, Truck truck, Bus bus) {
        if ("Drive".equalsIgnoreCase(input[0])) {
            if ("Car".equalsIgnoreCase(input[1])) {
                car.drive(Double.parseDouble(input[2]));
            }else if ("Truck".equalsIgnoreCase(input[1])) {
                truck.drive(Double.parseDouble(input[2]));
            } else if ("Bus".equalsIgnoreCase(input[1])) {
                bus.drive(Double.parseDouble(input[2]));
            }
        } else if ("Refuel".equalsIgnoreCase(input[0])) {
            if ("Car".equalsIgnoreCase(input[1])) {
                car.refuel(Double.parseDouble(input[2]));
            } else if ("Truck".equalsIgnoreCase(input[1])) {
                truck.refuel(Double.parseDouble(input[2]));
            } else if ("Bus".equalsIgnoreCase(input[1])) {
                bus.refuel(Double.parseDouble(input[2]));
            }
        } else if ("DriveEmpty".equalsIgnoreCase(input[0])) {
            bus.driveEmpty(Double.parseDouble(input[2]));
        }
    }
}
