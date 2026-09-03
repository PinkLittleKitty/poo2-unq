package ar.edu.unq.poo2.tp3;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class MultioperatorTestCase {
    private Multioperator multioperator;

    @BeforeEach
    public void setUp() {
        multioperator = new Multioperator();

        multioperator.add(List.of(11, 2, 6, 7, 15, 7));
    }

    @Test
    public void testMultioperatorWithPlus() {
        assertEquals(48, multioperator.operateListWith(Integer::sum));
    }

    @Test
    public void testMultioperatorWithMinus() {
        assertEquals(-26, multioperator.operateListWith(Math::subtractExact));
    }

    @Test
    public void testMultioperatorWithMultiply() {
        assertEquals(97020, multioperator.operateListWith(Math::multiplyExact));
    }
}
