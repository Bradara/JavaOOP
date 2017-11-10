package PawInc.Factories;

import PawInc.Animals.Cat;
import PawInc.Animals.Dog;

public final class AnimalFactory {

    private AnimalFactory(){}

    public static Cat createCat(String name, int age, int intelligence, String adoptionCenter){
        return new Cat(name, age, intelligence, adoptionCenter);
    }

    public static Dog createDog(String name, int age, int command, String adoptionCenter){
        return new Dog(name, age, command, adoptionCenter);
    }

}
