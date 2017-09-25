
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
public class exibirPerfilServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
                String perfil = request.getParameter("login");
   
    
               AutenticadorDAO udao = new AutenticadorDAO();
               
        try {
          
            Usuario u = new Usuario();
            u = udao.getUsuario(perfil);
            
            request.setAttribute("nome", u.getNome());
            request.setAttribute("login", u.getLogin());
            request.setAttribute("ponto", u.getPonto());
            request.setAttribute("email", u.getEmail());
            
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("exibirPerfil.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());

        }

    }


   

}
