//Alexsandro Martins

//Nota para avaliação: O entendimento utilizado para hashmap neste exercício foi 
//adicionar a pizza como ingrediente e o valor como quantidade de porções desse ingrediente

import java.util.HashMap;

public class Pizza {

	double preco;
	static int totalIng = 0;	//total de ingredientes utilizado em todas as pizzas
	public int qtdIng = 0;				//quantidade de ingredientes utilizado em cada pizza
	static HashMap<String, Integer> ingredientes = new HashMap<>();
	
static void zeraRegistroPizza(){
	ingredientes.clear();
	totalIng=0;
}

static void ingredientesUtilizados(){
	System.out.println(getIngredientes());
}
	
static void contabilizaIngrediente(int t){
	Pizza.totalIng = t + Pizza.totalIng;
}
	
public double getPreco() {
	if(this.qtdIng > 0 && this.qtdIng<=2)
		this.preco = 15.00;
	else if (this.qtdIng >=3 && this.qtdIng <=5 )
		this.preco = 20.00;
	else if(this.qtdIng >=6)
		this.preco = 23.00;
		
	return preco;
}

public void adicionaIngrediente(String ing, int qtd){
	contabilizaIngrediente(ing,qtd);	
	setQtdIng(qtd);
}

public static void contabilizaIngrediente(String ing, int	qtd){
	getIngredientes().put(ing, qtd);
	contabilizaIngrediente(qtd);
}

public  void setQtdIng(int q) {
	this.qtdIng = q + qtdIng;
}

public int getQtdIng() {
	return qtdIng;
}

public static HashMap<String, Integer> getIngredientes() {
	return ingredientes;
}

public void setIngredientes(HashMap<String, Integer> ingredientes) {
	this.ingredientes = ingredientes;
}

}
	

