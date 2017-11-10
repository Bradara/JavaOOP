package PawInc.Centers;

import PawInc.Animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Center {
    private String name;
    private List<Animal> storedAnimals;

    Center(String name) {
        this.setName(name);
        this.setStoredAnimal(null);
    }

    public String getName() {
        return name;
    }

    public void removeAnimal(Animal animal){
        this.storedAnimals.remove(animal);
    }

    public void addAnimal(Animal animal){
        this.storedAnimals.add(animal);
    }

    public List<Animal> getStoredAnimals() {
        return Collections.unmodifiableList(storedAnimals);
    }

    public void setName(String name) {
        this.name = name;
    }

    void setStoredAnimal(List<Animal> animals) {
        if (animals == null) {
            animals = new ArrayList<>();
        }
        this.storedAnimals = animals;
    }

    public abstract void clean();

    @Override
    public String toString() {
        return super.toString();
    }
}
