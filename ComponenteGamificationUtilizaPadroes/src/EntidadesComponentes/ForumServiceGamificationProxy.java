package EntidadesComponentes;

import interfaces.AchievementStorage;
import interfaces.ForumService;

public class ForumServiceGamificationProxy implements ForumService {

	private ForumService forum;
	
	AchievementStorage memo;

	public ForumServiceGamificationProxy(ForumService forum) {

		this.forum = forum;
		this.memo =  AchievementStorageFactory.getAchievementStorage();
	}

	public void addTopic(String user, String topic) {
		forum.addTopic(user, topic);
		memo.addAchievement(user, new Points("CREATION",5));
		memo.addAchievement(user, new Badge("I CAN TALK"));
	
	}

	public void addComment(String user, String topic, String topicUser) {
		forum.addComment(user, topic, topicUser);
		memo.addAchievement(user, new Points("PARTICIPATION",3));
		memo.addAchievement(user, new Badge("LET ME ADD"));
		
		}

	public void likeTopic(String user, String topic, String topicUser) {
		forum.likeTopic(user, topic, topicUser);
		memo.addAchievement(user, new Points("CREATION",1));
	
	}

	public void likeComment(String user, String topic, String comment, String commentUser) {
		forum.likeComment(user, topic, comment, commentUser);
		memo.addAchievement(user, new Points("PARTICIPATION",1));
		
	}
	
	
	
}
