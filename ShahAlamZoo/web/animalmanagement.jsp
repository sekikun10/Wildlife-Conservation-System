<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Animal Management - Shah Alam Zoo</title>
   
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #8A9A5B;
        }
        header {
            background-color: #454B1B;
            color: white;
            padding: 20px;
            text-align: center;
            font-family: Lucida Console,Monospace;
            font-size: 18px;

        }
        nav {
            text-align: right;
            margin-top: -40px;
            margin-right: 20px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin-left: 15px;
            font-size: 16px;
            background-color: #8A9A5B;
            padding: 8px 15px;
            border-radius: 4px;
        }
        nav a:hover {
            background-color: #1f3e1f;
        }
        .container {
            width: 50%;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .containerr {
            width: 80%;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        h2, h3 {
            font-size: 23px;
            text-align: center;
            color: #3a753c;
        }
        form {
            display: flex;
            flex-direction: column;
            gap: 10px;
            max-width: 600px;
            margin: 0 auto;
        }
        label {
            font-weight: bold;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .btn {
            padding: 10px 20px;
            background-color: #808000;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            font-size: 17px;
        }
        .btn:hover {
            background-color: #2c5a2b;
        }
        .buton {
            padding: 10px 20px;
            background-color: #d9534f;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .buton:hover {
            background-color: #c9302c;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table th, table td {
            border: 3px solid #ddd;
            padding: 12px;
            text-align: center;
        }
        table th {
            background-color: #355E3B;
            color: white;
        }
        .action-buttons {
            display: flex;
            justify-content: center;
            gap: 10px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Animal Management</h1>
        <nav>
            <a href="dashboard.jsp">Dashboard</a>
            <a href="logout.jsp">Logout</a>
        </nav>
    </header>
    <div class="container">
        <h2>Add Animal</h2>
        <form action="AddAnimalServlet" method="post">
            <label for="date">Entry Date:</label>
            <input type="date" name="date" required>

            <label for="animalid">Animal ID:</label>
            <input type="text" name="animalid" required>

            <label for="species">Species:</label>
            <select name="species">
                <option value="Mammals">Mammals</option>
                <option value="Birds">Birds</option>
                <option value="Reptiles">Reptiles</option>
                <option value="Amphibians">Amphibians</option>
                <option value="Fish and Marine Animals">Fish and Marine Animals</option>
            </select>
            
            <label for="animalname">Animal Name:</label>
            <select name="animalname">
                <option value="Panda">Panda</option>
                <option value="Peacock">Peacock</option>
                <option value="Crocodile">Crocodile</option>
                <option value="Axolotl">Axolotl</option>
                <option value="Turtle">Turtle</option>
            </select>

            <label for="age">Age:</label>
            <input type="number" name="age" required>

            <label for="gender">Gender:</label>
            <select name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>

            <label for="habitat">Habitat:</label>
            <input type="text" name="habitat" required>

            <label for="location">Location:</label>
            <select name="location">
                <option value="Location 1">Location 1</option>
                <option value="Location 2">Location 2</option>
                <option value="Location 3">Location 3</option>
                <option value="Location 4">Location 4</option>
                <option value="Location 5">Location 5</option>
            </select><br>

            <button type="submit" class="btn">Add Animal</button>
        </form>
    </div>
    <div class="containerr">
        <h3>Animal Records</h3>
    <table>
        <tr>
            <th>Date</th>
            <th>Animal ID</th>
            <th>Species</th>
            <th>Animal Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Habitat</th>
            <th>Location</th>
            <th>Actions</th>
        </tr>
        <%
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AnimalDB", "app", "app");
                String query = "SELECT * FROM ANIMAL";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();
                
                while (rs.next()) {
        %>
    <tr>
    <td><%= rs.getDate("date") %></td>
    <td><%= rs.getInt("animalid") %></td>
    <td><%= rs.getString("species") %></td>
    <td><%= rs.getString("animalname") %></td>
    <td><%= rs.getInt("age") %></td>
    <td><%= rs.getString("gender") %></td>
    <td><%= rs.getString("habitat") %></td>
    <td><%= rs.getString("location") %></td>
    <td class="action-buttons">
        <a class="btn" href="<%= "edit.jsp?date=" + rs.getDate("date") 
                           + "&animalid=" + rs.getInt("animalid") 
                           + "&species=" + rs.getString("species") 
                           + "&animalname=" + rs.getString("animalname") 
                           + "&age=" + rs.getInt("age") 
                           + "&gender=" + rs.getString("gender") 
                           + "&habitat=" + rs.getString("habitat") 
                           + "&location=" + rs.getString("location") %>">Edit</a>
                           
        <a class="buton" href="animalmanagement.jsp?delete=<%= rs.getInt("animalid") %>" 
           onclick="return confirm('Are you sure you want to delete this record?');">Delete</a>
    </td>
</tr>

        <%
                }
            } catch (SQLException e) {
                out.println("Error retrieving animal records: " + e.getMessage());
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        %>
    </table>
    
    <%
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
    %>
            
    <script>
        function confirmDelete() {
        // Display a confirmation dialog
        var userConfirmed = confirm("Are you sure you want to delete this information?");
        
        // Check if user clicked 'OK' or 'Cancel'
        if (userConfirmed) {
            alert("Information deleted successfully!");  // You can replace this with actual delete functionality
        } else {
            alert("Deletion cancelled.");  // Action when 'Cancel' is clicked
        }
        }
    </script>
    </div>
</body>
</html>