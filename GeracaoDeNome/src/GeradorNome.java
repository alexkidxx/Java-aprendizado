
public class GeradorNome {
	
	private Tratamento tratamento = new NullTratamento();
	
	
	
public void setTratamento(Tratamento tratamento) {
		this.tratamento = tratamento;
	}

public String gerarNome(String nomeBase){
	
	
	return tratamento.tratar() + getTratamento() + nomeBase;
}

protected String getTratamento() {
	
	return "";
}




}
