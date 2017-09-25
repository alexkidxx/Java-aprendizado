import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ConvertCamel {

	@Test
	public void testGetSet() {
		
	CamelCase.setPalavra("casoCamelo");
	assertEquals(CamelCase.getPalavra().equals("casoCamelo"),true);
		
	}
	@Test
	public void testIsUpperCase(){
	char testUper = 'C';
	assertEquals(CamelCase.isMaiusculo(testUper),true);
	testUper='b';
	assertEquals(CamelCase.isMaiusculo(testUper),false);
	}
	
	@Test
	public void testPrimeiroCaractere(){
	char primeiroChar;
	CamelCase.setPalavra("teste");
	primeiroChar=CamelCase.getPrimeiroChar();
	assertEquals(primeiroChar=='t',true);	
	}
	
	
	@Test
	public void testIsValidoChar(){
	
	char c = 'a';
	CamelCase.setPalavra("teste");
	
	
	assertEquals(CamelCase.isValido(c),true);
	c = 'B';
	assertEquals(CamelCase.isValido(c),true);
	c = '*';
	assertEquals(CamelCase.isValido(c),false);
	
	}
	@Test
	public void testIsValidoNumero(){
	char c = '2';
	
	CamelCase.setPalavra("2teste");
	assertEquals(CamelCase.isValido(c),false);
	CamelCase.setPalavra("teste2");
	assertEquals(CamelCase.isValido(c),true);
		
	}
	@Test
	public void testPalavraInvalida(){
	CamelCase.setPalavra("10Primeiros");
	assertEquals(CamelCase.isPalavraValida(),false);
	CamelCase.setPalavra("nome#Composto");
	assertEquals(CamelCase.isPalavraValida(),false);
	CamelCase.setPalavra("primeiros10Soldados");
	assertEquals(CamelCase.isPalavraValida(),true);
		
	}

	@Test
	public void testConverterCamelCase(){
	ArrayList<String> test = new ArrayList();
	test.add("conta");
	test.add("Corrente");
	test.add("Cliente");
		
	CamelCase.setPalavra("contaCorrenteCliente");
	assertEquals(test,CamelCase.converterCamelCase("contaCorrenteCliente"));
		
	}

	
	@Test
	public void testConverterCamelCaseNumero(){
	ArrayList<String> test = new ArrayList();
	test.add("numero");
	test.add("10");
	test.add("Carro");
	
		
	CamelCase.setPalavra("numero10Carro");
	assertEquals(test,CamelCase.converterCamelCase("numero10Carro"));
		
	}
	@Test
	public void testRG(){
	ArrayList<String> test = new ArrayList();
	test.add("RG");
	
	CamelCase.setPalavra("RG");
	assertEquals(test,CamelCase.converterCamelCase("RG"));
	
	
	}
	
	
		

}
