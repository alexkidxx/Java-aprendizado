import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testReturnTotal() {
	CompraParcelada c1 = new CompraParcelada(60.00,3,0.05);
	assertEquals(c1.total(),69,1);
	}
	@Test
	public void testUmaParcela() {
	CompraParcelada c1 = new CompraParcelada(60.00,1,0.05);
	assertEquals(c1.total(),63,1);
	}
	@Test
	public void testDuasParcelas() {
	CompraParcelada c1 = new CompraParcelada(60.00,2,0.05);
	assertEquals(c1.total(),66.15,1);
	}
	@Test
	public void testCincoParcelas() {
	CompraParcelada c1 = new CompraParcelada(60.00,5,0.05);
	assertEquals(c1.total(),76.57,1);
	}
	@Test
	public void testDezParcelas() {
	CompraParcelada c1 = new CompraParcelada(60.00,10,0.05);
	assertEquals(c1.total(),97.73,1);
	}
}
