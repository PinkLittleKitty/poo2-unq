package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class WorkTeam {
    String name;
    List<Person> members = new ArrayList<Person>();

    public WorkTeam(String name,  List<Person> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public OptionalDouble ageAverage() {
        return this.members.stream().mapToInt(Person::getAge).average();
    }
}
