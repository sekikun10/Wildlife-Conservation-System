<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shah Alam Zoo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            width:100%;
            background: linear-gradient(to top, rgba(0,0,0,0.5)50%, rgba(0,0,0,0.5)50%),url(Downloads/kk.png);
            background-size: cover;
            height: 100%;
        }
        header {
            color: white;
            text-align: center;
            display: flex;
            align-items: center;
            gap: 700px; /* Adjust spacing between logo and text */
        }
        nav {
            display: flex;
            justify-content: center;
            padding: 15px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 35px;
            font-size: 18px;
        }
        nav a:hover {
            color: #ffdd57;
        }
        .container {
            max-width: 900px;
            margin: 10px auto;
            text-align: center;
            color: white;
            font-family: Times New Roman, serif;
            font-size: 25px;
        }
        .container h2 {
            color: #AFE1AF;
            margin-top: -10px;
        }
        
        .container p {
            margin: 5px 0; /* Adjust the margin to reduce spacing */
            margin-top: -10px;
        }
        
        footer {
            color: white;
            text-align: center;
            padding: 10px;
            margin-top: 120px;
            
        }
        .image-container {
            text-align: center;
            margin-top: 20px;
        }
        .image-container img {
            width: 60%; /* Adjust to fit container */
            height: auto;
            border-radius: 10px; /* Optional: round the corners */
        }
        .header-text {
            font-size: 30px;
            color: white;
            text-align: center;
            position: relative;
            top: -50px;
            font-family: Lucida Console,Monospace;
        }
        .header-text p {
             /* Align text properly */
            font-family: Lucida Console,Monospace;
            font-size: 20px;
            margin-top: -30px;
        }
    </style>
</head>
<body> 
    <header>
        <div class="image-container">
            <img src="Downloads/logoo.png" alt="Zoo Animals Image"> 
        </div>
        <nav>
            <a href="register.jsp">Register</a>
            <a href="login.jsp">Login</a>
            <a href="about.jsp">About the Zoo</a>
        </nav>
    </header>
    <div class="header-text">
        <h1>WELCOME TO SHAH ALAM ZOO</h1>
        <p>Join Hands to Save Animals</p>
    </div>
    
    <div class="container">
        <h2>About Us</h2>
        <p>At Shah Alam Zoo, we are committed to wildlife conservation and public engagement.</p>
		<br>
        <h2>Zoo Highlights</h2>
            <p>Home of interesting 5 animal species</p>
            <p>Interactive feeding sessions</p>
            <p>Entertaining show for all ages</p>
    </div>
    <footer>
        <p>&copy; 2025 Shah Alam Zoo. All Rights Reserved.</p>
    </footer>
</body>
</html>
