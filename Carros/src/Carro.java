
public class Carro extends CarroDeCorrida{
	private int potencia;
	public Carro(String nome, int potencia, int velocidadeMaxima) {
		
		this.nome = nome;
		this.setPotencia(potencia);
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}
@Override
public void acelerar(){
	
	velocidade+=getPotencia();
	if(velocidade > velocidadeMaxima)
		velocidade = velocidadeMaxima;
	}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}



}
