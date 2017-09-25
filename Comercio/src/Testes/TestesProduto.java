package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestesProduto {

	@Test
	public void testeComparaProdutosMesmoCodigo(){
	Produto p1 = new Produto("Escarpan",8748748,98.76);
	Produto p2 = new Produto("Boné",8748748,98.73);
	assertEquals(p1.equals(p2),true);
	}
	
	@Test
	public void testeComparaProdutosCodigoDiferente(){
	Produto p1 = new Produto("Tênis",873836,78.87);
	Produto p3 = new Produto("Tênis",873837,78.87);
	assertEquals(p1.equals(p3),false);
	}
	
	@Test
	public void testeComparaProdutosHashIgual(){
	Produto p1 = new Produto("Escarpan",8748748,98.76);
	Produto p2 = new Produto("Boné",8748748,98.73);
	assertEquals(p1.hashCode(),p2.hashCode());
	}
	

}
