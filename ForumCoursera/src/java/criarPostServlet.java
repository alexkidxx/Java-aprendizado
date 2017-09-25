
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex-vostro
 */
@WebServlet(urlPatterns = {"/criarPostServlet"})
public class criarPostServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String titulo = request.getParameter("titulo");
        String conteudo = request.getParameter("conteudo");
        String login = (String) request.getSession().getAttribute("login");

        CriadorDePostDAO criaPost = new CriadorDePostDAO();
        try {
            criaPost.criarPost(titulo, conteudo, login);
            request.setAttribute("login", login);
            request.setAttribute("erro", "Post criado com sucesso");
            request.getRequestDispatcher("TopicosServlet").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

}
