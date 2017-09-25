import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteProxySeguranca {


	@Test
	public void testAutorizaAcesso() {
		Usuario alex = new Usuario("Alex");
		alex.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock,alex);
		n.executaTransacao();
		assertEquals(mock.foiAcessado(),true);
	
	}
	
	@Test
	public void testNaoAutorizaAcesso() {
		Usuario alex = new Usuario("Alex");
		alex.autorizaAcesso("InterfaceNegocio", "executaTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock,alex);
		try {
			n.cancelaTransacao();
			fail();
		} catch (Exception e) {
			
			assertFalse(mock.foiAcessado());
		}
		
			
			
		
	}

}
