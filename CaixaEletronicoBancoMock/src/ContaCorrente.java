
public class ContaCorrente {

	private int saldo;
	private int numeroDaConta;

	public ContaCorrente(int s) {
		this.saldo= s;
	}

	public ContaCorrente(int saldoInicial, int numeroParaAConta) {
		this.saldo = saldoInicial;
		this.numeroDaConta = numeroParaAConta;
	}

	
	public int getSaldo(){
		
		
		return saldo;
	}

	public void depositar(int deposito) {
		if(deposito>0)
			saldo += deposito;
		
		
	}

	public void sacar(int valorSacado) {
		if(valorSacado<=this.getSaldo())
			saldo-=valorSacado;
		}
	
	public int getNumeroDaConta(){
		return numeroDaConta;
	}

	public void setSaldo(int s) {
		this.saldo = s;
		
	}
	
}
