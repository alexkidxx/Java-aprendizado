package EntidadesComponentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Usuario {

	
	
	private String name;
	private HashMap<String,Achievement> ach;
	
	

	public Usuario(String name) {
		this.name = name;
		this.ach = new HashMap<>();
	
	}



	public String getNome() {
		
		return name;
	}

	

public boolean possuiConquista(String nomeConquista){
	if(ach.containsKey(nomeConquista))
		return true;
	
	return false;
	
	
}
	
public Achievement getConquista(String nomeConquista){
	Achievement a = ach.get(nomeConquista);
			
	return a;
}
	
@Override
public String toString() {
	return "Usuario [name=" + name + ", ach=" + ach + "]";
}



public void addConquista(Achievement a){
	ach.put(a.getNome(), a);
	
}

public ArrayList<Achievement> getConquistas(){
	ArrayList<Achievement> lista = new ArrayList<>();
	
	
	ach.forEach((k,v) -> lista.add(v));
	 	
	
	return lista;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Usuario other = (Usuario) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}



	
	
}
