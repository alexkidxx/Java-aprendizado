package EntidadesComponentes;
public class Points extends Achievement {
	Integer valor;

	public Points(String name,int valor) {
		super(name);
		this.valor = valor;
	}

	@Override
	public String getNome() {
		
		return super.getNome();
	}

	
	public Integer getValor() {
		
		return valor;
	}

	@Override
	public void addAchievement(Usuario u) {
			
		
			if(u.possuiEssaConquista(this.name)){
			Integer valorAntigo = ((Points) u.getAchievement(this.getNome())).getValor();
			this.valor += valorAntigo;
			
			u.addAchievement(this);
			}else{
				
				u.addAchievement(this);
			}
				
	
	}

	

}
