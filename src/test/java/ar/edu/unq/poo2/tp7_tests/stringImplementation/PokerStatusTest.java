package ar.edu.unq.poo2.tp7_tests.stringImplementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokerStatusTest {
    private PokerStatus pokerStatus;

    @BeforeEach
    public void setUp() {
        pokerStatus = new PokerStatus();
    }

    @Test
    public void testHayPoker() {
        assertEquals("Poker", pokerStatus.verificar("2P", "10D", "10P", "10C", "10T"));
    }

    @Test
    public void testTresCartasIguales() {
        assertEquals("Trio", pokerStatus.verificar("10D", "10P", "10C", "2T", "3P"));
    }

    @Test
    public void testColorSobreTrio() {
        assertEquals("Color", pokerStatus.verificar("10D", "10D", "10D", "2D", "5D"));
    }
}
