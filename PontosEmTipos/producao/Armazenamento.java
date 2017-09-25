import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Armazenamento  {
	
	private ArrayList<Usuario> ar;


	public Armazenamento(){
		
		
	}
		
 public void gravaEmArquivo(ArrayList<Usuario> u){
	 try
     {
		FileOutputStream arq = new FileOutputStream("f:/coursera.arc");
		ObjectOutputStream obj = new ObjectOutputStream(arq);
		obj.writeObject(u);
		obj.flush();
		    
     }
     catch( Exception e ){
             e.printStackTrace( );
     }  
 } 
 

public ArrayList<Usuario> recuperaArmazenamentoDeArquivo(){
	ArrayList<Usuario> ar = null;

    try
    {
    	FileInputStream arq = new FileInputStream("f:/coursera.arc");
    	ObjectInputStream obj = new ObjectInputStream(arq);
    	ar = (ArrayList<Usuario>) obj.readObject();
    	obj.close();
    }
    catch( Exception e ){
    	    e.printStackTrace( );
    }
	return ar;
	
	
}

public void setArmazenamento(ArrayList<Usuario> arrayRecuperado, Placar placar) {
	placar.usuarios=arrayRecuperado;
	
}

public void adicionaPonto(Placar placar, Usuario usuarioPontuante, String tipo, int quantidade) {
	if(placar.usuarios.contains(usuarioPontuante)){			
	Usuario aSerPontuado =	placar.usuarios.get(placar.usuarios.indexOf(usuarioPontuante));
	aSerPontuado.pontua(tipo, quantidade);
	}else{
	placar.usuarios.add(usuarioPontuante);
	usuarioPontuante.pontua(tipo, quantidade);
	}

}

public int recuperaPonto(Placar placar, Usuario usuarioRequerido, String tipo) {
	int pontosDesseTipo = 0;
	for(Usuario u: placar.usuarios){
		if(u.equals(usuarioRequerido))
		 pontosDesseTipo = usuarioRequerido.getPontosPorTipo(tipo);
		
	}
	
	return pontosDesseTipo;
}

public String  recuperaTodosPontos(Placar placar) {
	
String retorno = placar.usuarios.toString();
	return  retorno;
	
}

public String recuperaTodosOsPontosDeUmUsuario(Usuario u){
	return u.recuperaTodosPontosDoUsuario();
	}




}
	
	

