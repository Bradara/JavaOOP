package PawInc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] input;

        while (!"Paw Paw Pawah".equalsIgnoreCase(line = br.readLine())) {
            input = line.split("\\s+\\|\\s+");

            switch (input[0]) {
                case "RegisterAdoptionCenter":
                    AnimalCenterManager.registerAdoptionCenter(input[1]);
                    break;
                case "RegisterCleansingCenter":
                    AnimalCenterManager.registerCleansingCenter(input[1]);
                    break;
                case "RegisterDog":
                    AnimalCenterManager.registerDog(input[1], Integer.valueOf(input[2]), Integer.valueOf(input[3]), input[4]);
                    break;
                case "RegisterCat":
                    AnimalCenterManager.registerCat(input[1], Integer.valueOf(input[2]), Integer.valueOf(input[3]), input[4]);
                    break;
                case "SendForCleansing":
                    AnimalCenterManager.sendForCleansing(input[1], input[2]);
                    break;
                case "Cleanse":
                    AnimalCenterManager.cleanse(input[1]);
                    break;
                case "Adopt":
                    AnimalCenterManager.adopt(input[1]);
                    break;
            }
        }
        AnimalCenterManager.printStatistics();
    }
}
