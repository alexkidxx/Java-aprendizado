
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
		inserirNovoTratamento(new Excelentissimo());
		return this;
	}

	private void inserirNovoTratamento(Tratamento t) {
		if(gn.getTratamentoStrategy() instanceof NullTratamento)
		gn.setTratamento(t);
		else
			gn.setTratamento(new TratamentoComposite(gn.getTratamentoStrategy(),t));
	}

	public GeradorNomeBuilder magnifico() {
		inserirNovoTratamento(new Magnifico());
		return this;
	}

	public GeradorNomeBuilder de(String local) {
		gn = new GeradorNomeProxyLocal(gn,local);
		return this;
	}

}
