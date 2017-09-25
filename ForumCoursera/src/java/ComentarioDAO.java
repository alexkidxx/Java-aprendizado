
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alex-vostro
 */
class ComentarioDAO {

    public ArrayList<Comentario> getTodosComentarios(int id_topico) {

        ArrayList<Comentario> todosOsComentarios = new ArrayList();

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/usuarios", "postgres", "admin")) {

            String sql = "select  usuario.nome,comentario.comentario, comentario.id_topico from comentario inner join usuario on usuario.login =  comentario.login where comentario.id_topico = ?";

            PreparedStatement stm = c.prepareStatement(sql);
            stm.setInt(1, id_topico);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Comentario coment = new Comentario();
                coment.setLogin(rs.getString("nome"));
                coment.setComentario(rs.getString("comentario"));

                todosOsComentarios.add(coment);

            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível executar a lista de tópicos", e);

        }

        return todosOsComentarios;

    }

}
