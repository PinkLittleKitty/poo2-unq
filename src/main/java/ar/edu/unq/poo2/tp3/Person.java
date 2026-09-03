package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public boolean youngerThan(Person person) {
        return this.getAge() < person.getAge();
    }
}
