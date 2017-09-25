
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    static {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

    public static Livro getLivro(int id) {

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/jali", "postgres", "admin")) {
        	String sql = "select id_livro, titulo, categoria, quantidade_paginas from livro where id_livro = ?";
            PreparedStatement stm = c.prepareStatement(sql);
          
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Livro l = new Livro();
                
                l.setId(rs.getInt("id_livro"));
                l.setTitulo(rs.getString("titulo"));
                l.setCategoria(rs.getString("categoria"));
                l.setQuantidadePagina(rs.getInt("quantidade_paginas"));
              System.out.println(l);
                return l;

            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível encontrar o livro", e);

        }

        return null;
        

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Livro> todosLivros() {

        ArrayList<Livro> todos = new ArrayList();

        try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/jali", "postgres", "admin")) {

            String sql = "select livro.titulo,livro.categoria,livro.quantidade_paginas from livro"; ////colocar a imagem aqui

            PreparedStatement stm = c.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                Livro l = new Livro();
                
                l.setTitulo(rs.getString("titulo"));
                l.setCategoria(rs.getString("categoria"));
                l.setQuantidadePagina(rs.getInt("quantidade_paginas"));
                todos.add(l);

            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível executar a lista de livros", e);

        }

        return todos;

    }

	public int getId(String titulo) {
		 try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/jali", "postgres", "admin")) {
	        	String sql = "select id_livro from livro where titulo = ?";
	            PreparedStatement stm = c.prepareStatement(sql);
	          
	            stm.setString(1, titulo);
	            ResultSet rs = stm.executeQuery();
	            while (rs.next()) {
	               int n =(rs.getInt(1));
	            	
	                return n;

	            }
	        } catch (SQLException e) {
	            throw new RuntimeException("Não foi possível retornar o id", e);

	        }
		return 0;

	      
	        

	}

   
}
