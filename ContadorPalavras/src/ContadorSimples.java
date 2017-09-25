
public class ContadorSimples implements ContadorPalavras{

	private int qtd;
	
	
	@Override
	public int contagem() {
		// TODO Auto-generated method stub
		return qtd;
	}

	@Override
	public void contar(String palavra) {
		qtd++;
	}

}
