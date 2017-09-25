
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class CriadorDePostDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public void criarPost(String titulo, String conteudo, String login) {
        pontua(login);
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "INSERT INTO public.topico(titulo, conteudo, login) VALUES (?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(sql);

            stm.setString(1, titulo);
            stm.setString(2, conteudo);
            stm.setString(3, login);

            stm.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível criar o post", e);

        }
    }

    private void pontua(String login) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {
            String sql = "UPDATE public.usuario SET pontos = pontos + ? WHERE login = ?";

            PreparedStatement stm = c.prepareStatement(sql);
            int ponto = 10;
            stm.setInt(1, ponto);
            stm.setString(2, login);
            stm.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível inserir pontuação", e);

        }

    }
}
