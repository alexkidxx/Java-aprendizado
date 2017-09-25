import static org.junit.Assert.assertEquals;

import java.util.zip.CRC32;

import org.junit.Before;
import org.junit.Test;

public class TesteContaCorrente {
	ContaCorrente c1;
	ContaCorrente c2;
	ContaCorrente c3;
	
	@Before
	public void criaConta(){
	c1 = new ContaCorrente(50);
	c2 = new ContaCorrente(150,002);
	c3 = new ContaCorrente(15,003);
	}

	@Test
	public void testSaldo() {
	assertEquals(c1.getSaldo(),50);
	}
	 
	@Test
	public void testDepositar(){
	c1.depositar(100);
	assertEquals(150,c1.getSaldo());
	}
	
	@Test
	public void testSacar(){
	c1.sacar(20);
	assertEquals(c1.getSaldo(),30);
	c1.sacar(40);
	assertEquals(c1.getSaldo(),30);// ver a necessidade de jogar uma exceção
	c1.sacar(30);
	assertEquals(c1.getSaldo(),0);
	}
	
	@Test
	public void testAdicionarConta(){
	
	MockServicoRemoto mock = new MockServicoRemoto();
	mock.adicionarConta(c2);
	assertEquals(1,mock.contas.size());
	mock.adicionarConta(c3);
	assertEquals(2,mock.contas.size());
	}
	
	@Test
	public void testRecuperarConta(){

	MockServicoRemoto mock = new MockServicoRemoto();
	mock.adicionarConta(c3);	
	assertEquals(true,c3.equals(mock.recuperarConta(003)));
	}
	
/*	@Test
	public void testEnvocarOMetodoPersistirContaUsandoSaque(){
	MockServicoRemoto mock = new MockServicoRemoto();
	mock.adicionarConta(c2);
	c3 = mock.recuperarConta(002);
	mock.persistirConta(c3);
	assertFalse()
	
		
		
	}
	*/
	

}
