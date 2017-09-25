import static org.junit.Assert.*;


import org.junit.Test;
public class TesteCarrinho{
@Test
public void testCarrinhoDeComprasSomandoQtd(){
	Pizza p6 = new Pizza();
	Pizza p7 = new Pizza();
	Pizza p8 = new Pizza();
	CarrinhoDeCompras c1 = new CarrinhoDeCompras();
	p6.adicionaIngrediente("calabresa", 3);
	p7.adicionaIngrediente("brigadeiro", 4);
	p8.adicionaIngrediente("banana", 1);
	p8.adicionaIngrediente("Canela", 1);
	c1.adicionarPizza(p6);
	c1.adicionarPizza(p7);
	c1.adicionarPizza(p8);
	assertEquals(3,c1.compra.size());//3 Pizzas
	
}
@Test
public void testCarrinhoDeComprasSomandoPrc(){
	Pizza p6 = new Pizza();
	Pizza p7 = new Pizza();
	Pizza p8 = new Pizza();
	CarrinhoDeCompras c1 = new CarrinhoDeCompras();
	p6.adicionaIngrediente("calabresa", 3);
	p7.adicionaIngrediente("brigadeiro", 4);
	p8.adicionaIngrediente("banana", 1);
	p8.adicionaIngrediente("Canela", 1);
	c1.adicionarPizza(p6);
	c1.adicionarPizza(p7);
	c1.adicionarPizza(p8);
	assertEquals(55.0,c1.valorTotalCompra(),0);
			
}
@Test
public void testNegaPizzaSemIngrediente(){
	Pizza p9 = new Pizza();
	CarrinhoDeCompras c2 = new CarrinhoDeCompras();
	c2.adicionarPizza(p9);
	assertEquals(0,c2.compra.size());
	
}




}
