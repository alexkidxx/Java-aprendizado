

public class CaixaEletronico {

	

	public ContaCorrente contaLogada;
	

	public String logar(boolean estado) {
		if(estado)
		return "Usu�rio Autenticado";
			return "N�o foi poss�vel autenticar o usu�rio";
	}
	
	public String sacar(ContaCorrente c1, int valorASerSacado) {
		
	
		if(c1.getSaldo()>=valorASerSacado){
			c1.sacar(valorASerSacado);
			return "Retire seu dinheiro";
		}
		return "Saldo insuficiente";
	}

	public String depositar(ContaCorrente c1, int valorASerDepositado) {
		if(valorASerDepositado>0)
		return "Dep�sito recebido com sucesso";
			return "Falha no dep�sito";
	}

	public String saldo(ContaCorrente c1) {
	
		return "O saldo � R$"+c1.getSaldo();
	}

	public void setContaLogada(ContaCorrente contaRecuperada) {
		this.contaLogada = contaRecuperada;
		
		
	}



}
