
public class GeradorNomeBuilder {

	private GeradorNome gn;
	
	
	public GeradorNomeBuilder criarPessoa() {
		gn = new GeradorNome();
		return this;
	}

	public GeradorNome gerar() {
		
		return gn;
	}

	public GeradorNomeBuilder criarMestre() {
		gn = new GeradorMestre();
		return this;
	}

	public GeradorNomeBuilder criarDoutor() {
		gn = new GeradorDoutor();
		
		return this;
	}

	public GeradorNomeBuilder excelentissimo() {
		gn.setTratamento(new Excelentissimo());
		return this;
	}

	public GeradorNomeBuilder magnifico() {
		gn.setTratamento(new Magnifico());
		return this;
	}

}
