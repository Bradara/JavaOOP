package PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!"Tournament".equalsIgnoreCase(line)) {
            String[] input = line.split("\\s+");
            Pokemon pokemon = new Pokemon(input[1], input[2], Integer.parseInt(input[3]));
            String trainerName = input[0];
            if (trainers.containsKey(trainerName)) {
                trainers.get(trainerName).addPokemon(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName);
                trainers.put(trainerName, trainer);
                trainers.get(trainerName).addPokemon(pokemon);
            }

            line = br.readLine();
        }

        line = br.readLine();

        while (!"end".equalsIgnoreCase(line)) {
            String elem = line;
            trainers.forEach((k, v) -> {
                if (v.checkForElement(elem)) {
                    v.increaseBadges();
                } else {
                    v.reduceHealthOfPokemons();
                    v.checkForDeath();
                }
            });

            line = br.readLine();
        }

        trainers.entrySet().stream()
                .sorted(Main::comparePokemons)
                .forEach((e) -> System.out.printf("%s %d %d%n", e.getKey(), e.getValue().getBadges(), e.getValue().getPokemons().size()));
    }

    private static int comparePokemons(Map.Entry<String, Trainer> t1, Map.Entry<String, Trainer> t2) {
        int pok1 = t1.getValue().getBadges();
        int pok2 = t2.getValue().getBadges();
        if (pok1 > pok2) {
            return -1;
        } else if (pok2 > pok1) {
            return 1;
        } else {
            return 0;
        }
    }
}
