import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizzaria {

	
	@Test
	public void testPizza2ingredientes() {
		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("tomate seco", 1);
		p5.adicionaIngrediente("queijo", 1);
		
				
		assertEquals(15.0,p5.getPreco(),0); //assertEquals com valores double precisam ter um terceiro parâmetro.
		
	}

	@Test
	public void testPizza3ingredientes() {
		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("tomate seco", 1);
		p5.adicionaIngrediente("queijo", 1);
		p5.adicionaIngrediente("rúcula", 1);
		assertEquals(20.0,p5.getPreco(),0); //assertEquals com valores double precisam ter um terceiro parâmetro.
		
	}
	@Test
	public void testPizza7ingredientes() {
		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("tomate seco", 2);
		p5.adicionaIngrediente("queijo", 2);
		p5.adicionaIngrediente("rúcula", 3);
		assertEquals(23.0,p5.getPreco(),0); //assertEquals com valores double precisam ter um terceiro parâmetro.
		
	}
	@Test
	public void testRegistroIngredientes() {
		Pizza p5 = new Pizza();
		p5.adicionaIngrediente("tomate seco", 2);
		p5.adicionaIngrediente("queijo", 2);
		p5.adicionaIngrediente("rúcula", 1);
		assertEquals(5,p5.getQtdIng());
	}
	
	@Test
	@Before
	public void testZeraRegistro(){
		Pizza.zeraRegistroPizza();
		assertEquals(0,Pizza.totalIng);
	}
	
}