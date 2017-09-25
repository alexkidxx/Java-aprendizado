
public class NegocioMock implements InterfaceNegocio {

	 private boolean foiAcessado = false;
	@Override
	public void executaTransacao() {
		foiAcessado = true;

	}

	@Override
	public void cancelaTransacao() {
		foiAcessado = true;
		

	}
	
	public boolean foiAcessado(){
		return foiAcessado;
	}

}
