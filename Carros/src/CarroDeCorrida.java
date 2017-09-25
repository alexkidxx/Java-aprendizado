
public abstract class CarroDeCorrida{

	public abstract void acelerar();

	protected int velocidade;
	protected int velocidadeMaxima;
	protected String nome;

	public void frear() {
		velocidade = velocidade /2;
		
	}

	public int getVelocidade() {
		return velocidade;
		
	}

	public String getNome() {
		return nome;
	}

	public int getPotencia() {
		
		return potencia;
	}

}
