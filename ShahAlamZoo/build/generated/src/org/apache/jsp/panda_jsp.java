package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Peacock Information</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            background-color: #008080;\n");
      out.write("        }\n");
      out.write("        .intro {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            text-align: justify;\n");
      out.write("        }\n");
      out.write("        .gallery {\n");
      out.write("            display: grid;\n");
      out.write("            grid-template-columns: repeat(3, 1fr);\n");
      out.write("            gap: 10px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("        .gallery img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 350px; /* Set a fixed height */\n");
      out.write("            object-fit: cover; /* Ensure images fill the space properly */\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        h1,h2 {\n");
      out.write("            color: white;\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            color: white;\n");
      out.write("            font-family: Times New Roman, serif;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            \n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            background-color: #333;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        nav a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            margin: 0 15px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("        nav a:hover {\n");
      out.write("            color: #ffdd57;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav>\n");
      out.write("            <a href=\"dashboard.jsp\">Back</a>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <h1>Panda - The Cute Mammals</h1>\n");
      out.write("    <div class=\"intro\">\n");
      out.write("        <p>Pandas are beloved for their black-and-white fur and playful nature, but they are also a vital part of their ecosystem. Native to China, these gentle giants primarily feed on bamboo and help maintain forests by spreading seeds and promoting plant growth.\n");
      out.write("            However, pandas have faced severe threats due to habitat loss and low reproduction rates. Thanks to conservation efforts, including habitat protection and breeding programs, their population has started to recover. Despite this progress, continued efforts are needed to ensure their long-term survival.\n");
      out.write("            By supporting wildlife conservation, we can help protect pandas and preserve their natural habitat for future generations.</p>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <h2>Panda Image Gallery</h2>\n");
      out.write("    <div class=\"gallery\">\n");
      out.write("        ");
 for (int i = 1; i <= 15; i++) { 
      out.write("\n");
      out.write("            <img src=\"Downloads/panda.");
      out.print( i );
      out.write(".png\" alt=\"Panda Image ");
      out.print( i );
      out.write("\">\n");
      out.write("        ");
 } 
      out.write("\n");
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
