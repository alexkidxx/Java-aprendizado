import java.util.ArrayList;

public class MockServicoRemoto implements ServicoRemoto{

	public ArrayList<ContaCorrente> contas = new ArrayList();

	
	@Override
	public ContaCorrente recuperarConta(int numeroDaContaASerRetornado) {
		ContaCorrente contaRetornada = null;
		
		for(ContaCorrente c: contas){
		if(c.getNumeroDaConta()==numeroDaContaASerRetornado)
			contaRetornada=c;
			
		}
		
				return contaRetornada;	
	}
	@Override
	public void persistirConta(ContaCorrente c) {
		for(ContaCorrente con: contas){
			if(con.getNumeroDaConta()==c.getNumeroDaConta()&&con.getSaldo()!=c.getSaldo())
				con.setSaldo(c.getSaldo());
				
		}
		
		
		
	}
	
	public void adicionarConta(ContaCorrente c) {
		contas.add(c);
		
	}
	public void logarComSucesso(String cartao) {
		// TODO Auto-generated method stub
		
	}
	public boolean verificaExistenciaDoCartao(String pegarNumeroDaContaCartao) {
		int numeroCartao = Integer.parseInt(pegarNumeroDaContaCartao);
		if(recuperarConta(numeroCartao)!=null)
			return true;		
		return false;
	}
	

}
