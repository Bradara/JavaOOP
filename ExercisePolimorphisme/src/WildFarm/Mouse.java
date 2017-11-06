package WildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (!food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            System.out.println("Mice are not eating that type of food!");
            return;
        }

        this.setFoodEaten(food.getQuantity());
    }
}
