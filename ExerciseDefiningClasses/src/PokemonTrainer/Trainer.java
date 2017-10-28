package PokemonTrainer;

import java.util.HashMap;
import java.util.Map;

class Trainer {
    private String name;
    private int badges;
    private Map<String, Pokemon> pokemons;

    Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new HashMap<>();
    }

    void addPokemon(Pokemon pokemon){
        this.pokemons.put(pokemon.getName(), pokemon);
    }

    boolean checkForElement(String element){
        return this.pokemons.entrySet().stream().anyMatch(p -> p.getValue().getElement().equalsIgnoreCase(element));
    }

    void increaseBadges(){
        this.badges++;
    }

    Map<String, Pokemon> getPokemons() {
        return pokemons;
    }

    int getBadges() {
        return badges;
    }

    void checkForDeath(){
        Map<String, Pokemon> newPokemons = new HashMap<>();
        for (Pokemon pokemon : pokemons.values()) {
            if (pokemon.getHealth() > 0) {
                newPokemons.put(pokemon.getName(), pokemon);
            }
        }

        this.pokemons = newPokemons;
    }

    void reduceHealthOfPokemons(){
        Map<String, Pokemon> newPokemons = new HashMap<>();

        for (Pokemon pokemon : pokemons.values()) {
            pokemon.reduceHealth();
            newPokemons.put(pokemon.getName(), pokemon);
        }

        this.pokemons = newPokemons;
    }
}
