
import java.io.IOException;

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
@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/exibirRankingServlet"})
public class exibirRankingServlet extends HttpServlet {
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8");
        ArrayList<Usuario> listaUsers = new ArrayList();

        try {

            listaUsers = AutenticadorDAO.todosUsuarios();
            request.setAttribute("listaDeUsuarios", listaUsers);
            request.getRequestDispatcher("rankingUsuarios.jsp").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());

        }

    }

}

