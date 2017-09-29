package EntidadesComponentes;
public class Badge extends Achievement {

	public Badge(String name) {
		super(name);
		
	}

	@Override
	public void addAchievement(Usuario u) {
		if(!u.possuiEssaConquista(this.name)){
			u.addAchievement(this);
		}
		
	}

}
