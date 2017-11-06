package WildFarm;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    void setFoodEaten(int foodEaten) {
        this.foodEaten += foodEaten;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    abstract void makeSound();
    abstract void eat(Food food);


}

//Cat[Gray, Persian, 1.1, Home, 4]
