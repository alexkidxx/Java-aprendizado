package testePackage;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import EntidadesComponentes.Achievement;
import EntidadesComponentes.AchievementStorageFactory;
import EntidadesComponentes.Badge;
import EntidadesComponentes.Forum;
import EntidadesComponentes.ForumServiceGamificationProxy;
import EntidadesComponentes.MemoryAchievementStorage;
import EntidadesComponentes.Points;
import EntidadesComponentes.Usuario;
import interfaces.AchievementStorage;
import interfaces.ForumService;
public class Testes {

	@Test
	public void testGetNomeInanciasdeAchievement() {
	
		Achievement a = new Badge("primeiro chefe");
		Achievement b = new Points("headshot",10);
		assertEquals(a.getNome(),"primeiro chefe");
		assertEquals(b.getNome(),"headshot");
		
	}
	
	@Test
	public void testGetPontosInstanciaPoints(){
		Achievement b = new Points("headshot",10);
		assertEquals(10,((Points) b).getValor());
	
		
	}
	@Test
	public void testPossuiEsseUser(){
		
	Usuario a = new Usuario("Alex");
	Usuario g = new Usuario("Genaro");
	Usuario d = new Usuario("Deuclécio");
	MemoryAchievementStorage memo = new MemoryAchievementStorage();
	
	memo.addUser(a);
	memo.addUser(g);
	memo.addUser(d);
	
	assertEquals(true,memo.possuiEsseUser("Alex"));
	assertEquals(true,memo.possuiEsseUser("Genaro"));
	assertEquals(true,memo.possuiEsseUser("Deuclécio"));
	assertEquals(false,memo.possuiEsseUser("Cleitinho"));
	
	}
	
	@Test
	public void testGetBadge(){
	
		MemoryAchievementStorage memo = new MemoryAchievementStorage();
		Achievement a = new Badge("primeiro chefe");
		Usuario alex =  new Usuario("Alex");
		alex.addConquista(a);
		memo.addUser(alex);
		
		assertEquals(a,memo.getAchievement("Alex","primeiro chefe"));
		
		
	}
	
	@Test
	public void getUser(){
		MemoryAchievementStorage memo = new MemoryAchievementStorage();
		
		Usuario alex = new Usuario("Alex");
		
		memo.addUser(alex);
		Usuario Elis = memo.getUser("Elis");
	
		assertEquals(alex,memo.getUser("Alex"));
		assertEquals(Elis,memo.getUser("Elis"));
		
	}
	
	
	@Test
	public void getConquistaUser(){
		
		Badge a = new Badge("primeiro chefe");
		Achievement b = new Badge("segundo chefe");
		Achievement c = new Points("terceiro chefe",10);
		Points d = new Points("quarto chefe",25);
		
		
		Usuario alex = new Usuario("Alex");
		alex.addConquista(a);
		alex.addConquista(b);
		alex.addConquista(c);
		alex.addConquista(d);
	
		assertEquals(a,alex.getConquista("primeiro chefe"));
		assertEquals(b,alex.getConquista("segundo chefe"));
		assertEquals(c,alex.getConquista("terceiro chefe"));
		assertEquals(d,alex.getConquista("quarto chefe"));

	}
	
	
	
	
	@Test
	public void testAdicionarBadge(){
	
		MemoryAchievementStorage memo = new MemoryAchievementStorage();
	
		Achievement a = new Badge("primeiro chefe");

		memo.addAchievement("Alex", a);
		
		
		assertEquals(a,memo.getAchievement("Alex", "primeiro chefe"));
		
	}
	
	@Test
	public void testAdicionarPointsSomandoOsDeNomeIgual(){
	
		MemoryAchievementStorage memo = new MemoryAchievementStorage();
	
		Achievement a = new Points("mata muito",100);
		Achievement b = new Points("mata muito",200);
		Achievement c = new Points("rico de moedas",80);

		memo.addAchievement("Alex", a);
		memo.addAchievement("Alex", b);
		memo.addAchievement("Alex", c);
				
		Achievement r = memo.getAchievement("Alex", "mata muito");
		int valorMataMuito = ((Points) r).getValor();
		Achievement s = memo.getAchievement("Alex", "rico de moedas");
		int valorRicoDeMoedas = ((Points) s).getValor();
		
		
		
		
		assertEquals(300,valorMataMuito);
		assertEquals(80,valorRicoDeMoedas);
		
	}
	
	@Test
	public void testTodosOsAchievementsPorUsuario(){
		MemoryAchievementStorage memo = new MemoryAchievementStorage();
		
		Achievement a = new Points("mata muito",100);
		Achievement b = new Points("rambo",200);
		Achievement c = new Points("rico de moedas",80);
		Achievement d = new Points("serial killer",200);
		Achievement e = new Points("deu o troco",80);
		
		Achievement f = new Badge("Caçador de recompensas");
		Achievement g = new Badge("Caçador de recompensas");
		Achievement h = new Badge("Viciado em Headshot");

		Achievement i = new Badge("Arrombador de portas");
		Achievement j = new Badge("Avareza total");
			
		memo.addAchievement("Alex", a);
		memo.addAchievement("Alex", b);
		memo.addAchievement("Alex", c);
		memo.addAchievement("Alex", d);
		memo.addAchievement("Alex", e);
		memo.addAchievement("Alex", f);
		memo.addAchievement("Alex", g);
		memo.addAchievement("Alex", h);
		
		memo.addAchievement("Elis", i);
		memo.addAchievement("Elis", j);
		
	

		ArrayList<Achievement> todasConquistasElis = new ArrayList<>();
		
		ArrayList<Achievement> todasConquistasAlex = new ArrayList<>();
		
	
		todasConquistasAlex.add(e);
		todasConquistasAlex.add(f);
		todasConquistasAlex.add(h);
		todasConquistasAlex.add(a);
		todasConquistasAlex.add(c);
		todasConquistasAlex.add(d);
		todasConquistasAlex.add(b);

		
		todasConquistasElis.add(i);
		todasConquistasElis.add(j);
		
		
		assertEquals(todasConquistasAlex,memo.getAchievements("Alex"));
		assertEquals(todasConquistasElis,memo.getAchievements("Elis"));
	}
	
	
	@Test
	public void testAddTopic(){
		
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		f.addTopic("cida", "Este eh o topico inicial");
		
		Badge canTalk = new Badge("I CAN TALK");
		Points creation = new Points("CREATION",5);
		
		Achievement t = memo.getAchievement("cida", "I CAN TALK");
		Achievement c = memo.getAchievement("cida", "CREATION");
		
		
		int pontosDoBadge = ((Points) c).getValor();
		
		assertEquals(canTalk,t);
		assertEquals(creation,c);
		assertEquals(5,pontosDoBadge);
		
		
		
	}

