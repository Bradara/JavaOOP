package PokemonTrainer;

class Pokemon {
    private String name;
    private String element;
    private int health;

    Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    String getName() {
        return name;
    }

    String getElement() {
        return element;
    }

    int getHealth() {
        return health;
    }

    void reduceHealth(){
        this.health -= 10;
    }
}
