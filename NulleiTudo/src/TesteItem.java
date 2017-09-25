import static org.junit.Assert.*;

import org.junit.Test;

public class TesteItem {

	@Test
	public void testSemDesconto() {
		Item i = new Item("tenis", 150.00);
		assertEquals(300.0, i.precoQuantidade(2),0.001);
		assertEquals("tenis R$150.0",i.toString());
		
	}

	
	@Test
	public void testDescontoPercentual(){
		Item i = new Item("tenis",150.00, new DescontoPercentual(10));
		assertEquals(270.0,i.precoQuantidade(2),0.001);
		assertEquals("tenis R$135.0",i.toString());
		
	}
	
	@Test
	public void testDescontoAbsoluto(){
		Item i = new Item("tenis", 150.00, new DescontoAbsoluto(10));
		assertEquals(280.0,i.precoQuantidade(2),0.001);
		assertEquals("tenis R$140.0",i.toString());
	}
}
