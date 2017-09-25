import static org.junit.Assert.*;

import org.junit.Test;

public class TesteArmazenamento {

	@Test
	public void testCriarArquivoDeSaveDoObjeto(){
	Armazenamento ar = new Armazenamento();
	Placar placar = new Placar();
	Usuario alex = new Usuario("Alex");
	Usuario elis = new Usuario("elis");
	Usuario carlos = new Usuario("carlos");
	ar.adicionaPonto(placar,alex, "energia", 10);
	ar.adicionaPonto(placar,elis, "estrela", 15);
	ar.adicionaPonto(placar, carlos, "like", 11);
	ar.gravaEmArquivo(placar.usuarios);	
	assertEquals(placar.armazenamento,null);
	}
	
	@Test
	public void testRecuperarArquivoSaveDoObjeto(){
	Armazenamento ar = new Armazenamento();
	Placar placar = new Placar();
	placar.setArmazenamento(ar.recuperaArmazenamentoDeArquivo());
	assertEquals(placar.usuarios.size(),3);
	}
}
