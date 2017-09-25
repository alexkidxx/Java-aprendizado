import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestesInterfaces {
	
	Informal pessoaInformal;
	Respeitoso pessoaRespeitosoFeminino;
	Respeitoso pessoaRespeitosoMasculino;
	ComTitulo pessoaComTitulo;

	Autoridade pessoa;
	
	@Before
	public void iniciaPessoa(){
		pessoaInformal = new Informal();
		pessoaRespeitosoFeminino = new Respeitoso('F');
		pessoaRespeitosoMasculino = new Respeitoso('M');
		pessoaComTitulo = new ComTitulo("Honorável");
	}
	
	@Test
	public void testeInformal(){
		pessoa = new Autoridade("Alex", "Dias", pessoaInformal);
		assertEquals("Alex", pessoa.getTratamento());
		
	}
	
	@Test
	public void testeRespeitosoFeminino(){
		pessoa = new Autoridade("Alex", "Dias", pessoaRespeitosoMasculino);
		assertEquals("Sr. Dias", pessoa.getTratamento());
		
	}
	
	@Test
	public void testeRespeitosoMasculino(){
		pessoa = new Autoridade("Alexandra", "Dias", pessoaRespeitosoFeminino);
		assertEquals("Sra. Dias", pessoa.getTratamento());
		
	}
	
	@Test
	public void testeComTitulo(){
		pessoa = new Autoridade("Alex", "Dias", pessoaComTitulo);
		assertEquals("Honorável Alex Dias", pessoa.getTratamento());
		
	}
	
}