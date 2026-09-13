package ar.edu.unq.poo2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest {

    public Caja caja;
    private Servicio servicio;
    private Impuesto impuesto;
    private AgenciaTest agencia;
    private ProductoCooperativa producto1;
    private ProductoTradicional producto2;

    @BeforeEach
    public void setUp() {
        caja = new Caja();
        agencia = new AgenciaTest();
        servicio = new Servicio(agencia, 5d, 10);
        impuesto = new Impuesto(agencia, 10d);
        producto1 = new ProductoCooperativa("Fideos", 1200d, 15);
        producto2 = new ProductoTradicional("Manteca", 2000d, 10);
    }

    @Test
    public void cajaVacíaTest() {
        Caja cajaV = new Caja();
        assertEquals(0, cajaV.getTotal());
    }

    @Test
    public void productoSingularTest() {
        caja.registrarItem(producto1);
        assertEquals(1080d, caja.getTotal());
        assertEquals(14, producto1.getStock());
    }

    @Test
    public void facturaSingularTest() {
        caja.registrarItem(servicio);
        assertEquals(50d, caja.getTotal());
    }

    @Test
    public void carritoMixtoTest() {
        caja.registrarItem(servicio);
        caja.registrarItem(impuesto);
        caja.registrarItem(producto1);
        caja.registrarItem(producto2);

        assertEquals(3140d, caja.getTotal());
        assertEquals(14, producto1.getStock());
        assertEquals(9, producto2.getStock());
        assertEquals(2, agencia.getPagosRegistrados());
    }

}
