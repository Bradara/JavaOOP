package NeedForSpeed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while (!"Cops Are Here".equalsIgnoreCase(line = br.readLine())) {
            String[] input = line.split("\\s+");

            switch (input[0]) {
                case "register":
                    CarManager.register(input);
                    break;
                case "open":
                    CarManager.open(input);
                    break;
                case "park":
                    CarManager.park(Integer.valueOf(input[1]));
                    break;
                case "participate":
                    CarManager.participate(Integer.valueOf(input[1]), Integer.valueOf(input[2]));
                    break;
                case "check":
                    sb.append(CarManager.check(Integer.valueOf(input[1])));
                    break;
                case "start":
                    sb.append(CarManager.start(Integer.valueOf(input[1])));
                    break;
                case "unpark":
                    CarManager.unpark(Integer.valueOf(input[1]));
                    break;
                case "tune":
                    CarManager.tune(Integer.valueOf(input[1]), input[2]);
                    break;
            }

        }

        System.out.println(sb);
    }
}
