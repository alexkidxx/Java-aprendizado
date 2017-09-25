package Testes;


public class ProdutoComTamanho extends Produto {
	
	
	private int tamanho;

	public ProdutoComTamanho(String n, int c, double p,int t) {
	super(n, c, p);
	this.tamanho = t;
	}

	public int getTamanho() {
	return tamanho;
	}

	@Override
	public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + tamanho;
	return result;
	}

	@Override
	public boolean equals(Object obj) {
	if(super.equals(obj)==true && equalsTamanho((ProdutoComTamanho) obj)==true)
	return true;
	return false;
	}
	
	public boolean equalsTamanho(ProdutoComTamanho obj){
	if(this.tamanho ==obj.tamanho)
	return true;
	return false;
		
	}
	@Override
	public String toString() {
	return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", tamanho=" + tamanho +"]";
	}

}
