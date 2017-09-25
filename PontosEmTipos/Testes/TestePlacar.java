import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestePlacar {

	Usuario alex;
	Usuario regina;
	Usuario claudio;
	Usuario freitas;
	Usuario rafael;
	Usuario cleiton;
	Placar placar;
	MockArmazenamento mockArmazenamento;
	@Before
	public void criaPlacar(){
	
	alex = new Usuario("alex");
	regina = new Usuario("regina");
	claudio = new Usuario("claudio");
	freitas = new Usuario("freitas");
	rafael = new Usuario("rafael");
	cleiton = new Usuario("cleiton");
	mockArmazenamento = new MockArmazenamento();
	placar = new Placar();
	}
	
	
	@Test
	public void testeGuardarUmUsuario(){
	placar.guardarUsuario(alex);
	assertEquals(1, placar.usuarios.size());
	}
	
	@Test
	public void testeUsuarioAdicionaPonto(){
	
	mockArmazenamento.adicionaPonto(placar, alex, "estrela", 10);
	
	assertEquals(10,mockArmazenamento.recuperaPonto(placar,alex,"estrela"));
	}
	
	@Test
	public void testPontuaUsuarioJaExistenteComMesmoPonto(){
	placar.guardarUsuario(regina);	
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	assertEquals(20,mockArmazenamento.recuperaPonto(placar,regina,"estrela"));		
			
	}
	
	@Test
	public void testPontuaDoisTiposDePontoNumUsuarioExistente(){
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	mockArmazenamento.adicionaPonto(placar, regina, "likes", 30);
	
	assertEquals(10,mockArmazenamento.recuperaPonto(placar,regina,"estrela"));
	assertEquals(30,mockArmazenamento.recuperaPonto(placar,regina,"likes"));
	
		
	}
	
	@Test
	public void testRecuperaTodosPontosDeUmUsuario(){
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	mockArmazenamento.adicionaPonto(placar, regina, "likes", 30);
	
	assertEquals("{estrela=10, likes=30}",regina.recuperaTodosPontosDoUsuario());	
	mockArmazenamento.adicionaPonto(placar, regina, "moeda", 5);
	assertEquals("{moeda=5, estrela=10, likes=30}",mockArmazenamento.recuperaTodosOsPontosDeUmUsuario(regina));
		
	} 
	
	@Test
	public void testRecuperaTodosPontosDeTodosUsuarios(){
	
		mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
		mockArmazenamento.adicionaPonto(placar, regina, "likes", 30);
		mockArmazenamento.adicionaPonto(placar, alex, "moeda", 1);
		mockArmazenamento.adicionaPonto(placar, alex, "likes", 33);

	assertEquals("[regina [pontosHash={estrela=10, likes=30}], alex [pontosHash={moeda=1, likes=33}]]",mockArmazenamento.recuperaTodosPontos(placar));
	
	}
	
	@Test
	public void testRetornaUsuariosQuePossuemUmTipoInformado(){
	
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	mockArmazenamento.adicionaPonto(placar, regina, "likes", 30);
	mockArmazenamento.adicionaPonto(placar, alex, "moeda", 1);
	mockArmazenamento.adicionaPonto(placar, alex, "likes", 33);
	mockArmazenamento.adicionaPonto(placar, rafael, "estrela", 12);
	mockArmazenamento.adicionaPonto(placar, rafael, "likes", 3);
	mockArmazenamento.adicionaPonto(placar, freitas, "estrela", 4);
	mockArmazenamento.adicionaPonto(placar, freitas, "likes", 2);
	ArrayList<Usuario> user = new ArrayList();
	user.add(regina);
	user.add(rafael);
	user.add(freitas);
	assertEquals(user,placar.recuperaUsuariosQuePossuamUmTipo("estrela"));	
	}
	
	@Test
	public void testRetornaListaDeUsuariosRankiados(){
	mockArmazenamento.adicionaPonto(placar, regina, "estrela", 10);
	mockArmazenamento.adicionaPonto(placar, regina, "likes", 30);
	mockArmazenamento.adicionaPonto(placar, alex, "moeda", 1);
	mockArmazenamento.adicionaPonto(placar, alex, "likes", 33);
	mockArmazenamento.adicionaPonto(placar, rafael, "estrela", 12);
	mockArmazenamento.adicionaPonto(placar, rafael, "likes", 3);
	mockArmazenamento.adicionaPonto(placar, freitas, "estrela", 4);
	mockArmazenamento.adicionaPonto(placar, freitas, "likes", 2);
	
	ArrayList<Usuario> user = new ArrayList();
	user.add(rafael);
	user.add(regina);
	user.add(freitas);	
	assertEquals(user,placar.rankUsuariosPorTipo("estrela"));	
	}
	
	
	

}

