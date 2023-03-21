
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecuperacionUsuario
 */
@WebServlet("/Vender")
public class Vender extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Auxiliar Aux=new Auxiliar();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Vender() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
         response.setContentType("text/html;charset=UTF-8");
         String aux="text/css";
         String aux1="stylesheet";
         String aux2="style.css";
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Comprar</title>");   
            out.println("<link rel="+aux1+" type="+aux+" href=style.css>");
            out.println("</head>");
            out.println("<body style=color:red>");
            out.println("<form method=\"post\" action=\"Confirmar\">");
            out.println("<p>Nombre del producto:<input name='Nombre' type=text required='required'></p>");
            out.println("<p>Precio:<input name='Precio' type=number min='0' required='required'></p>");
            out.println("<p>Disponibles:<input name='Dispo' type=number min='0' required='required'></p>");
            out.println("<input type=\"submit\" value=\"confirmar\">");   
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            
        }
        Aux.setDisponibilidad(Integer.parseInt(request.getParameter("disponiT")));
    }           
}

