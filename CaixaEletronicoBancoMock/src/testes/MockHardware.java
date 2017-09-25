
package testes;

public class MockHardware implements Hardware{

	private boolean dinheiroEntregue;
	private boolean envelopeLido;

	@Override
	public String pegarNumeroDaContaCartao(int contaLidaDoCartao) {
	return Integer.toString(contaLidaDoCartao);
	}

	@Override
	public void entregarDinheiro() {
	 dinheiroEntregue = true;
		
	}

	@Override
	public void lerEnvelope() {
	envelopeLido = true;
	
		
	}

	public boolean verificaFalhas(){
		if(dinheiroEntregue)return true;
		if(envelopeLido)return true;
		return false;
		
		
	}

	public void falhaEntregaDinheiro() {
		dinheiroEntregue=false;
		
	}

	public void falhaLeituraEnvelope() {
		envelopeLido = false;
		
	}

}
