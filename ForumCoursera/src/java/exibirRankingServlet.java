
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alex-vostro
 */
@WebServlet(urlPatterns = {"/exibirRankingServlet"})
public class exibirRankingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("entrei no doGet do exibirRankingServlet");
        
        ArrayList<Usuario> listaUsers = new ArrayList();
System.out.println("criei arraylist que recebe os users");
        try {
System.out.println("entrei no try");
            listaUsers = AutenticadorDAO.todosUsuarios();
            
            System.out.println("listaUsers");
            System.out.println(listaUsers);
            request.setAttribute("listaDeUsuarios", listaUsers);
            request.getRequestDispatcher("rankingUsuarios.jsp").forward(request, response);

        } catch (Exception ex) {
            System.out.println("entrei no cat");
            request.setAttribute("erro", ex.getMessage());

        }

    }

}
