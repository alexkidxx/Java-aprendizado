
import java.io.IOException;
import java.util.ArrayList;

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
@WebServlet(urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    @SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	  String nomeBoasVindas = request.getParameter("nomeBoasVindas");
    	  String login = request.getParameter("login");
    	
    	
        ArrayList<Livro> lista = new ArrayList();
        	


    
        	
        	try {
        		
                
    	
    	lista = (ArrayList<Livro>) LivroDAO.todosLivros();
            System.out.println(lista);
            System.out.println("a lista de livros é carragada na array");
           
            request.setAttribute("listaDeLivros", lista);
            request.setAttribute("nomeBoasVindas", nomeBoasVindas);
            request.setAttribute("login", login);
            System.out.println("lista de livros colocada no atributo");
        
           
            
            String proxUrl;

            proxUrl = "/home.jsp";
            response.setContentType("text/html;charset=UTF-8");
            RequestDispatcher rd = request.getRequestDispatcher(proxUrl);
           
            rd.forward(request, response);
            
            
            
            
         //   request.getRequestDispatcher("home.jsp").forward(request, response);
          

        } catch (Exception ex) {
        	System.out.println("deu pau na última linha do homeservelet");
            request.setAttribute("erro", ex.getMessage());

        }
    }

}

