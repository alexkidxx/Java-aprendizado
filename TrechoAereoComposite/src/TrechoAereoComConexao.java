
public class TrechoAereoComConexao  extends TrechoAereoComEscala {

	private int tarifaConexao;
	
	public TrechoAereoComConexao(TrechoAereo t1, TrechoAereo t2, int tarifa) {
		super(t1, t2);
		this.tarifaConexao = tarifa;
	}

	@Override
	public int getCusto() {
		
		return super.getCusto() + tarifaConexao;
	}


}
