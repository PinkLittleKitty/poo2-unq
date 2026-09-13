package ar.edu.unq.poo2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {

    public Servicio servicio;
    public Impuesto impuesto;
    public AgenciaTest agencia;

    @BeforeEach
    public void setUp() {
        agencia = new AgenciaTest();
        servicio = new Servicio(agencia, 5d, 10);
        impuesto = new Impuesto(agencia, 10d);
    }

    @Test
    public void testServicio() {
        assertEquals(50,  servicio.getMonto());
        servicio.registrar();
        assertEquals(servicio,  agencia.getUltimaFacturaRegistrada());
        assertEquals(1, agencia.getPagosRegistrados());
    }

    @Test
    public void testImpuesto() {
        assertEquals(10,  impuesto.getMonto());
        impuesto.registrar();
        assertEquals(impuesto,  agencia.getUltimaFacturaRegistrada());
        assertEquals(1, agencia.getPagosRegistrados());
    }
}

