package EntidadesComponentes;

public abstract class Achievement {
	String name;

	public Achievement(String name) {
	
		this.name = name;
	}

	
	public String getNome() {
		
		return name;
	}
	
	public abstract void addAchievement(Usuario u);

	

	
	

}
