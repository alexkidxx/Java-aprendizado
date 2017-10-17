package EntidadesComponentes;

import interfaces.AchievementObserver;

public class InventorObserver implements AchievementObserver {


	
	
	@Override
	public void achievementUpdate(String user, Achievement a) {
		if(a instanceof Points && a.getNome().equals("CREATION")){
		verificaPontuaçãoInventor(user);	
			
		}
		
	}
	
	
	public void verificaPontuaçãoInventor(String user){
		
		MemoryAchievementStorage memo = (MemoryAchievementStorage) AchievementStorageFactory.getAchievementStorage();
		int pontosCreation = ((Points) memo.getAchievement(user, "CREATION")).getValor();
		if(pontosCreation >= 100)
			memo.addAchievement(user, new Badge("INVENTOR"));
	}

}
