package Testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testeMesmoCodigoTamanhosDiferentes() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,51);
	assertEquals(pct1.equals(pct2),false);
	}
	
	@Test
	public void testeMesmoCodigoTamanhosIguais() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	assertEquals(pct1.equals(pct2),true);
	}
	
	@Test
	public void testeMesmoCodigoTamanhosHashIguais() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Camisa",989898,21.62,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	assertEquals(pct1.hashCode(),pct2.hashCode());
	}

	
}
