package ar.edu.unq.poo2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {
    public Producto producto1;
    public Producto producto2;

    @BeforeEach
    public void setUp() {
        producto1 = new ProductoCooperativa("Fideos", 1200d, 15);
        producto2 = new ProductoTradicional("Manteca", 2000d, 10);
    }

    @Test
    public void getPrecioTest() {
        assertEquals(1080, producto1.getMonto());
        assertEquals(2000, producto2.getMonto());
    }

    @Test
    public void decrementarStockTest() {
        producto1.decrementarStock();
        producto2.decrementarStock();

        assertEquals(14, producto1.getStock());
        assertEquals(9, producto2.getStock());
    }
}
