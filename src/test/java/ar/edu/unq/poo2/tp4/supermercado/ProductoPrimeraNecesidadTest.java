package ar.edu.unq.poo2.tp4.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}

	@Test
	public void testCalcularDescuento() {
        ProductoPrimeraNecesidad manteca = new ProductoPrimeraNecesidad("Manteca", 10d, 11d);

		assertEquals(new Double(8.9), manteca.getPrecio());
	}
}
