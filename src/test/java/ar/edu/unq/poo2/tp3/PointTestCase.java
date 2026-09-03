package ar.edu.unq.poo2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTestCase {

    private Point defaultPoint;

    @BeforeEach
    public void setup() {
        defaultPoint = new Point();
    }

    @Test
    public void testMove() {
        defaultPoint.movePointTo(5, -2);
        assertEquals(5, defaultPoint.getX());
        assertEquals(-2, defaultPoint.getY());
    }

    @Test
    public void testAddPoint() {
        this.testMove();
        Point p = new Point (2, 3);

        Point newPoint = defaultPoint.add(p);
        assertEquals(7, newPoint.getX());
        assertEquals(1, newPoint.getY());
    }
}
