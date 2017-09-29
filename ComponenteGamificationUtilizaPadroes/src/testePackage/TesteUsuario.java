package testePackage;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EntidadesComponentes.Achievement;
import EntidadesComponentes.Points;
import EntidadesComponentes.Usuario;



public class TesteUsuario {

	@Test
	public void testAchievementeDeMesmoNomeSomaPontos() {
		Usuario u = new Usuario("Alex");
		
		Achievement q = new Points("start",10);
		Achievement j = new Points("start",15);
		Achievement m = new Points("primeiro chefe",5);	

		u.addAchievement(q);
		u.addAchievement(j);
		u.addAchievement(m);
				
		int valorDoStart = u.getAchievement("start").getValor();
		int valorDoPrimeiroChefe = u.getAchievement("primeiro chefe").getValor();
		
		assertEquals(25,valorDoStart);
		assertEquals(5,valorDoPrimeiroChefe);
		
	}

}
