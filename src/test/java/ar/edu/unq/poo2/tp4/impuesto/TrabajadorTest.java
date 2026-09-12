package ar.edu.unq.poo2.tp4.impuesto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadorTest {
public Trabajador trabajador;

    @BeforeEach
    public void setUp() {
        List<Ingreso> ingresoPercibidoAnual = new ArrayList<>();

        Ingreso ingreso1 = new Ingreso("Ene", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso1);
        Ingreso ingreso2 = new Ingreso("Feb", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso2);
        Ingreso ingreso3 = new Ingreso("Mar", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso3);
        Ingreso ingreso4 = new Ingreso("Apr", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso4);
        IngresoHorasExtra ingresoHorasExtra1 = new IngresoHorasExtra("Mar", "idk", 200d, 5);
        ingresoPercibidoAnual.add(ingresoHorasExtra1);
        Ingreso ingreso5 = new Ingreso("May", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso5);
        Ingreso ingreso6 = new Ingreso("Jun", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso6);
        Ingreso ingreso7 = new Ingreso("Jul", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso7);
        Ingreso ingreso8 = new Ingreso("Ago", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso8);
        Ingreso ingreso9 = new Ingreso("Sep", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso9);
        Ingreso ingreso10 = new Ingreso("Oct", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso10);
        Ingreso  ingreso11 = new Ingreso("Nov", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso11);
        Ingreso ingreso12 = new Ingreso("Dec", "idk", 100d);
        ingresoPercibidoAnual.add(ingreso12);

        trabajador = new Trabajador(ingresoPercibidoAnual);
    }

    @Test
    public void totalPercibidoTest() {
        assertEquals(1400, trabajador.getTotalPercibido());
    }

    @Test
    public void montoImponibleTest() {
        assertEquals(1200, trabajador.getMontoImponible());
    }

    @Test
    public void impuestoAPagarTest() {
        assertEquals(24,  trabajador.getImpuestoAPagar());
    }
}
