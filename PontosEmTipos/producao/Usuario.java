import java.util.HashMap;
import java.io.Serializable;
import java.util.Collections;

public class Usuario implements Comparable<Usuario>, Serializable{
	
	private String nome;
	private int qtdnoHash;

	public Usuario(String nome) {
		this.nome =  nome;
	}

	public String getNome() {
		return nome;
	}

		

	HashMap<String, Integer> pontosHash = new HashMap<>();
	
	public void pontua(String tipo, int quantidade) {
		int quantidadeJaExistente;
	if(pontosHash.containsKey(tipo)){
		quantidadeJaExistente = pontosHash.get(tipo);
		pontosHash.remove(tipo);
		pontosHash.put(tipo,quantidade+quantidadeJaExistente);
	}else{
	pontosHash.put(tipo, quantidade);
	}
	}

	public int getPontosPorTipo(String tipo) {
		if(pontosHash.containsKey(tipo))
		return pontosHash.get(tipo);
		return -1;// por enquando carai
	}

	@Override
	public String toString() {
		return this.getNome()+" [pontosHash=" + pontosHash + "]";
	}

	public String recuperaTodosPontosDoUsuario() {
			
		return this.pontosHash.toString();
	
	}

	@Override
	public int compareTo(Usuario outroUsuario) {
		 if (this.qtdnoHash > outroUsuario.qtdnoHash) {
	            return -1;
	        }
	        if (this.qtdnoHash < outroUsuario.qtdnoHash) {
	            return 1;
	        }
	        return 0;
	  
	}

	public int getQtdnoHash() {
		return qtdnoHash;
	}

	public void setQtdnoHash(int qtdnoHash) {
		this.qtdnoHash = qtdnoHash;
	}

	
	
}
