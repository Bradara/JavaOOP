package PawInc.Animals;

public class Cat extends Animal{
    private int intelligence;

    Cat(String name, int age, int intelligence) {
        super(name, age);
        this.intelligence = intelligence;
    }

    public Cat(String name, int age, int intelligence, String adoptionCenter) {
        super(name, age, adoptionCenter);
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
}
