/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Uziel
 */
public class Controlador extends HttpServlet {

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
            String variable = request.getParameter("varcontrol");
            if ("1".equals(variable)){
                String name = request.getParameter("name");
                String ap1 = request.getParameter("lastname1");
                String ap2 = request.getParameter("lastname2");
                String cumple = request.getParameter("brtdy");
                String correo = request.getParameter("mail");
                String pass = request.getParameter("pass");
                Registro r = new Registro();
                r.setName(name);
                r.setLastname1(ap1);
                r.setLastname2(ap2);
                r.setBrtdy(cumple);
                r.setMail(correo);
                r.setPass(pass);  
                HttpSession miSession = request.getSession();
                miSession.setAttribute("userid", correo);
                miSession.setAttribute("passid", pass);
                miSession.setAttribute("name", name);
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Controlador</title>"); 
                out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" />");                 
                out.println("</head>");
                out.println("<body>");
                out.println("<fieldset><legend>Su Informacion:</legend><h1>Su nombre es: " + r.getName() + " " + r.getLastname1() + r.getLastname2()+ "</h1>");
                out.println("<h1>Su fecha de nacimiento es: " + r.getBrtdy()+ "</h1>");
                out.println("<h1>Su correo: " + r.getMail()+ "</h1>");
                out.println("<h1>Su password: " + r.getPass() + "</h1>");
                out.println("</fieldset><a href='Login.jsp'>Iniciar Session</a></body>");
                out.println("</html>");
            
            }else{
                HttpSession miSession = request.getSession();
                String corre = request.getParameter("correo");
                String contra = request.getParameter("contra");
                String vcorreo = (String)miSession.getAttribute("userid");
                String vpass = (String)miSession.getAttribute("passid");
                Validador v = new Validador();
                v.setCorreo(corre);
                v.setVcorreo(vcorreo);
                v.setPass(contra);
                v.setVpass(vpass);
                v.validar();
                    if (v.getCheck()){
                        Cookie micookie = new Cookie("Login","Sucess");
                        micookie.setMaxAge(60*60*24);
                        out.println("<h1>Bienvenido: " + miSession.getAttribute("name") + "</h1>");
                        out.println("<h2>Cookie: SI </h2>" + micookie.getName() + ":" + micookie.getValue());
                        
                        out.println("<br><a href='index.html'>Cerrar Session</a>");
                        micookie.setMaxAge(0);
                    } else { 
                        out.println("Correo o Contraseña Incorrecto" + " <br> <a href='Login.jsp'>Intentalo de nuevo</a>"); 
                    }
            }
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
