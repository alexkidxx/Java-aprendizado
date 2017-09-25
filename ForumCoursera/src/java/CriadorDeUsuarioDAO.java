
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex-vostro
 */
class CriadorDeUsuarioDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public void criarUsuario(String nome, String login, String email, String senha) {

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "INSERT INTO public.usuario(login, email, nome, senha, pontos) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(sql);

            stm.setString(1, login);
            stm.setString(2, email);
            stm.setString(3, nome);
            stm.setString(4, senha);
            stm.setInt(5, 0);

            stm.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível cadastrar o usuário", e);

        }
    }
}
