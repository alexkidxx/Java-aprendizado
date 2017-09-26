import static org.junit.Assert.*;

import org.junit.Test;

public class TesteGeradorNome {

	@Test
	public void nomeBase() {
		GeradorNome gn = new GeradorNomeBuilder().criarPessoa().gerar();
		String nome = gn.gerarNome("Alex");
		assertEquals("Alex",nome);
		
	}
	
	@Test
	public void mestre() {
		GeradorNome gn = new GeradorNomeBuilder().criarMestre().gerar();
		String nome = gn.gerarNome("Alex");
		assertEquals("Mestre Alex",nome);
		
	}

	
	
	@Test
	public void doutor() {
		GeradorNome gn = new GeradorNomeBuilder().criarDoutor().gerar();
		String nome = gn.gerarNome("Alex");
		assertEquals("Doutor Alex",nome);
		
	}
	
	@Test
	public void ExcelentissimoDoutor() {
		GeradorNome gn = new GeradorNomeBuilder().criarDoutor().excelentissimo().gerar();
		String nome = gn.gerarNome("Alex");
		assertEquals("Excelentissimo Doutor Alex",nome);
		
	}
	
	@Test
	public void magnificoMestre() {
		GeradorNome gn = new GeradorNomeBuilder().criarMestre().magnifico().gerar();
		String nome = gn.gerarNome("Alex");
		assertEquals("Magnifico Mestre Alex",nome);
		
	}
	
}
