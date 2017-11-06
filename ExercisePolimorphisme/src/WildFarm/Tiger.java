package WildFarm;

class Tiger extends Felime{

    Tiger(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
            return;
        }

        this.setFoodEaten(food.getQuantity());
    }
}
