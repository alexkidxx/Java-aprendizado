import static org.junit.Assert.*;

import org.junit.Test;

public class TestQuebradorString {

	@Test
	public void testquebraPalavras() {
	String frase = "o rato roeu a roupa do rei de arruma";	
	QuebradorPalavras quebrador = new QuebradorPalavras();
	String[] palavras = quebrador.quebrar(frase);
	assertEquals(9,palavras.length);
	
		
		
		
	}
	@Test
	public void contadorSimples() {
	String frase = "o rato roeu a roupa do rei de arruma";	
	QuebradorPalavras quebrador = new QuebradorPalavras();
	quebrador.adionaContador("SIMPLES",new ContadorSimples());
	
	String[] palavras = quebrador.quebrar(frase);
	assertEquals(9,quebrador.getContagem("SIMPLES"));
	
		
		
		
	}
	@Test
	public void contadorMaiuscula() {
	String frase = "o Rato roeu a roupa do Rei de arruma";	
	QuebradorPalavras quebrador = new QuebradorPalavras();
	quebrador.adionaContador("MAIUSCULA",new ContadorMaiuscula());
	
	String[] palavras = quebrador.quebrar(frase);
	assertEquals(2,quebrador.getContagem("MAIUSCULA"));
	
		
		
		
	}
	@Test
	public void contadorLetrasPares() {
	String frase = "o Rato roeu a roupa do Rei de arruma";	
	QuebradorPalavras quebrador = new QuebradorPalavras();
	quebrador.adionaContador("PARES",new ContadorPares());
	
	String[] palavras = quebrador.quebrar(frase);
	assertEquals(5,quebrador.getContagem("PARES"));
	
		
		
		
	}

}
