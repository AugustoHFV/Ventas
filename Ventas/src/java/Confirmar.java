
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
@WebServlet("/Confirmar")
public class Confirmar extends HttpServlet {
    private static final long serialVersionUID = 1L;
    Auxiliar Aux=new Auxiliar();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmar() {
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
         PrintWriter out = response.getWriter();

         out.println("<html>");
         out.println("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"></head>");         
         out.println("<body style=color:lightgreen>");

         Aux.setProducto(request.getParameter("Nombre"));
         Aux.setPrecio(Integer.parseInt(request.getParameter("Precio")));
         Aux.setDisponibilidad(Integer.parseInt(request.getParameter("Dispo")));
         out.println("<h1>Producto guardado</h1>");
         out.println("<p>Nombre del producto: "+Aux.getProducto()+"</p>");
         out.println("<p>Precio: $"+Aux.getPrecio()+"</p>");
         out.println("<p>Disponibles: "+Aux.getDisponibilidad()+"</p>");
         out.println("<a href=index.html>volver</a>");
         
         out.println("</body>");
         out.println("</html>");           
    }

}