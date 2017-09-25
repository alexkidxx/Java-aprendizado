
import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServelt extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        AutenticadorDAO aut = new AutenticadorDAO();

        try {
            String nomeUsuario = aut.autenticar(login, senha);
            System.out.printf("autenticou no banco ");
            
            
            request.setAttribute("nomeBoasVindas", nomeUsuario);
            System.out.println("colocou o nome logado na request");
            request.getSession().setAttribute("login", login);
            System.out.println("colocou o nome logado como contexto de sessão");

            String proxUrl;

            proxUrl = "/HomeServlet";
            System.out.println("definiu o a página que vai receber as requests");
            RequestDispatcher rd = request.getRequestDispatcher(proxUrl);
            System.out.println("dispachou para a página");
            rd.forward(request, response);
           
          
            
        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());
System.out.println("Deu pau na autenticação");
            request.getRequestDispatcher("login.jsp").forward(request, response);

        }

    }

}
