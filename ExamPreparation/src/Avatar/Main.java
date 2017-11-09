package Avatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        StringBuilder status = new StringBuilder();
        StringBuilder wars = new StringBuilder();
        int count = 1;

        while (!"Quit".equalsIgnoreCase(line = br.readLine())) {
            String[] command = line.split("\\s+");

            switch (command[0]){
                case "Bender": Controller.addBender(command);break;
                case "Monument": Controller.addMonument(command);break;
                case "Status": status.append(Controller.getStatus(command[1]));break;
                case "War":
                    wars.append(String.format("War %d issued by %s%n", count++, command[1]));
                    Controller.makeWar();break;
            }
        }

        System.out.print(status);
        System.out.print(wars);
    }
}
