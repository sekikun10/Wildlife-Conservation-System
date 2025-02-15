import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String DB_URL = "jdbc:derby://localhost:1527/AnimalDB;create=true;user=app;password=app";
    private static final String DB_DRIVER = "org.apache.derby.jdbc.ClientDriver";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            response.sendRedirect("login.jsp?message=Email and password are required.");
            return;
        }

        try {
            if (validateLogin(email, password)) {
                // Create a session
                HttpSession session = request.getSession();
                session.setAttribute("email", email);

                // Redirect to dashboard.jsp
                response.sendRedirect("dashboard.jsp");
            } else {
                response.sendRedirect("login.jsp?message=Invalid email or password. Please try again.");
            }
        } catch (Exception e) {
            response.sendRedirect("login.jsp?message=Login failed due to an error.");
        }
    }

    private boolean validateLogin(String email, String password) throws SQLException, ClassNotFoundException {
        Class.forName(DB_DRIVER);
        try (Connection conn = DriverManager.getConnection(DB_URL);
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT email FROM STAFF WHERE email = ? AND password = ?")) {

            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            return rs.next();
        }
    }
}
