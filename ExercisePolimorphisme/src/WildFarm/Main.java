package WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    static DecimalFormat pattern = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] animalData, foodData;

        while (!"end".equalsIgnoreCase(line = br.readLine())) {
            animalData = line.split("\\s+");
            foodData = br.readLine().split("\\s+");
            Food food = null;
            Animal animal = null;

            switch (foodData[0]){
                case "Vegetable": food = new Vegetable(Integer.parseInt(foodData[1]));break;
                case "Meat": food = new Meat(Integer.parseInt(foodData[1]));break;
            }

            switch (animalData[0]){
                case "Mouse": animal = new Mouse(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]); break;
                case "Zebra": animal = new Zebra(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]); break;
                case "Tiger": animal = new Tiger(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3]); break;
                case "Cat": animal = new Cat(animalData[1], animalData[0], Double.parseDouble(animalData[2]), animalData[3], animalData[4]); break;
            }

            animal.makeSound();
            animal.eat(food);
            System.out.println(animal);
        }
    }
}
