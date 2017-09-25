
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Alex-vostro	
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/exibirLivroServlet"})
public class exibirLivroServlet extends HttpServlet {

    @SuppressWarnings("static-access")
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
                String titulo = request.getParameter("titulo");
   
    
                LivroDAO tdao = new LivroDAO();
               int id = tdao.getId(titulo);
        try {
         
     
            Livro l = new Livro();
            l = tdao.getLivro(id);
            request.setAttribute("id", l.getId());
            request.setAttribute("titulo", l.getTitulo());
            request.setAttribute("categoria", l.getCategoria());
            request.setAttribute("quantidadePagina", l.getQuantidadePagina());
            System.out.println("exibirLivroServlet");
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("exibirLivro.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());

        }

    }


   

}
