package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Animal Management - Shah Alam Zoo</title>\n");
      out.write("    <style>\n");
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
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("        header nav {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 20px;\n");
      out.write("            right: 20px;\n");
      out.write("        }\n");
      out.write("        header nav a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin-left: 15px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            background-color: #8A9A5B;\n");
      out.write("            padding: 8px 15px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        header nav a:hover {\n");
      out.write("            background-color: #1f3e1f;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        table th, table td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        table th {\n");
      out.write("            background-color: #3a753c;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        form div {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: inline-block;\n");
      out.write("            width: 150px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input, select {\n");
      out.write("            width: calc(100% - 160px);\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("        .btn { \n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #808000;\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #2c5a2b;\n");
      out.write("        }\n");
      out.write("/*        merah*/\n");
      out.write("        .buton {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #d9534f;\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .buton:hover {\n");
      out.write("            background-color: #FF0000; \n");
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
      out.write("        <h2>Update Animal Information</h2>\n");
      out.write("        <form action=\"EditAnimalServlet\" method=\"POST\">\n");
      out.write("            <div>\n");
      out.write("                <label for=\"date\">Entry Date:</label>\n");
      out.write("                <input type=\"date\" name=\"date\" required>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"animalid\">Animal ID:</label>\n");
      out.write("                <input type=\"text\" name=\"animalid\" required>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"species\">Species:</label>\n");
      out.write("                <br>\n");
      out.write("                <select name=\"species\">\n");
      out.write("                    <option value=\"Mammals\">Mammals</option>\n");
      out.write("                    <option value=\"Birds\">Birds</option>\n");
      out.write("                    <option value=\"Reptiles\">Reptiles</option>\n");
      out.write("                    <option value=\"Amphibians\">Amphibians</option>\n");
      out.write("                    <option value=\"Fish and Marine Animals\">Fish and Marine Animals</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"animalname\">Animal Name:</label>\n");
      out.write("                <br>\n");
      out.write("                <select name=\"animalname\">\n");
      out.write("                <option value=\"Panda\">Panda</option>\n");
      out.write("                <option value=\"Peacock\">Peacock</option>\n");
      out.write("                <option value=\"Crocodile\">Crocodile</option>\n");
      out.write("                <option value=\"Axolotl\">Axolotl</option>\n");
      out.write("                <option value=\"Turtle\">Turtle</option>\n");
      out.write("            </select>\n");
      out.write("            </div>\n");
      out.write("            <div> \n");
      out.write("        <label for=\"age\">Age:</label>\n");
      out.write("        <input type=\"number\" name=\"age\" required>\n");
      out.write("         </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"gender\">Gender:</label>\n");
      out.write("                <br>\n");
      out.write("                <select name=\"gender\">\n");
      out.write("                    <option value=\"Male\">Male</option>\n");
      out.write("                    <option value=\"Female\">Female</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"habitat\">Habitat:</label>\n");
      out.write("                <input type=\"text\" name=\"habitat\" required>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"location\">Location:</label>\n");
      out.write("                <br>\n");
      out.write("                <select name=\"location\">\n");
      out.write("                    <option value=\"Location 1\">Location 1</option>\n");
      out.write("                    <option value=\"Location 2\">Location 2</option>\n");
      out.write("                    <option value=\"Location 3\">Location 3</option>\n");
      out.write("                    <option value=\"Location 4\">Location 4</option>\n");
      out.write("                    <option value=\"Location 5\">Location 5</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn\">Update</button>\n");
      out.write("        </form>\n");
      out.write("  \n");
      out.write("        </table>\n");
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
