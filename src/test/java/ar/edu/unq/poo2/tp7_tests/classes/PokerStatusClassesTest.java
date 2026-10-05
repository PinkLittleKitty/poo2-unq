package ar.edu.unq.poo2.tp7_tests.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class PokerStatusClassesTest {
    private PokerStatusClasses pokerStatusClasses;
    private Carta c1;
    private Carta c2;
    private Carta c3;
    private Carta c4;
    private Carta c5;

    @BeforeEach
    public void setUp() {
        pokerStatusClasses = new PokerStatusClasses();
        c1 = mock(Carta.class);
        c2 = mock(Carta.class);
        c3 = mock(Carta.class);
        c4 = mock(Carta.class);
        c5 = mock(Carta.class);
    }

    @Test
    public void testPoker() {
        when(c1.valor()).thenReturn(10);
        when(c2.valor()).thenReturn(10);
        when(c3.valor()).thenReturn(10);
        when(c4.valor()).thenReturn(10);
        when(c5.valor()).thenReturn(2);

        assertEquals("Poker", pokerStatusClasses.verificar(c1, c2, c3, c4, c5));
    }

    @Test
    public void testColor() {
        when(c1.palo()).thenReturn("D");
        when(c2.palo()).thenReturn("D");
        when(c3.palo()).thenReturn("D");
        when(c4.palo()).thenReturn("D");
        when(c5.palo()).thenReturn("D");

        assertEquals("Color", pokerStatusClasses.verificar(c1, c2, c3, c4, c5));
    }

    @Test
    public void testTrio() {
        when(c1.palo()).thenReturn("D");
        when(c2.palo()).thenReturn("C");
        when(c3.palo()).thenReturn("T");
        when(c4.palo()).thenReturn("P");
        when(c5.palo()).thenReturn("P");
        when(c1.valor()).thenReturn(10);
        when(c2.valor()).thenReturn(10);
        when(c3.valor()).thenReturn(10);
        when(c4.valor()).thenReturn(5);
        when(c5.valor()).thenReturn(2);

        assertEquals("Trio", pokerStatusClasses.verificar(c1, c2, c3, c4, c5));
    }
}
