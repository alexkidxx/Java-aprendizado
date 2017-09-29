package EntidadesComponentes;

import java.util.ArrayList;
import java.util.HashMap;

public class Usuario {

	
	
	private String name;
	private HashMap<String,Achievement> ach;
	
	

	public Usuario(String name) {
		this.name = name;
		this.ach = new HashMap<String,Achievement>();
	}

	public void addAchievement(Achievement q) {
	ach.put(q.getNome(), q);
	
	}

	public Achievement getAchievement(String nomeAchievement) {
		
		return ach.get(nomeAchievement);
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", ach=" + ach + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public boolean possuiEssaConquista(String nameConquista) {
		if(ach.containsKey(nameConquista))
		return true;
		return false;
	}

	
	
}
