
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TopicoDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public static Topico getTopico(String titulo) {

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "select topico.titulo, topico.conteudo,topico.id_topico,usuario.nome from topico inner join usuario on topico.login = usuario.login where topico.titulo = ?";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setString(1, titulo);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Topico t = new Topico();
                t.setLogin(rs.getString("nome"));
                t.setTitulo(rs.getString("titulo"));
                t.setConteudo(rs.getString("conteudo"));
                t.setId_topico(rs.getInt("id_topico"));
                return t;

            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível encontrar o tópico", e);

        }

        return null;

    }

    public static List<Topico> todosTopicos() {

        ArrayList<Topico> todos = new ArrayList();

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "select topico.id_topico,topico.titulo,usuario.nome from topico inner join usuario on topico.login = usuario.login ";

            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Topico t = new Topico();
                t.setId_topico(rs.getInt("id_topico"));
                t.setLogin(rs.getString("nome"));
                t.setTitulo(rs.getString("titulo"));

                todos.add(t);

            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível executar a lista de tópicos", e);

        }

        return todos;

    }

    Topico getTopico(int id_topico) {
        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "select topico.titulo, topico.conteudo,topico.id_topico,usuario.nome from topico inner join usuario on topico.login = usuario.login where topico.id_topico = ?";
            PreparedStatement stm = c.prepareStatement(sql);
            stm.setInt(1, id_topico);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Topico t = new Topico();
                t.setLogin(rs.getString("nome"));
                t.setTitulo(rs.getString("titulo"));
                t.setConteudo(rs.getString("conteudo"));
                t.setId_topico(rs.getInt("id_topico"));
                return t;

                
            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível encontrar o tópico", e);

        }

        return null;

    }

}
