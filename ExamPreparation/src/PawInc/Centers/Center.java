package PawInc.Centers;

import PawInc.Animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Center {
    private String name;
    private List<Animal> storedAnimals;

    protected Center(String name) {
        this.setName(name);
        this.setStoredAnimal();
    }

    public String getName() {
        return name;
    }

    public void removeAnimal(Animal animal) {
        this.storedAnimals.remove(animal);
    }

    public void addAnimal(Animal animal) {
        this.storedAnimals.add(animal);
    }

    public List<Animal> getStoredAnimals() {
        return Collections.unmodifiableList(this.storedAnimals);
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setStoredAnimal() {
        this.storedAnimals = new ArrayList<>();
    }

    public void clean() {
        this.setStoredAnimal();
    }

    public void adopt() {
        List<Animal> copy = new ArrayList<>();
        for (Animal animal : this.getStoredAnimals()) {
            if (animal.isCleansed())
                copy.add(animal);
        }

        for (Animal animal : copy) {
            this.removeAnimal(animal);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
