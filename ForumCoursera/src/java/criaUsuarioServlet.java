
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
@WebServlet(urlPatterns = {"/criaUsuarioServlet"})
public class criaUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        CriadorDeUsuarioDAO criaUser = new CriadorDeUsuarioDAO();
        try {
            criaUser.criarUsuario(nome, login, email, senha);

            request.setAttribute("erro", "Usuario criado com sucesso");
            request.getRequestDispatcher("login.jsp").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("erro", ex.getMessage());
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

}
