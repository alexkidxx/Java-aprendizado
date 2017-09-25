import java.math.*;
public class CompraParcelada extends Compra {

	private int qtdParcelas;
	private double jurosMensal;
	
	public CompraParcelada(Double v,int q,double j) {
	super(v);
	this.qtdParcelas=q;
	this.jurosMensal=j;
	}

	@Override
	public double total() {
	double total;
	total = this.valor * Math.pow((1 + jurosMensal),(this.qtdParcelas));
 	return total;
	}
	

}
