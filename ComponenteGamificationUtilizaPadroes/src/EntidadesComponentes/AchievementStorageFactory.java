package EntidadesComponentes;

import interfaces.AchievementStorage;

public class AchievementStorageFactory {
	
		
	private static AchievementStorage as = null;
	
	

	private AchievementStorageFactory(AchievementStorage a) {
		
		setAchievementStorage(a);
		
		
	}

	public static AchievementStorage getAchievementStorage(AchievementStorage a){
		if(as == null){
		as = a;
			return  a;
		
		}
		return as;
		
	
		
	}
	
	void setAchievementStorage(AchievementStorage a){
		
		this.as = a;
	}

}
