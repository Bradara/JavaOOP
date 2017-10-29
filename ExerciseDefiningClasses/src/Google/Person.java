package Google;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> childrens;
    private Car car;

    Person(String name) {
        this.name = name;
        this.childrens = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }
    void addParent(Parent parent){
        this.parents.add(parent);
    }

    void addChildren(Children children){
        this.childrens.add(children);
    }

     void setCompany(Company company) {

        this.company = company;
    }

    void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("%s%nCompany:%s%nCar:%s%nPokemon:%s%nParents:%s%nChildren:%s",
                                    name,
                company==null?"":company,
                car==null?"":car,
                pokemons.isEmpty()?"":listToString.apply(pokemons),
                parents.isEmpty()?"": listToString.apply(parents),
                childrens.isEmpty()?"":listToString.apply(childrens));
    }

    private static Function<List, String> listToString = list -> {
        StringBuilder sb = new StringBuilder();

        for (Object o : list) {
            sb.append(o.toString());
        }

        return sb.toString();
    };
}
