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
                    CarManager.register(Integer.valueOf(input[1]), input[2], input[3], input[4], Integer.valueOf(input[5]), Integer.valueOf(input[6]), Integer.valueOf(input[7]), Integer.valueOf(input[8]), Integer.valueOf(input[9]));
                    break;
                case "open":
                    CarManager.open(Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]), input[4], Integer.parseInt(input[5]));
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

        System.out.print(sb);
    }
}
