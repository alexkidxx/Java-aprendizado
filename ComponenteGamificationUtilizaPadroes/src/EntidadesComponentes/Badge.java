package EntidadesComponentes;
public class Badge extends Achievement {

	private String name;
	
	public Badge(String name) {
		super(name);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public boolean equals(Badge obj) {
		if(this.name == obj.getNome())
			return true;
					return false;
	}

	@Override
	public void addAchievement(Usuario u) {
		if(!u.possuiEssaConquista(this.name)){
			u.addAchievement(this);
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return  name;
	}

	
	
}
