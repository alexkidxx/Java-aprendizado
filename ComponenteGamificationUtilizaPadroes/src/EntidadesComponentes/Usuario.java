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
	
	if(!ach.containsKey(q.getNome())){
	this.ach.put(q.getNome(), q);
	}else{
		if(q.getClass()==Points.class){
			Achievement j = new Points(q.getNome(), q.getValor() + ach.get(q.getNome()).getValor());
			ach.put(q.getNome(),j);
		}
	}
	
	
	}

	public Achievement getAchievement(String nomeAchievement) {
		
		return ach.get(nomeAchievement);
	}

	@Override
	public String toString() {
		return "Usuario [name=" + name + ", ach=" + ach + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}
