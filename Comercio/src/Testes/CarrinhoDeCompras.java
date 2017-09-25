package Testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

public class CarrinhoDeCompras {
	
double precoTotal=0;
HashMap<Produto, Integer> produtoCarrinho = new HashMap<>();
	
	
	public void mostraCarrinho(){
	System.out.println(produtoCarrinho);
	}

	public void adicionaProduto(Produto p,int q) {
	int qtd=0;
	if(produtoCarrinho.containsKey(p)){
	qtd = produtoCarrinho.get(p);
	qtd += q;
	produtoCarrinho.remove(p);
	this.produtoCarrinho.put(p, qtd);
	}else{
	this.produtoCarrinho.put(p, q);
	}
	}
	
	public void removeProduto(Produto p,int q) {
	int qtd=0;
	if(produtoCarrinho.containsKey(p)&&produtoCarrinho.get(p)>q){
	qtd = produtoCarrinho.get(p);
	qtd -= q;
	produtoCarrinho.remove(p);
	this.produtoCarrinho.put(p, qtd);
	}
	else if(produtoCarrinho.containsKey(p)&&produtoCarrinho.get(p)<q){
	System.out.println("Impossível remover quantidade superior à existente no carrinho");
	}
	else if(produtoCarrinho.containsKey(p)&&produtoCarrinho.get(p)==q){
	produtoCarrinho.remove(p);
	}
	else
	this.produtoCarrinho.remove(p, q);
	}
	
	public double valorTotalCompra(){
	Collection<Produto> c = produtoCarrinho.keySet();
	Collection f = produtoCarrinho.values();
	Iterator<Produto> i = c.iterator();
	Iterator d = f.iterator();
	int qtd=0;
	
	while(d.hasNext()){
	qtd=(int) d.next();
	
	while(i.hasNext()){
	precoTotal = precoTotal + ((i.next().getPreco())*qtd);
	break;  				
	}
	}
	return precoTotal;
	}
	
}
		
	

