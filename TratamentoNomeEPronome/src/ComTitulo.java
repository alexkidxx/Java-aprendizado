
public class ComTitulo implements FormatadorNome{

	private String titulo;
	
	
	public ComTitulo(String t){
		this.titulo=t;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		return this.titulo +" "+ nome + " "+ sobrenome;
	}
	
	
}
