package EntidadesComponentes;
import java.util.ArrayList;
import java.util.List;

import interfaces.AchievementObserver;
import interfaces.AchievementStorage;


public class MemoryAchievementStorage implements AchievementStorage {

	private ArrayList<Usuario> usuarios;
	
	
	public MemoryAchievementStorage() {
		super();
		this.usuarios = new ArrayList<Usuario>();
	}


	public void addUser(Usuario u){
		usuarios.add(u);
	}
	
	public Usuario getUser(String nome){
		for(Usuario u:usuarios)
			if(u.getNome().equals(nome))
				return u;
		return null;
	}
	

	@Override
	public List<Achievement> getAchievements(String user) {
		Usuario  u = getUser(user);
		ArrayList<Achievement> conquistas = u.getConquistas();
	
		return conquistas;
	}



	@Override
	public boolean possuiEssaConquista(String conquista, String user) {
		for(Usuario u:usuarios){
			if(u.getNome().equals(user)){
				if(u.possuiConquista(conquista)){
				return true;	
				}
				
			}
				
			
		}
			
		
		return false;
		
	}
	
	public boolean possuiEsseUser(String nomeUser){
		
		for(Usuario u:usuarios)
			if(u.getNome().equals(nomeUser))
				return true;
		return false;
	}


	@Override
	public void addAchievement(String user, Achievement a) {
		
	 	a.addd(user,this);
	 	InventorObserver i = new InventorObserver();
	 	ParticipationObserver pi = new ParticipationObserver();
	 	pi.achievementUpdate(user, a);
	 	i.achievementUpdate(user,a);
	 	

	}




	@Override
	public Achievement getAchievement(String user, String achievementName) {
		Usuario u = getUser(user);

		Achievement a = u.getConquista(achievementName);
		
		return a;
			
	}



	

	
	
	
	
	
	
	
	
}
