
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
	Pizza p1 = new Pizza();
	p1.adicionaIngrediente("tomate seco", 1);
	p1.adicionaIngrediente("rucula", 1);
	p1.adicionaIngrediente("milho", 2);
	
	
	Pizza p2 = new Pizza();
	p2.adicionaIngrediente("goiabada", 1);
	p2.adicionaIngrediente("queijo", 1);
	p2.adicionaIngrediente("M,Ms", 1);
	p2.adicionaIngrediente("chocolate granulado", 1);
	
	
	Pizza p3 = new Pizza();
	p3.adicionaIngrediente("cheddar", 1);
	p3.adicionaIngrediente("ervilha", 1);
	p3.adicionaIngrediente("calabresa", 2);
	p3.adicionaIngrediente("pimenta", 1);
	p3.adicionaIngrediente("ovo cozido", 1);
	
	
	Pizza p4 = new Pizza(); //A pizza sem ingredientes
	
	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	carrinho.adicionarPizza(p1);
	carrinho.adicionarPizza(p2);
	carrinho.adicionarPizza(p3);
	carrinho.adicionarPizza(p4);
	
	System.out.println("O valor total da compra é "+carrinho.valorTotalCompra());
	System.out.println("Os ingredientes gastos por todas as pizzas foram "+Pizza.totalIng);
	System.out.println("Os ingredientes utilizados foram");
	Pizza.ingredientesUtilizados();
		
	}

}
