package PawInc.Centers;

import PawInc.Animals.Animal;

public class AdoptionCenter extends Center {

    public AdoptionCenter(String name) {
        super(name);
    }

    public void clean() { this.adopt(); }

    private void adopt(){
        this.getStoredAnimals().stream().filter(Animal::isCleansed).forEach(animal -> this.removeAnimal(animal));
    }
}
