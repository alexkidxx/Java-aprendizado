
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1= new Carro();
		c1.setPotencia(10);
		c1.nome="Corcel";
		c1.velocidade=0;
		Carro c2= new Carro();
		c2.setPotencia(15);
		c2.nome="Fiesta";
		c2.velocidade=0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c2.acelerar();
		c2.acelerar();
		
		c1.frear();
		c1.imprimir();
		c2.imprimir();
	}

}
