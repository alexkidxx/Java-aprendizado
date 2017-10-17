package EntidadesComponentes;

import java.util.List;

import interfaces.AchievementStorage;

public class Badge extends Achievement {


	
	public Badge(String name) {
		super(name);
		
	}

	public void addd(String user, AchievementStorage memo) {
	
		Usuario b = memo.getUser(user);
		

	
		if(b!=null){
	
	
			if(!memo.possuiEssaConquista(this.getNome(), user))
				b.addConquista(this);
		
			}else{	
				
			Usuario l = new Usuario(user);
			l.addConquista(this);
			((MemoryAchievementStorage) memo).addUser(l);
			}
		
			
			
	}
		

	@Override
	public String toString() {
		return "Badge [name=" + name + "]";
	}

	
}

	


