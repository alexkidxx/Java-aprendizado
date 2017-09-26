
public class TratamentoComposite implements Tratamento{

	private Tratamento t1;
	private Tratamento t2;
	
	
	public TratamentoComposite(Tratamento t1, Tratamento t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}


	@Override
	public String tratar() {
		
		return t1.tratar() + t2.tratar();
	}

}
