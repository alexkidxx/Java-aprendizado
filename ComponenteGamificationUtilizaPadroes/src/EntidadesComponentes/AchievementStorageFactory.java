package EntidadesComponentes;

import interfaces.AchievementStorage;

public class AchievementStorageFactory {
	
		
	private static AchievementStorage as = null;
	
	

	private AchievementStorageFactory(AchievementStorage a) {
		
		setAchievementStorage(a);
		}

	public static AchievementStorage getAchievementStorage(){
	if(as!=null){
		return as;
	}else{
		
		setAchievementStorage(new MemoryAchievementStorage());
	}
	return as;
	
		
	
		
	}
	
	static void setAchievementStorage(AchievementStorage a){
		if(as == null)
			as = a;
		}
		
		
		
	}


