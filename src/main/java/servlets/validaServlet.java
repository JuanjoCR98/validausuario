/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juanjo Cortés
 */
public class validaServlet extends HttpServlet {
    
    private String usuarioCorrecto,passCorrecto;
    
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext context = config.getServletContext();

        usuarioCorrecto = config.getInitParameter("usuarioCorrecto");
        passCorrecto = config.getInitParameter("passCorrecto");

        context.setAttribute("usuarioCorrecto", usuarioCorrecto);
        context.setAttribute("passCorrecto", passCorrecto);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String pUsuario = request.getParameter("usuario");
        String pPassword = request.getParameter("password");

        if (usuarioCorrecto.equals(pUsuario) && passCorrecto.equals(pPassword)) {
            out.println("<h1>");
            out.println("Datos correctos");
            out.println("<br>Usuario:" + pUsuario);
            out.println("<br>Password:" + pPassword);
            out.println("</h1>");
        } else {
            //Respondemos al navegador con un codigo de estado de No Autorizado
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }

        //Listado de codigos de error
        //http://docstore.mik.ua/orelly/java-ent/servlet/appc_01.htm
        out.close();

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
