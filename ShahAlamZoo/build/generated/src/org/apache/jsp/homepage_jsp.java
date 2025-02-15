package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Shah Alam Zoo</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            width:100%;\n");
      out.write("            background: linear-gradient(to top, rgba(0,0,0,0.5)50%, rgba(0,0,0,0.5)50%),url(Downloads/kk.png);\n");
      out.write("            background-size: cover;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            gap: 700px; /* Adjust spacing between logo and text */\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            padding: 15px;\n");
      out.write("        }\n");
      out.write("        nav a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin: 0 35px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        nav a:hover {\n");
      out.write("            color: #ffdd57;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 900px;\n");
      out.write("            margin: 10px auto;\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("            font-family: Times New Roman, serif;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        .container h2 {\n");
      out.write("            color: #AFE1AF;\n");
      out.write("            margin-top: -10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .container p {\n");
      out.write("            margin: 5px 0; /* Adjust the margin to reduce spacing */\n");
      out.write("            margin-top: -10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        footer {\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-top: 120px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .image-container {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .image-container img {\n");
      out.write("            width: 60%; /* Adjust to fit container */\n");
      out.write("            height: auto;\n");
      out.write("            border-radius: 10px; /* Optional: round the corners */\n");
      out.write("        }\n");
      out.write("        .header-text {\n");
      out.write("            font-size: 30px;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            position: relative;\n");
      out.write("            top: -50px;\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("        }\n");
      out.write("        .header-text p {\n");
      out.write("             /* Align text properly */\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("            font-size: 20px;\n");
      out.write("            margin-top: -30px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    <header>\n");
      out.write("        <div class=\"image-container\">\n");
      out.write("            <img src=\"Downloads/logoo.png\" alt=\"Zoo Animals Image\"> \n");
      out.write("        </div>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"register.jsp\">Register</a>\n");
      out.write("            <a href=\"login.jsp\">Login</a>\n");
      out.write("            <a href=\"about.jsp\">About the Zoo</a>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"header-text\">\n");
      out.write("        <h1>WELCOME TO SHAH ALAM ZOO</h1>\n");
      out.write("        <p>Join Hands to Save Animals</p>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>About Us</h2>\n");
      out.write("        <p>At Shah Alam Zoo, we are committed to wildlife conservation and public engagement.</p>\n");
      out.write("\t\t<br>\n");
      out.write("        <h2>Zoo Highlights</h2>\n");
      out.write("            <p>Home of interesting 5 animal species</p>\n");
      out.write("            <p>Interactive feeding sessions</p>\n");
      out.write("            <p>Entertaining show for all ages</p>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2025 Shah Alam Zoo. All Rights Reserved.</p>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
