package ar.edu.unq.poo2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTestCase {

    @Test
    public void testRectangle() {
        Point origin = new Point();
        Rectangle rectangle = new Rectangle(origin, 10, 4);

        assertEquals(40, rectangle.area());
        assertEquals(28, rectangle.perimeter());
        assertEquals(true, rectangle.isHorizontal());
        assertEquals(false, rectangle.isVertical());
    }
}
