import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TesteCaixaEletronico  {
	
	
	ContaCorrente c1;
	ContaCorrente c2;
	ContaCorrente c3;
	CaixaEletronico cxe1;
	MockHardware mockH;
	MockServicoRemoto mock;
	
	@Before
	public void criaConta(){
	c1 = new ContaCorrente(50);
	c2 = new ContaCorrente(30,004);
	c3 = new ContaCorrente(600,005);
	cxe1 = new CaixaEletronico();
	}
	
	@Before
	public void criaMocks(){
	mockH = new MockHardware();
	mock = new MockServicoRemoto();
	}

	


	@Test
	public void testSacarCaixaEletronicoSucesso(){
	ContaCorrente c1 = new ContaCorrente(10,002);
	String valorRetornado=cxe1.sacar(c1,10);
	assertTrue(valorRetornado.equals("Retire seu dinheiro"));
	}
	
	@Test
	public void testSacarCaixaEletronicoFalha(){
	ContaCorrente c1 = new ContaCorrente(10,002);
	String valorRetornado=cxe1.sacar(c1,60);
	assertTrue(valorRetornado.equals("Saldo insuficiente"));
	}
	
	
	@Test
	public void testDepositarCaixaEletronicoSucesso(){
	ContaCorrente c1 = new ContaCorrente(10,002);
	String valorRetornado=cxe1.depositar(c1,10);
	assertTrue(valorRetornado.equals("Depósito recebido com sucesso"));
	}
	
	@Test
	public void testDepositarCaixaEletronicoFalha(){
	ContaCorrente c1 = new ContaCorrente(10,002);
	String valorRetornado=cxe1.depositar(c1,-10);
	assertTrue(valorRetornado.equals("Falha no depósito"));
	}
	
	@Test
	public void testSaldo(){
	ContaCorrente c1 = new ContaCorrente(10,002);
	String valorRetornado=cxe1.saldo(c1);
	assertTrue(valorRetornado.equals("O saldo é R$10"));
	}

		
	@Test
	public void testHardwareLogar(){
	mock.adicionarConta(c2);
	String cartao = mockH.pegarNumeroDaContaCartao(004);
	String usuarioExistenteNoSistema = Integer.toString(mock.recuperarConta(004).getNumeroDaConta());
	assertTrue(cartao.equals(usuarioExistenteNoSistema));
	}
	
	
	@Test
	public void testHardwareFalhaAoLogarCartaoDeClienteSemConta(){
	mock.adicionarConta(c2);
	String cartao = mockH.pegarNumeroDaContaCartao(87876);
	String usuarioExistenteNoSistema = Integer.toString(mock.recuperarConta(004).getNumeroDaConta());
	assertFalse(cartao.equals(usuarioExistenteNoSistema));
	}
	
	@Test
	public void testCaixaEletronicoLogando(){
	boolean usuario;
	mock.adicionarConta(c2);
	usuario = mock.verificaExistenciaDoCartao(mockH.pegarNumeroDaContaCartao(004));
	String logado = cxe1.logar(usuario);
	assertEquals(true,logado.equals("Usuário Autenticado"));
	}
	
	@Test
	public void testCaixaEletronicoLogandoFalha(){
	boolean usuario;
	mock.adicionarConta(c2);
	usuario = mock.verificaExistenciaDoCartao(mockH.pegarNumeroDaContaCartao(002));
	String logado = cxe1.logar(usuario);
	assertEquals(true,logado.equals("Não foi possível autenticar o usuário"));
	}
	
	@Test
	public void testEntregarDinheiro(){
	assertEquals(false,mockH.verificaFalhas());
	
	}
	
	@Test
	public void testEntregarDinheiroFalha(){
	mockH.falhaEntregaDinheiro();
	assertEquals(false,mockH.verificaFalhas());
	
	}
	@Test
	public void testLeituraEnvelopeFalha(){
	mockH.falhaLeituraEnvelope();
	assertEquals(false,mockH.verificaFalhas());
	
	}
	@Test
	public void testLeituraEnvelope(){
	assertEquals(false,mockH.verificaFalhas());
	
	}
	
	@Test
	public void testAgregarUsuarioLogado(){
	mock.adicionarConta(c2);
	cxe1.setContaLogada(mock.recuperarConta(004));
	assertNotEquals(null,cxe1.contaLogada);
	}
	
	@Test
	public void testPersistirConta(){
	mock.adicionarConta(c2);
	cxe1.setContaLogada(mock.recuperarConta(004));
	cxe1.sacar(c2, 10);	
	mock.persistirConta(c2);
	assertEquals(mock.recuperarConta(004).getSaldo(),c2.getSaldo());
	}
	
	
}
