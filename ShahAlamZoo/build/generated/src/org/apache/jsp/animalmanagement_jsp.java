package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class animalmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Animal Management - Shah Alam Zoo</title>\n");
      out.write("   \n");
      out.write("<style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #8A9A5B;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #454B1B;\n");
      out.write("            color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("            font-size: 18px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("            text-align: right;\n");
      out.write("            margin-top: -40px;\n");
      out.write("            margin-right: 20px;\n");
      out.write("        }\n");
      out.write("        nav a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            background-color: #8A9A5B;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        nav a:hover {\n");
      out.write("            background-color: #1f3e1f;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 50%;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        .containerr {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 30px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("        }\n");
      out.write("        h2, h3 {\n");
      out.write("            font-size: 23px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #3a753c;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            gap: 10px;\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input, select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #808000;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 17px;\n");
      out.write("        }\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #2c5a2b;\n");
      out.write("        }\n");
      out.write("        .buton {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #d9534f;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .buton:hover {\n");
      out.write("            background-color: #c9302c;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        table th, table td {\n");
      out.write("            border: 3px solid #ddd;\n");
      out.write("            padding: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        table th {\n");
      out.write("            background-color: #355E3B;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        .action-buttons {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            gap: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1>Animal Management</h1>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"dashboard.jsp\">Dashboard</a>\n");
      out.write("            <a href=\"logout.jsp\">Logout</a>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Add Animal</h2>\n");
      out.write("        <form action=\"AddAnimalServlet\" method=\"post\">\n");
      out.write("            <label for=\"date\">Entry Date:</label>\n");
      out.write("            <input type=\"date\" name=\"date\" required>\n");
      out.write("\n");
      out.write("            <label for=\"animalid\">Animal ID:</label>\n");
      out.write("            <input type=\"text\" name=\"animalid\" required>\n");
      out.write("\n");
      out.write("            <label for=\"species\">Species:</label>\n");
      out.write("            <select name=\"species\">\n");
      out.write("                <option value=\"Mammals\">Mammals</option>\n");
      out.write("                <option value=\"Birds\">Birds</option>\n");
      out.write("                <option value=\"Reptiles\">Reptiles</option>\n");
      out.write("                <option value=\"Amphibians\">Amphibians</option>\n");
      out.write("                <option value=\"Fish and Marine Animals\">Fish and Marine Animals</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <label for=\"animalname\">Animal Name:</label>\n");
      out.write("            <select name=\"animalname\">\n");
      out.write("                <option value=\"Panda\">Panda</option>\n");
      out.write("                <option value=\"Peacock\">Peacock</option>\n");
      out.write("                <option value=\"Crocodile\">Crocodile</option>\n");
      out.write("                <option value=\"Axolotl\">Axolotl</option>\n");
      out.write("                <option value=\"Turtle\">Turtle</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"age\">Age:</label>\n");
      out.write("            <input type=\"number\" name=\"age\" required>\n");
      out.write("\n");
      out.write("            <label for=\"gender\">Gender:</label>\n");
      out.write("            <select name=\"gender\">\n");
      out.write("                <option value=\"Male\">Male</option>\n");
      out.write("                <option value=\"Female\">Female</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"habitat\">Habitat:</label>\n");
      out.write("            <input type=\"text\" name=\"habitat\" required>\n");
      out.write("\n");
      out.write("            <label for=\"location\">Location:</label>\n");
      out.write("            <select name=\"location\">\n");
      out.write("                <option value=\"Location 1\">Location 1</option>\n");
      out.write("                <option value=\"Location 2\">Location 2</option>\n");
      out.write("                <option value=\"Location 3\">Location 3</option>\n");
      out.write("                <option value=\"Location 4\">Location 4</option>\n");
      out.write("                <option value=\"Location 5\">Location 5</option>\n");
      out.write("            </select><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"btn\">Add Animal</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"containerr\">\n");
      out.write("        <h3>Animal Records</h3>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Date</th>\n");
      out.write("            <th>Animal ID</th>\n");
      out.write("            <th>Species</th>\n");
      out.write("            <th>Animal Name</th>\n");
      out.write("            <th>Age</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>Habitat</th>\n");
      out.write("            <th>Location</th>\n");
      out.write("            <th>Actions</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AnimalDB", "app", "app");
                String query = "SELECT * FROM ANIMAL";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();
                
                while (rs.next()) {
        
      out.write("\n");
      out.write("    <tr>\n");
      out.write("    <td>");
      out.print( rs.getDate("date") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getInt("animalid") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getString("species") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getString("animalname") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getInt("age") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getString("gender") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getString("habitat") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print( rs.getString("location") );
      out.write("</td>\n");
      out.write("    <td class=\"action-buttons\">\n");
      out.write("        <a class=\"btn\" href=\"");
      out.print( "edit.jsp?date=" + rs.getDate("date") 
                           + "&animalid=" + rs.getInt("animalid") 
                           + "&species=" + rs.getString("species") 
                           + "&animalname=" + rs.getString("animalname") 
                           + "&age=" + rs.getInt("age") 
                           + "&gender=" + rs.getString("gender") 
                           + "&habitat=" + rs.getString("habitat") 
                           + "&location=" + rs.getString("location") );
      out.write("\">Edit</a>\n");
      out.write("                           \n");
      out.write("        <a class=\"buton\" href=\"animalmanagement.jsp?delete=");
      out.print( rs.getInt("animalid") );
      out.write("\" \n");
      out.write("           onclick=\"return confirm('Are you sure you want to delete this record?');\">Delete</a>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("        ");

                }
            } catch (SQLException e) {
                out.println("Error retrieving animal records: " + e.getMessage());
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    ");

    String deleteId = request.getParameter("delete");
    if (deleteId != null) {
        Connection conn1 = null;
        PreparedStatement pstmt = null;
        try {
            // Establish database connection
            conn1 = DriverManager.getConnection("jdbc:derby://localhost:1527/AnimalDB", "app", "app");

            // Delete query
            String sql = "DELETE FROM ANIMAL WHERE animalid = ?";
            pstmt = conn1.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(deleteId));

            // Execute delete operation
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                out.println("<script>alert('Record deleted successfully!');</script>");
                response.sendRedirect("animalmanagement.jsp"); // Refresh page after deletion
            } else {
                out.println("<script>alert('Failed to delete record.');</script>");
            }
        } catch (SQLException e) {
            out.println("<script>alert('Error: " + e.getMessage() + "');</script>");
        } finally {
            if (pstmt != null) pstmt.close();
            if (conn1 != null) conn1.close();
        }
    }
    
      out.write("\n");
      out.write("            \n");
      out.write("    <script>\n");
      out.write("        function confirmDelete() {\n");
      out.write("        // Display a confirmation dialog\n");
      out.write("        var userConfirmed = confirm(\"Are you sure you want to delete this information?\");\n");
      out.write("        \n");
      out.write("        // Check if user clicked 'OK' or 'Cancel'\n");
      out.write("        if (userConfirmed) {\n");
      out.write("            alert(\"Information deleted successfully!\");  // You can replace this with actual delete functionality\n");
      out.write("        } else {\n");
      out.write("            alert(\"Deletion cancelled.\");  // Action when 'Cancel' is clicked\n");
      out.write("        }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
