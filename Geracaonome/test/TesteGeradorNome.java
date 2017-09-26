import static org.junit.Assert.*;

import org.junit.Test;

public class TesteGeradorNome {

	@Test
	public void nomeBase() {
		GeradorNome gn = new GeradorNomeBuilder.criarPessoa().gerar();
		String nome = gn.gerarNome("Eduardo");
		assertEquals("Eduardo",nome);
	}

}
