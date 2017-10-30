package ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static Map<String, Person> persons = new LinkedHashMap<>();
    private static Map<String, Product> products = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] personInput = br.readLine().split("[=;]");
        String[] productInput = br.readLine().split("[=;]");

        String name;
        double money;

        try {
            for (int i = 0; i < personInput.length; i+=2) {
                name = personInput[i];
                money = Double.parseDouble(personInput[i+1]);
                persons.putIfAbsent(name, new Person(name, money));
            }

            for (int i = 0; i < productInput.length; i+=2) {
                name = productInput[i];
                money = Double.parseDouble(productInput[i+1]);
                products.putIfAbsent(name, new Product(name, money));
            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        String line = br.readLine();

        while(!"end".equalsIgnoreCase(line)){
            String[] input = line.split("\\s+");
            String productName = input[1];
            String personName = input[0];

            try {
                if (persons.containsKey(personName) && products.containsKey(productName)) {
                    persons.get(personName).buyProduct(products.get(productName));
                    System.out.printf("%s bought %s%n", personName, productName);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            line = br.readLine();
        }

        persons.forEach((k, v) -> System.out.println(v));
    }
}
