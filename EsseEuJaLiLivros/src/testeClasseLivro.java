import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testeClasseLivro {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuscaUmLivro() {
		
		Livro veiDoBanco = new Livro();
    	veiDoBanco =  LivroDAO.getLivro(8);
    	Livro testeLivro = new Livro("O espadachin de carvão","Literatura fantástica",190);
    	assertEquals(veiDoBanco.getId(),testeLivro.getId());
        
		
		
		
	}

}
