package RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input;
        List<Car> cars = new LinkedList<>();

        while (n-- > 0){
            input = br.readLine().split("\\s+");
            String model = input[0];
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);
            Tyre tyres = new Tyre(Arrays.copyOfRange(input,5, 13));
            cars.add(new Car(model, cargo, engine, tyres));
        }

        String command = br.readLine();

        if ("fragile".equalsIgnoreCase(command)) {
            cars.stream().filter(c -> c.getCargo().getType().equalsIgnoreCase(command) && (Arrays.stream(c.getTyres().getPressure()).anyMatch(x -> x < 1))).forEach(c -> System.out.println(c.getModel()));
        } else {
        cars.stream().filter(c -> c.getCargo().getType().equalsIgnoreCase(command) && c.getEngine().getPower() > 250)
                .forEach(c -> System.out.println(c.getModel()));
        }

    }
}
