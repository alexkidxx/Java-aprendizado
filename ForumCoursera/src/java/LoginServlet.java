
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        AutenticadorDAO aut = new AutenticadorDAO();

        try {
            String nomeUsuario = aut.autenticar(login, senha);

            request.setAttribute("nomeBoasVindas", nomeUsuario);
            request.getSession().setAttribute("login", login);

            String proxUrl;

            proxUrl = "/TopicosServlet";

            RequestDispatcher rd = request.getRequestDispatcher(proxUrl);

            rd.forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());

            request.getRequestDispatcher("login.jsp").forward(request, response);

        }

    }

}
