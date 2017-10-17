package interfaces;

import java.util.List;

import EntidadesComponentes.Achievement;
import EntidadesComponentes.Usuario;

public interface AchievementStorage {
	
	void addAchievement(String user,Achievement a);
	

	List<Achievement>getAchievements(String user);
	
	Achievement getAchievement(String user, String achievementName);
	boolean possuiEssaConquista(String name, String user);
	
	Usuario getUser(String user);
	

}
