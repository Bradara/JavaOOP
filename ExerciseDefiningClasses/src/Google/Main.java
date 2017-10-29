package Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Person> persons = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        while (!"end".equalsIgnoreCase(line)) {
            String[] input = line.split("\\s+");
            String name = input[0];
            switch (input[1]) {
                case "company":
                    persons.putIfAbsent(name, new Person(name));
                    Company company = new Company(input[2], input[3], Double.parseDouble(input[4]));
                    persons.get(name).setCompany(company);
                    break;
                case "pokemon":
                    persons.putIfAbsent(name, new Person(name));
                    Pokemon pokemon = new Pokemon(input[2], input[3]);
                    persons.get(name).addPokemon(pokemon);
                    break;
                case "parents":
                    persons.putIfAbsent(name, new Person(name));
                    Parent parent = new Parent(input[2], input[3]);
                    persons.get(name).addParent(parent);
                    break;
                case "children":
                    persons.putIfAbsent(name, new Person(name));
                    Children children = new Children(input[2], input[3]);
                    persons.get(name).addChildren(children);
                    break;
                case "car":
                    persons.putIfAbsent(name, new Person(name));
                    Car car = new Car(input[2], Integer.parseInt(input[3]));
                    persons.get(name).setCar(car);
                    break;
            }

            line = br.readLine();
        }

        line = br.readLine();

        if (persons.containsKey(line)) {
            System.out.println(persons.get(line));
        }

    }
}
