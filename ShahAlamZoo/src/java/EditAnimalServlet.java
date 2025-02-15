/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class EditAnimalServlet extends HttpServlet {

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
        
        String date = request.getParameter("date");
        String id = request.getParameter("animalid");
        String species = request.getParameter("species");
        String animalName = request.getParameter("animalname");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String habitat = request.getParameter("habitat");
        String location = request.getParameter("location");
        
        try{
          Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AnimalDB", "app", "app");
          String updateQuery = "UPDATE ANIMAL SET date = ?, species = ?, animalname = ?, age = ?, gender = ?, habitat = ?, location = ? WHERE animalid = ?";
          PreparedStatement stmt = conn.prepareStatement(updateQuery);
          stmt.setString(1, date);
          stmt.setString(2, species);
          stmt.setString(3, animalName);
          stmt.setInt(4, Integer.parseInt(age));
          stmt.setString(5, gender);
          stmt.setString(6, habitat);
          stmt.setString(7, location);
          stmt.setString(8, id);
          
          stmt.executeUpdate();
          stmt.close();
          conn.close();
          
          response.sendRedirect("animalmanagement.jsp"); // Redirect to the list page after adding
        }catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Error updating the animal record: " + e.getMessage());
        }
        
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
