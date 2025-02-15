package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>About Shah Alam Zoo</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f9f9;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(to top, rgba(0,0,0,0.35)50%, rgba(0,0,0,0.35)50%),url(Downloads/kk.png);\n");
      out.write("            background-size: cover;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("        header {\n");
      out.write("            background-color: #454B1B;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("            display: flex; /* Enables flexbox */\n");
      out.write("            align-items: center; /* Align items vertically */\n");
      out.write("            gap: 355px; /* Adds spacing between logo and text */\n");
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
      out.write("        .container {\n");
      out.write("            max-width: 800px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        .contact p {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: #2E8B57;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
      out.write("        footer {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%; /* Make the table take full width of the container */\n");
      out.write("            border-collapse: collapse; /* Remove spacing between table borders */\n");
      out.write("            margin-top: 20px; /* Add some spacing above the table */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #333; /* Add borders to table cells */\n");
      out.write("            padding: 10px; /* Add spacing inside cells */\n");
      out.write("            text-align: left; /* Align text to the left */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: rgba(69, 75, 27, 0.7);\n");
      out.write("            color: white; /* White text for headers */\n");
      out.write("        }\n");
      out.write("        .image-container img {\n");
      out.write("            width: 150px; /* Adjust as needed */\n");
      out.write("            height: auto;\n");
      out.write("        }\n");
      out.write("        .image-container {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        .header-text{\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .header-text p{\n");
      out.write("            text-align: center;\n");
      out.write("            font-family: Lucida Console,Monospace;\n");
      out.write("            font-size: 20px;\n");
      out.write("            margin-top: -20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("    <div class=\"image-container\">\n");
      out.write("        <img src=\"Downloads/logoo.png\" alt=\"Zoo Logo\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"header-text\">\n");
      out.write("        <h1>About Shah Alam Zoo</h1>\n");
      out.write("        <p>Explore. Learn. Conserve.</p>\n");
      out.write("    </div>\n");
      out.write("    </header>\n");
      out.write("    <nav>\n");
      out.write("        <a href=\"homepage.jsp\">Home</a>\n");
      out.write("        <a href=\"login.jsp\">Login</a>\n");
      out.write("        <a href=\"register.jsp\">Register</a>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>Our Mission</h2>\n");
      out.write("        <p>\n");
      out.write("            Shah Alam Zoo is dedicated to wildlife conservation, education, and recreation. \n");
      out.write("            Our goal is to provide a safe haven for animals while creating awareness \n");
      out.write("            about the importance of preserving their habitats.\n");
      out.write("        </p>\n");
      out.write("\t\t<br>\n");
      out.write("                <h2>Additional Information</h2>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Category</th>\n");
      out.write("                    <th>Details</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Zoo Capacity</td>\n");
      out.write("                    <td>1500 Visitors per day</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Opening Hours</td>\n");
      out.write("                    <td>9:00 AM - 6:00 PM</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <h2>Contact Us</h2>\n");
      out.write("        <div class=\"contact\">\n");
      out.write("        <p>\n");
      out.write("            Address: Shah Alam Zoo, Selangor, Malaysia<br>\n");
      out.write("            Phone: +60 18-35734821<br>\n");
      out.write("            Email: wildlifeconservation@shahalamzoo.my\n");
      out.write("        </p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p>&copy; 2024 Shah Alam Zoo. All Rights Reserved.</p>\n");
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
