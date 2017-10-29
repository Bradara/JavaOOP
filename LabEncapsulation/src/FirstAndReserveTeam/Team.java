package FirstAndReserveTeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team() {
        this.reserveTeam = new ArrayList<>();
        this.firstTeam = new ArrayList<>();
    }

    void addPerson(Person person){
        if (person.getAge() < 40) {
            this.firstTeam.add(person);
        } else{
            this.reserveTeam.add(person);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}
