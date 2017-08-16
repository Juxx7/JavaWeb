/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.*;
import java.util.List;
import javax.ejb.EJB;
import modelos.ProductsFacadeLocal;
/**
 *
 * @author juxx
 */
public class productV extends HttpServlet {
    @EJB
    private ProductsFacadeLocal productsFacade;

    
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet productV</title>");  
            out.println("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/css/materialize.min.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Servlet products at </h1>");
            
            List <Products> pro = productsFacade.findAll();
            out.println("<table class=\"striped\">");
            for (int i = 0; i < pro.size(); i++) {
                out.println("<tr>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductCode());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductName());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductLine());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductScale());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductVendor());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getProductDescription());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getQuantityInStock());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getBuyPrice());
                out.println("</td>");
                
                out.println("<td>");
                out.println(pro.get(i).getMsrp());
                out.println("</td>");
                
                
                out.println("<td>");
                out.println("<a class=\"waves-effect waves-light btn\"><i class=\"material-icons left\">Eliminar</i>Eliminar</a>");
                out.println("<a class=\"waves-effect waves-light btn\" type='submit'><i class=\"material-icons left\">Modificar</i></a>");
                out.println("</td>");
                
                out.println("<tr>");
            }
            out.println("</table>");
            
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.1/js/materialize.min.js\"></script>\n" +
"  ");
            out.println("</body>");
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
