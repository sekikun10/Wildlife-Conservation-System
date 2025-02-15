<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Shah Alam Zoo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to top, rgba(0,0,0,0.5)50%, rgba(0,0,0,0.5)50%),url(Downloads/lol.png);
            background-size: cover;
        }
        .container {
            max-width: 400px;
            margin: 100px auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        h2 {
            text-align: center;
            color: #559e58;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        input {
            margin: 10px 0;
            padding: 10px;
            font-size: 16px;
        }
        button {
            padding: 10px;
            background-color: #85c88a;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #559e58;
        }
        nav {
            text-align: center;
            margin-top: 10px;
        }
        nav a {
            text-decoration: none;
            color: #85c88a;
        }
        nav a:hover {
            color: #559e58;
        }
        .error {
            color: red;
            text-align: center;
        }
        .image-container {
            text-align: center;
            margin-top: 10px;
        }
        .image-container img {
            width: 40%; /* Adjust to fit container */
            height: auto;
            border-radius: 10px; /* Optional: round the corners */
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="image-container">
            <img src="Downloads/Logo.png" alt="Zoo Animals Image"> 
        </div>
        <h2>Staff Login</h2>
        <% 
             String message = request.getParameter("message"); 
            if (message != null && !message.isEmpty()) {  
        %>
            <p class="error"><%= message %></p>
        <% } %>
        <form action="LoginServlet" method="post">
            <input type="email" name="email" placeholder="Email" required>
            <input type="password" name="password" placeholder="Password" required>
            <br>
            <button type="submit">Login</button>
        </form>
        <br>
        <nav>
            <p>New staff? <a href="register.jsp">Register here</a></p>
        </nav>
    </div>
</body>
</html>