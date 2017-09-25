
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex-vostro
 */
@WebServlet(urlPatterns = {"/TopicosServlet"})
public class TopicosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Topico> lista = new ArrayList();

        try {

            lista = (ArrayList<Topico>) TopicoDAO.todosTopicos();
            request.setAttribute("listaDeTopicos", lista);

            request.getRequestDispatcher("topicos.jsp").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());

        }
    }

}
