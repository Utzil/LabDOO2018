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

@WebServlet(name = "MenuServlet", urlPatterns = {"/MenuServlet"})
public class MenuServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        Usuario usu = (Usuario) session.getAttribute("usuario");

        if (usu == null) {
            request.getRequestDispatcher("ErrorServlet").forward(request, response);
        } else {
            try {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Menú</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Bienvenido: " + usu.getNombre() + "</h1>");
                out.println("<h3>Nombre: " + usu.getName() + "</h3>");
                out.println("<h3>Primer apellido: " + usu.getLastNa() + "</h3>");
                out.println("<h3>Segundo Apellido: " + usu.getSecNa() + "</h3>");
                out.println("<h3>Cumpleaños: " + usu.getFecha() + "</h1>");
                out.println("<h3>Correo: " + usu.getCorreo() + "</h3>");
                out.println("<a href='CerrarSesionServlet'>Cerrar sesión</a>");
                out.println("<form action =\"porfile.jsp\"><br>");
                out.println("<input type=\"submit\" value=\"Ir a la Tienda\" classn\" +\"=\"boton\">");               
                out.println("<br/></form>");                
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
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



