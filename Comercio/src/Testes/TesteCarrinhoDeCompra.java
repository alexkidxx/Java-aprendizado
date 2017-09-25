package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompra {
	@Test
	public void testeAdicionarProdutoAoCarrinho(){
	Produto prd1 = new Produto("lenço",3322,5.90);
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Bermuda",45654,39.00,48);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(prd1, 2);
	cdc.adicionaProduto(pct1, 1);
	assertEquals(cdc.produtoCarrinho.size(),2);
	}
	
	@Test
	public void testeAdicionarMesmoProdutoTamanhoDiferenteNoCarrinho() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,50);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 5);
	cdc.adicionaProduto(pct2, 3);
	assertEquals(cdc.produtoCarrinho.size(),2);
	}

	@Test
	public void testeAdicionarProdutoJaExistenteNoCarrinho() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 5);
	cdc.adicionaProduto(pct2, 3);
	int qtd = cdc.produtoCarrinho.get(pct1);
	assertEquals(cdc.produtoCarrinho.size(),1);
	assertEquals(qtd,8);
	}
	
	@Test
	public void testeRemoverProdutoDoCarrinho() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 4);
	cdc.adicionaProduto(pct2, 5);
	cdc.removeProduto(pct1, 3);
	int qtd = cdc.produtoCarrinho.get(pct1);
	assertEquals(qtd,6);
	}
	
	@Test
	public void testeRemoverProdutoDoCarrinhoMesmaQuantidade() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 4);
	cdc.adicionaProduto(pct2, 5);
	cdc.removeProduto(pct1, 9);
	assertEquals(cdc.produtoCarrinho.size(),0);
	}
	
	@Test
	public void testeRemoverProdutoAcimaDoPresenteNoCarrinho() {
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,34.32,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,34.32,52);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 5);
	cdc.adicionaProduto(pct2, 3);
	cdc.removeProduto(pct1, 9);
	int qtd = cdc.produtoCarrinho.get(pct1);
	assertEquals(qtd,8);
	}
	
	@Test
	public void testValorTotalDaCompraNoCarrinho(){
	ProdutoComTamanho pct1 = new ProdutoComTamanho("Calça",989898,10.00,52);
	ProdutoComTamanho pct2 = new ProdutoComTamanho("Calça",989898,10.00,52);
	ProdutoComTamanho pct3 = new ProdutoComTamanho("Calça",989898,15.00,54);
	Produto prd1 = new Produto("Lenço",23432,2.00);
	CarrinhoDeCompras cdc = new CarrinhoDeCompras();
	cdc.adicionaProduto(pct1, 2);
	cdc.adicionaProduto(pct2, 3);
	cdc.adicionaProduto(pct3, 5);
	cdc.adicionaProduto(prd1, 10);
	double resultado =cdc.valorTotalCompra();
	assertEquals(resultado,145.00,5);
	}

}
