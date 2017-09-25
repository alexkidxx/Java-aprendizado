
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class CriadorDeComentarioDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public void criarComentario(String comentario, int id_topico, String login) {
        pontua(login);
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "INSERT INTO public.comentario(comentario, id_topico, login) VALUES (?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(sql);

            stm.setString(1, comentario);
            stm.setInt(2, id_topico);
            stm.setString(3, login);

            stm.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível inserir comentário", e);

        }
    }

    private void pontua(String login) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {
            String sql = "UPDATE public.usuario SET pontos = pontos + ? WHERE login = ?";

            PreparedStatement stm = c.prepareStatement(sql);
            int ponto = 3;
            stm.setInt(1, ponto);
            stm.setString(2, login);
            stm.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível inserir pontuação", e);

        }

    }

}
