package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Logout - Shah Alam Zoo</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #eaf4e3; /* Light green background */\n");
      out.write("            color: #2f4f2f; /* Dark green text */\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            background: linear-gradient(to top, rgba(0,0,0,0.65)50%, rgba(0,0,0,0.65)50%),url(Downloads/haha.png);\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .container {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.5); /* White with 50% opacity */\n");
      out.write("            padding: 30px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);\n");
      out.write("            max-width: 550px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            margin-top:-8px;\n");
      out.write("            color: #004d00; /* Deep green title */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #023020; /* Medium green text */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-container {\n");
      out.write("            margin-top: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            background-color: #006400; /* Forest green */\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #228b22; /* Slightly lighter green */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn + .btn {\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <h1>You have successfully logged out!</h1>\n");
      out.write("    <p>Thank you for visiting the Shah Alam Zoo Staff Management System. Have a great day!</p>\n");
      out.write("    <div class=\"btn-container\">\n");
      out.write("        <a href=\"homepage.jsp\" class=\"btn\">Home</a>\n");
      out.write("        <a href=\"login.jsp\" class=\"btn\">Login Again</a>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
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