	@Test
	public void testAddComment(){
		
		AchievementStorage memo = AchievementStorageFactory.getAchievementStorage();
		
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		f.addComment("julio", "explica tudo", "chuq noia");
		
		Badge letMeAdd = new Badge("LET ME ADD");
		Points participation = new Points("PARTICIPATION",3);
		
		Achievement t = memo.getAchievement("julio", "LET ME ADD");
		Achievement c = memo.getAchievement("julio", "PARTICIPATION");
		int pontosDoBadge = ((Points) c).getValor();
		
		assertEquals(letMeAdd,t);
		assertEquals(participation,c);
		assertEquals(3,pontosDoBadge);
		
		
		
	}

	
	@Test
	public void testLikeTopic(){
		
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		
		f.likeTopic("gertrude", "primeiro topico", "zigfrid");
	
		
		Points creation = new Points("CREATION",1);
		
	
		Achievement c = memo.getAchievement("gertrude", "CREATION");
		int pontosDoCreation = ((Points) c).getValor();
		
		
		assertEquals(creation,c);
		assertEquals(1,pontosDoCreation);
		
				
	}
	@Test
	public void testLikeComment(){
		
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		f.likeComment("tomas", "vale tudo", "comentario besta", "ronald");
		
		
		Points participation = new Points("PARTICIPATION",1);
		
		Achievement t = memo.getAchievement("tomas", "PARTICIPATION");
	
		int pontosDoBadge = ((Points) t).getValor();
		
		assertEquals(participation,t);
		assertEquals(1,pontosDoBadge);
		
		
		
	}
	
	

	@Test
	public void addTopic2Vezes(){
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		f.addTopic("ezequiel", "topico 1");
		f.addTopic("ezequiel", "topico 2");
		
	
		Badge b = new Badge("I CAN TALK");
		Points p = new Points("CREATION",10);
		

		List<Achievement> achievementsDoEz = new ArrayList<Achievement>();
		achievementsDoEz = memo.getAchievements("ezequiel");
			
		assertEquals(b,achievementsDoEz.get(0));
		assertEquals(p,achievementsDoEz.get(1));
		
		
		
	}
	
	@Test 
	public void variosMetodos(){

		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		ForumService fs = new Forum();
		ForumServiceGamificationProxy f = new ForumServiceGamificationProxy(fs);
		f.addTopic("rogerio", "topico 1");
		f.addTopic("kleber", "topico 1");
		f.addTopic("wilson", "topico 1");
		f.addComment("kleber", "topico 1", "rogerio");
		f.likeTopic("wilson", "topico 1", "rogerio");
		f.likeComment("wilson", "topico 1", "comentario 1", "kleber");
		Badge b  = new Badge("I CAN TALK");
		Badge l = new Badge("LET ME ADD");
		Points c = new Points("CREATION", 5);
		
		memo.getAchievement("rogerio", "I CAN TALK");
		
		System.out.println(memo.getAchievements("rogerio"));
		System.out.println(memo.getAchievements("kleber"));
		System.out.println(memo.getAchievements("wilson"));
		
		assertEquals(b,memo.getAchievement("rogerio", "I CAN TALK"));
		assertEquals(b,memo.getAchievement("kleber", "I CAN TALK"));
		assertEquals(b,memo.getAchievement("wilson", "I CAN TALK"));
	
		assertEquals(l,memo.getAchievement("kleber", "LET ME ADD"));

		assertEquals(c,memo.getAchievement("rogerio", "CREATION"));
		assertEquals(c,memo.getAchievement("kleber", "CREATION"));
		c.setValor(6);
		assertEquals(c,memo.getAchievement("wilson", "CREATION"));
		
		
		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void mockLancarException(){
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		ForumService fs = new Forum();
		fs.addComment("moises", "qualquer topico", "tirso");
		memo.getAchievement("tirso","I CAN TALK");
	}
	
	
	
	@Test
	public void testObserver(){
		
		AchievementStorage memo =  AchievementStorageFactory.getAchievementStorage();
		Points c = new Points("CREATION",10);
	
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
		memo.addAchievement("alex", c);
	
		Achievement in = new Badge("INVENTOR");
		
		assertTrue(memo.possuiEssaConquista(in.getNome(), "alex"));
		

		Points p = new Points("PARTICIPATION",10);
		
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		memo.addAchievement("alex", p);
		
		Achievement pa = new Badge("PART OF THE COMMUNITY");
		
	
		assertTrue(memo.possuiEssaConquista(pa.getNome(), "alex"));
		
		

		
			
		
		
		
		
		
	}
	
	
	
	
	

}
