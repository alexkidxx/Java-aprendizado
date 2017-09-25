
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex-vostro
 */
public class AutenticadorDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AutenticadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static ArrayList<Usuario> todosUsuarios() {

        ArrayList<Usuario> todosUsuarios = new ArrayList();

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

          
           String sql = "Select nome,login,pontos from usuario order by pontos desc";

            PreparedStatement stm = c.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
              Usuario u = new Usuario();
              String tupla = rs.getString(1)+rs.getString(2);
              
              u.setNome(rs.getString("nome"));
              u.setLogin(rs.getString("login"));
              u.setPonto(rs.getInt("pontos"));
              
                todosUsuarios.add(u);

            }
        } catch (SQLException e) {


            throw new RuntimeException("Não foi possível executar a lista de usuarios", e);

        }

        return todosUsuarios;

    }

    public String autenticar(String login, String senha) throws Exception {

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "SELECT nome FROM usuario WHERE login = ? and senha = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("nome");
            } else {
                throw new Exception("Não foi possível encontrar o usuário");
            }
        }
    }
}
