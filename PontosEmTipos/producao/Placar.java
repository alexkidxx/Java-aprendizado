import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Placar implements Serializable{

 ArrayList<Usuario> usuarios = new ArrayList();
public Armazenamento armazenamento;


 
	public void guardarUsuario(Usuario usuario) {
	usuarios.add(usuario);
	}

	public void adicionaPonto(Usuario usuarioPontuante, String tipo, int quantidade) {
		armazenamento.adicionaPonto(this, usuarioPontuante, tipo, quantidade);
	}

	public int recuperaPonto(Usuario usuarioRequerido, String tipo) {
		return armazenamento.recuperaPonto(this, usuarioRequerido, tipo);
	}

	public String  recuperaTodosPontos() {
		return armazenamento.recuperaTodosPontos(this);
	}

	public  ArrayList<Usuario> recuperaUsuariosQuePossuamUmTipo(String tipoRequerido) {
		ArrayList<Usuario> usuariosTemTipo = new ArrayList();

		for(Usuario u: usuarios)
			if(u.pontosHash.containsKey(tipoRequerido)){
			u.setQtdnoHash(u.getPontosPorTipo(tipoRequerido));
			usuariosTemTipo.add(u);	
			}
			return usuariosTemTipo;
							
	}

	public ArrayList<Usuario> rankUsuariosPorTipo(String tipoRequerido) {
	
	ArrayList<Usuario> usuariosRank = new ArrayList();
	usuariosRank = recuperaUsuariosQuePossuamUmTipo(tipoRequerido);
		
	 Collections.sort(usuariosRank);
	
	 return usuariosRank;
		
	
	}

	 public void setArmazenamento(ArrayList<Usuario> arrayList) {
		this.usuarios = arrayList;
		
	}

	

	
	

}
