
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/criarComentarioServlet"})
public class criarComentarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String comentario = request.getParameter("comentario");
        int id_topico = Integer.parseInt(request.getParameter("id_topico"));
        String login = (String) request.getSession().getAttribute("login");
        CriadorDeComentarioDAO criaComentario = new CriadorDeComentarioDAO();

        try {

            criaComentario.criarComentario(comentario, id_topico, login);
            request.getSession().setAttribute("login", login);
            request.setAttribute("erro", "Comentario criado com sucesso");
            request.setAttribute("id_topico", id_topico);
            request.getRequestDispatcher("exibirTopicoServlet").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());
            request.getRequestDispatcher("TopicosServlet").forward(request, response);
        }

    }

}
