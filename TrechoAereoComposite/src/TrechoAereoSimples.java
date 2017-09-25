
public class TrechoAereoSimples implements TrechoAereo {
private String origem;
private String destino;
private int custo;
private int distancia;


public TrechoAereoSimples(String origem, String destino, int custo, int distancia) {
	super();
	this.origem = origem;
	this.destino = destino;
	this.custo = custo;
	this.distancia = distancia;
}


/* (non-Javadoc)
 * @see TrechoAereo#getOrigem()
 */
@Override
public String getOrigem() {
	return origem;
}


/* (non-Javadoc)
 * @see TrechoAereo#getDestino()
 */
@Override
public String getDestino() {
	return destino;
}


/* (non-Javadoc)
 * @see TrechoAereo#getCusto()
 */
@Override
public int getCusto() {
	return custo;
}


/* (non-Javadoc)
 * @see TrechoAereo#getDistancia()
 */
@Override
public int getDistancia() {
	return distancia;
}

	
	
	
	
}
