
public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome fn;
	
	public Autoridade(String nome, String sobrenome,FormatadorNome fn) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.fn = fn;
	}

	public String getNome() {
	return nome;
	}

	public String getSobrenome() {
	return sobrenome;
	}

	public String getTratamento() {
		return fn.formatarNome(nome, sobrenome);
	}

	
	
}
		



