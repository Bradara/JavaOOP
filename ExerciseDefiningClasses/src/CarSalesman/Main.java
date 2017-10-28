package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input;
        Map<String, Engine> engines = new HashMap<>();
        Map<String, Car> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            input = br.readLine().split("\\s+");
            switch (input.length) {
                case 2:
                    engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1])));
                    break;
                case 3:
                    engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1]), input[2]));
                    break;
                case 4:
                    engines.put(input[0], new Engine(input[0], Integer.parseInt(input[1]), input[2], input[3]));
            }
        }

        int numberOfCars = Integer.parseInt(br.readLine());

        while (numberOfCars-- > 0) {
            input = br.readLine().split("\\s+");
            switch (input.length) {
                case 2: cars.put(input[0], new Car(input[0], engines.get(input[1]))); break;
                case 3 : cars.put(input[0], new Car(input[0], engines.get(input[1]), input[2])); break;
                case 4: cars.put(input[0], new Car(input[0], engines.get(input[1]), input[2], input[3]));
                    break;
            }
        }

        cars.forEach((key, value) -> {
            System.out.println(value);
        });

    }
}
