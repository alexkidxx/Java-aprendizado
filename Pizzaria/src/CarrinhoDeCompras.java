import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class CarrinhoDeCompras {
	
	ArrayList compra = new ArrayList();
	public double precoTotal = 0;
	
	
public void adicionarPizza(Pizza p){
		
	if(p.getQtdIng()!=0){//carrinho não aceita pizza sem ingrediente
	compra.add(p);
	}
	else
	System.out.println("Pizza sem ingredientes não posem ser adicionadas");
}

public double valorTotalCompra(){
		
	for(Object p: compra){
	precoTotal=precoTotal + ((Pizza) p).getPreco();
		}
	return precoTotal;
	}

}
