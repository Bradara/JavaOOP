package PawInc.Centers;

import PawInc.Animals.Animal;

public class CleansingCenter extends Center{

    public CleansingCenter(String name) {
        super(name);
    }

    @Override
    public void clean() {
        this.setStoredAnimal(null);
    }
}
