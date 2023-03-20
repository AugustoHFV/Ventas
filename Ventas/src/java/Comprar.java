/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author werna
 */
@WebServlet(urlPatterns = {"/Comprar"})
public class Comprar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Auxiliar Aux=new Auxiliar();
        String aux="text/css";
        String aux1="stylesheet";
        String aux2="style.css";
        String produ=Aux.getProducto();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Comprar</title>");   
            out.println("<title>Compras</title>");    
            out.println("<link rel="+aux1+" type="+aux+" href=style.css>");
            out.println("</head>");
            out.println("<script>");
            out.println("function algoritmo(){");
            out.println("let disponi, dinero, compras, cantidad;");
            out.println("disponi ="+Aux.getDisponibilidad()+";");
            out.println("cantidad=parseFloat (document.formulario.cantidad.value);");
            out.println("document.formulario.compras.value = compras;});");
            out.println("</script>");
            out.println("<form name=formulario>");
            out.println("<body style=color:red>");
            out.println("<h1>Producto: "+produ+"</h1>");
            out.println("<h1>Precio: $"+Aux.getPrecio()+"</h1>");
            out.println("<h1>Disponible(s): "+Aux.getDisponibilidad()+"</h1>");
            out.println("Cantidad a comprar:<input name='cantidad' type=number min='0' required='required'>");
            out.println("<button type=button action=algoritmo>Comprar</button>");
            out.println("<h4 align=left>Comprado(s): "+Aux.getComprado()+"</h1>");
            out.println("</body>");
            out.println("</form>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
