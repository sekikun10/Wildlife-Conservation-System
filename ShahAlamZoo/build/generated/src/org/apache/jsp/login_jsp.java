package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login - Shah Alam Zoo</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: linear-gradient(to top, rgba(0,0,0,0.5)50%, rgba(0,0,0,0.5)50%),url(Downloads/lol.png);\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 100px auto;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #559e58;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            margin: 10px 0;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #85c88a;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background-color: #559e58;\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        nav a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #85c88a;\n");
      out.write("        }\n");
      out.write("        nav a:hover {\n");
      out.write("            color: #559e58;\n");
      out.write("        }\n");
      out.write("        .error {\n");
      out.write("            color: red;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .image-container {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .image-container img {\n");
      out.write("            width: 40%; /* Adjust to fit container */\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 10px; /* Optional: round the corners */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"image-container\">\n");
      out.write("            <img src=\"Downloads/Logo.png\" alt=\"Zoo Animals Image\"> \n");
      out.write("        </div>\n");
      out.write("        <h2>Staff Login</h2>\n");
      out.write("        ");
 
             String message = request.getParameter("message"); 
            if (message != null && !message.isEmpty()) {  
        
      out.write("\n");
      out.write("            <p class=\"error\">");
      out.print( message );
      out.write("</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        <form action=\"LoginServlet\" method=\"post\">\n");
      out.write("            <input type=\"email\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"submit\">Login</button>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <nav>\n");
      out.write("            <p>New staff? <a href=\"register.jsp\">Register here</a></p>\n");
      out.write("        </nav>\n");
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
