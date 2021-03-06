package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

@WebServlet(name = "ValidarServlet", urlPatterns = {"/ValidarServlet"})
public class ValidarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nombre;
        String pass;

        String name;
        String lastNa;
        String secNa;
        String fecha;
        String correo;

        nombre = request.getParameter("txtNombre");
        pass = request.getParameter("txtPass");

        name = request.getParameter("txt-name");
        lastNa = request.getParameter("first-name");
        secNa = request.getParameter("second-name");
        fecha = request.getParameter("bday");
        correo = request.getParameter("correito");

        if (nombre.equalsIgnoreCase("Uziel")) {
            if (pass.equalsIgnoreCase("123")) {

                Usuario usu = new Usuario(nombre, pass, name,lastNa, secNa, fecha, correo);
                HttpSession session = request.getSession();
                session.setAttribute("usuario", usu);

                request.getRequestDispatcher("MenuServlet").forward(request, response);
            } else {

                request.getRequestDispatcher("ErrorServlet").forward(request, response);
            }
        } else {

            request.getRequestDispatcher("ErrorServlet").forward(request, response);
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
