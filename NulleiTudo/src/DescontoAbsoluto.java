
public class DescontoAbsoluto implements Desconto{
	
	private double valorDesconto;

	public DescontoAbsoluto(double valorDesconto) {
		super();
		this.valorDesconto = valorDesconto;
		
	}
	
	@Override
	public double darDesconto(double valorOriginal){
		return valorOriginal - valorDesconto;
		
	}

}
