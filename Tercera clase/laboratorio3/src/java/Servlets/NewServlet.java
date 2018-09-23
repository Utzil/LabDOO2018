/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author uziel
 */
public class NewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        
        String nombre = request.getParameter("apodo");
        String apellido1 = request.getParameter("apellidoPri");
        String apellido2 = request.getParameter("apellidoSeg");
        String cumple = request.getParameter("bday");
        String email = request.getParameter("correito");
        String password = request.getParameter("contra");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet MiServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultados:</h1><p><br>" + nombre + "<br>" + apellido1 + "<br>" + apellido2 + "<br>" +  cumple + "<br>" +  email + "<br>" +  password + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form\" action= \"NewServlet.java\" method=\"Post\">");
            out.println("<h1>Captura de Datos</h1>");
            out.println("<br><label>Nombre: </label><input type=\"text\" name=\"apodo\" /><br/>");
            out.println("<br><label>Primer Apellido: </label><input type=\"text\" name=\"apellidoPri\" /><br/>");
            out.println("<br><label>Segundo Apellido: </label><input type=\"text\" name=\"apellidoSeg\" /><br/>");
            out.println("<br><label>Fecha de nacimiento: </label><input type=\"date\" name=\"bday\" /><br/>");
            out.println("<br><label>Correo electrónico: </label><input type=\"email\" name=\"correito\" /><br/>");
            out.println("<br><label>Password: </label> <input type=\"password\" name=\"contra\" /><br/>");
            out.println("<br><button type=\"submit\">Enviar</button><br/>");
            out.println("</form>");
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
    /*protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }*/

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }/*

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
