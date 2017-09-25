import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteTrechosCompostos {



	@Test
	public void trechoComEscala() {
		TrechoAereo t1  = new TrechoAereoSimples("GRU","FOR",200,400);
		TrechoAereo t2  = new TrechoAereoSimples("FOR","NAT",150,200);
		TrechoAereoComEscala escala = new TrechoAereoComEscala(t1,t2);
		assertEquals("GRU",escala.getOrigem());
		assertEquals("NAT",escala.getDestino());
		assertEquals(350,escala.getCusto());
		assertEquals(600,escala.getDistancia());
		
	}
	
	@Test(expected=RuntimeException.class)
	public void trechoComEscalaAeroportoDiferente() {
		TrechoAereo t1  = new TrechoAereoSimples("GRU","FOR",200,400);
		TrechoAereo t2  = new TrechoAereoSimples("BSB","NAT",150,200);
		TrechoAereoComEscala escala = new TrechoAereoComEscala(t1,t2);
	
		
	}
	
	@Test
	public void trechoComConeccao() {
		TrechoAereo t1  = new TrechoAereoSimples("GRU","FOR",200,400);
		TrechoAereo t2  = new TrechoAereoSimples("FOR","NAT",150,200);
		TrechoAereo escala = new TrechoAereoComConexao(t1,t2,80);
		assertEquals("GRU",escala.getOrigem());
		assertEquals("NAT",escala.getDestino());
		assertEquals(430,escala.getCusto());
		assertEquals(600,escala.getDistancia());
		
	}
	
	@Test
	public void trechoComEscalaEConcexao() {
		TrechoAereo t1  = new TrechoAereoSimples("GRU","FOR",200,400);
		TrechoAereo t2  = new TrechoAereoSimples("FOR","NAT",150,200);
		TrechoAereoComEscala escala = new TrechoAereoComEscala(t1,t2);
		TrechoAereo t3  = new TrechoAereoSimples("NAT","BSB",250,300);
		TrechoAereo conexao = new TrechoAereoComConexao(escala,t3,50);
		
		assertEquals("GRU",conexao.getOrigem());
		assertEquals("BSB",conexao.getDestino());
		assertEquals(650,conexao.getCusto());
		assertEquals(900,conexao.getDistancia());
		
	}
	
	

}
