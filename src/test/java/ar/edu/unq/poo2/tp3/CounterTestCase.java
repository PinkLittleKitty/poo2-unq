package ar.edu.unq.poo2.tp3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTestCase {
    private Counter counter;

    public void setUpExercise1() {
        counter = new Counter();

        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    public void setUpExercise2() {
        counter = new Counter();

        counter.addNumber(524);
        counter.addNumber(2481);
        counter.addNumber(46);
    }
    @Test
    public void testEvenNumbers() {
        this.setUpExercise1();
        int amount = counter.evenAmount();
        assertEquals(1, amount);
    }

    @Test
    public void testOddNumbers() {
        try {
            this.setUpExercise1();
            int amount = counter.oddAmount();
            assertEquals(9, amount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testMostEvenDigits() {
        this.setUpExercise2();
        int output = counter.mostEvenDigits();
        assertEquals(2481, output);
    }

    @Test
    public void testBiggestmultipleForXY() {
        counter = new Counter();
        int output = counter.biggestMultipleFor(3, 9);
        assertEquals(999, output);
    }
}
