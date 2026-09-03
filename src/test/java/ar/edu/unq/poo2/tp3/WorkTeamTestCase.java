package ar.edu.unq.poo2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorkTeamTestCase {
    private WorkTeam workTeam;
    private WorkTeam workTeam2;
    private Person p1;
    private Person p2;
    private Person p3;
    private Person p4;
    private Person p5;

    @BeforeEach
    public void setUp() {
        LocalDate today = LocalDate.now();

        p1 = new Person("Jessie", today.minusYears(19));
        p2 = new Person("James", today.minusYears(23));
        p3 = new Person("Meowth", today.minusYears(9));
        p4 = new Person("Koffing", today.minusYears(37));
        p5 = new Person("Wobbuffet", today.minusYears(16));

        List<Person> members = List.of(p1, p2, p3, p4, p5);
        workTeam = new WorkTeam("Team Rocket", members);
        workTeam2 = new WorkTeam("Empty Team", new ArrayList<>());
    }

    @Test
    public void testName(){
        assertEquals("Team Rocket", workTeam.getName());
    }

    @Test
    public void testAverageWithMembers(){
        OptionalDouble average = workTeam.ageAverage();

        assertEquals(average, OptionalDouble.of(20.8));
    }

}
