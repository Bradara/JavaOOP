package WildFarm;


public class Cat extends Felime{
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]", this.getAnimalType(), this.getAnimalName(), this.breed, Main.pattern.format(this.getAnimalWeight()), this.getLivingRegion(), this.getFoodEaten() );
    }
}
