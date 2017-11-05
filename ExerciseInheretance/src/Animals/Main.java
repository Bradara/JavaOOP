package Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Animal> animals = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String className;
        String[] data;

        while (!("beast!".equalsIgnoreCase(className = br.readLine()))) {
            data = br.readLine().split("\\s+");
            try {
                switch (className){
                    case "Dog": animals.add(new Dog(data[0], Integer.parseInt(data[1]), data[2]));break;
                    case "Cat": animals.add(new Cat(data[0], Integer.parseInt(data[1]), data[2]));break;
                    case "Frog": animals.add(new Frog(data[0], Integer.parseInt(data[1]), data[2]));break;
                    case "Kitten": animals.add(new Kitten(data[0], Integer.parseInt(data[1]), data[2]));break;
                    case "Tomcat": animals.add(new Kitten(data[0], Integer.parseInt(data[1]), data[2]));break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
