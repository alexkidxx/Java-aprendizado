package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Compra;

public class TesteCompra {

	@Test
	public void testCompra() {
	
		Compra c1 = new Compra(60.00);
		assertEquals(c1.total(),60,0);
	}

}
