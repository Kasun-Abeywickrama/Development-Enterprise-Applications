/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "MySevlet", urlPatterns = {"/MySevlet"})
public class MySevlet extends HttpServlet {

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
            out.println("<title>Servlet MySevlet</title>");            
            out.println("</head>");
            out.println("<body>");
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
        String text = request.getParameter("txt");
        
        
        PrintWriter out = response.getWriter();
        out.println("<table border=0>");
        out.println("<tr>");
        out.println("<td>Inputted Text</td>");
        out.println("<td>"+text+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Request Method</td>");
        out.println("<td>"+request.getMethod()+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Request URI</td>");
        out.println("<td>"+request.getRequestURI()  +"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Request Protocol</td>");
        out.println("<td>"+request.getProtocol()+"</td>");
        out.println("</tr>");
        
//        out.println("<br>");
//        out.println("Header Name : "+request.getHeaderNames());
        
        Enumeration headerNames = request.getHeaderNames();
        
        while(headerNames.hasMoreElements()){
            String headerName = (String)headerNames.nextElement();
            
        out.println("<tr>");
        out.println("<td>"+headerName+"</td>");
        out.println("<td>"+request.getHeader(headerName)+"</td>");
        out.println("</tr>");
        }
        out.println("</table>");
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
