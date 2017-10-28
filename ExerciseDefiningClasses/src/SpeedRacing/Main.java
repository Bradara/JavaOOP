package SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.IllegalFormatException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line;
        Map<String, Car> cars = new LinkedHashMap<>();

        while (n-->0) {
            line = br.readLine().split("\\s+");
            cars.put(line[0], new Car(line[0], Double.parseDouble(line[1]), Double.parseDouble(line[2])));
        }

        line = br.readLine().split("\\s+");

        while (!"end".equalsIgnoreCase(line[0])) {
            if (cars.containsKey(line[1])) {
                try {
                    cars.get(line[1]).drive(Integer.parseInt(line[2]));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else{
                System.out.println("Car is not exist!");
            }

            line = br.readLine().split("\\s+");
        }

        cars.forEach((key, value) -> System.out.println(value));


    }
}
