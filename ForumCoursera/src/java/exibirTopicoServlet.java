
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/exibirTopicoServlet"})
public class exibirTopicoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id_topico = Integer.parseInt(request.getParameter("id_topico"));

        TopicoDAO tdao = new TopicoDAO();

        try {
            ArrayList<Comentario> listaComents = new ArrayList();
            Topico t = new Topico();
            t = tdao.getTopico(id_topico);

            ComentarioDAO coments = new ComentarioDAO();
            listaComents = coments.getTodosComentarios(id_topico);

            request.setAttribute("id_topico", t.getId_topico());
            request.setAttribute("dono", t.getLogin());
            request.setAttribute("titulo", t.getTitulo());
            request.setAttribute("conteudo", t.getConteudo());
            request.setAttribute("comentarios", listaComents);

            request.getRequestDispatcher("exibirTopico.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String parametroParcial = request.getParameter("id_topico");
        int id_topico = Integer.parseInt(getIdDoParametro(parametroParcial));

        TopicoDAO tdao = new TopicoDAO();

        try {
            ArrayList<Comentario> listaComents = new ArrayList();
            Topico t = new Topico();
            t = tdao.getTopico(id_topico);
            ComentarioDAO coments = new ComentarioDAO();
            listaComents = coments.getTodosComentarios(id_topico);

            request.setAttribute("id_topico", t.getId_topico());
            request.setAttribute("dono", t.getLogin());
            request.setAttribute("titulo", t.getTitulo());
            request.setAttribute("conteudo", t.getConteudo());
            request.setAttribute("comentarios", listaComents);

            request.getRequestDispatcher("exibirTopico.jsp").forward(request, response);

        } catch (Exception ex) {

            request.setAttribute("erro", ex.getMessage());

        }
    }

    public String getTituloDoParametro(String parametroParcial) {
        String s = null;
        for (int i = 0; i < parametroParcial.length(); i++) {
            if (parametroParcial.charAt(i) == '@') {
                s = parametroParcial.substring(i + 1, parametroParcial.length());
                break;
            }
        }
        return s;

    }

    public String getIdDoParametro(String parametroParcial) {
        String id = null;
        for (int i = 0; i < parametroParcial.length(); i++) {
            if (parametroParcial.charAt(i) == '*') {
                id = parametroParcial.substring(0, i);
                break;
            }
        }
        return id;

    }

}
