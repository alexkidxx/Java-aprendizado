package EntidadesComponentes;

import interfaces.ForumService;

public class Forum implements ForumService {

	@Override
	public void addTopic(String user, String topic) {
		System.out.println("Tópico:" + topic + "adicionado para o usuario "+user);

	}

	@Override
	public void addComment(String user, String topic, String coment) {
		System.out.println("Comentario: "+coment+" adicionado para o tópico: "+topic+" do usuario: "+user);

	}

	@Override
	public void likeTopic(String user, String topic, String topicUser) {
		System.out.println("Like adicionado para o tópico: "+topic+" do usuario"+topicUser+" likado pelo "+user);

	}

	@Override
	public void likeComment(String user, String topic, String comment, String commentUser) {
	System.out.println("Comentario"+comment+" de "+commentUser+" do topico: "+topic+" do usuario"+user+ "foi curtido");
	}

}
