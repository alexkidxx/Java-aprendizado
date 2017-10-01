package testePackage;



import static org.junit.Assert.*;

import org.junit.Test;

import EntidadesComponentes.Achievement;
import EntidadesComponentes.Badge;
import EntidadesComponentes.Points;
import EntidadesComponentes.Usuario;



public class TesteUsuario {
	
	

	@Test
	public void testAchievementeDeMesmoNomeSomaPontos() {
		Usuario u = new Usuario("Alex");
		
		Achievement q = new Points("start",10);
		Achievement j = new Points("start",15);
		Achievement m = new Points("primeiro chefe",5);	
		
		
		q.addAchievement(u);
		j.addAchievement(u);
		m.addAchievement(u);
		
		
		Points a = (Points) u.getAchievement("start");
		Points b = (Points) u.getAchievement("primeiro chefe");
		int valorDaInstanciaStart = a.getValor();
		int valorDaInstanciaPrimeiroChefe = b.getValor();
		
		
		assertEquals(25,valorDaInstanciaStart);
		assertEquals(5,valorDaInstanciaPrimeiroChefe);
		
	}
	@Test
	public void testAchievementeDuasInstanciasBadgeIguais() {
		Achievement a = new Badge("Matador de aluguel");
		Achievement b = new Badge("Matador de aluguel");
		Usuario u = new Usuario("Alex");
		b.addAchievement(u);
		a.addAchievement(u);
		
	
	
		
		assertEquals("{Matador de aluguel=null}",u.getTodosAchievements().toString());
	}
	

}
