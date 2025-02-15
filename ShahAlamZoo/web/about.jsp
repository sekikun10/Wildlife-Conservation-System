<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Shah Alam Zoo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f9f9;
            margin: 0;
            padding: 0;
            background: linear-gradient(to top, rgba(0,0,0,0.35)50%, rgba(0,0,0,0.35)50%),url(Downloads/kk.png);
            background-size: cover;
            height: 100%;
        }
        header {
            background-color: #454B1B;
            color: white;
            text-align: center;
            padding: 20px;
            display: flex; /* Enables flexbox */
            align-items: center; /* Align items vertically */
            gap: 355px; /* Adds spacing between logo and text */
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #333;
            padding: 10px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-size: 18px;
        }
        nav a:hover {
            color: #ffdd57;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        .contact p {
            text-align: center;
        }
        h2 {
            color: #2E8B57;
            text-align: center;
        }
        p {
            line-height: 1.6;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            margin-top: 30px;
        }
        table {
            width: 100%; /* Make the table take full width of the container */
            border-collapse: collapse; /* Remove spacing between table borders */
            margin-top: 20px; /* Add some spacing above the table */
        }

        th, td {
            border: 1px solid #333; /* Add borders to table cells */
            padding: 10px; /* Add spacing inside cells */
            text-align: left; /* Align text to the left */
        }

        th {
            background-color: rgba(69, 75, 27, 0.7);
            color: white; /* White text for headers */
        }
        .image-container img {
            width: 150px; /* Adjust as needed */
            height: auto;
        }
        .image-container {
            text-align: center;
            margin-top: 20px;
        }
        .header-text{
            text-align: center;
            font-family: Lucida Console,Monospace;
            font-size: 20px;
        }
        .header-text p{
            text-align: center;
            font-family: Lucida Console,Monospace;
            font-size: 20px;
            margin-top: -20px;
        }
    </style>
</head>
<body>
    <header>
    <div class="image-container">
        <img src="Downloads/logoo.png" alt="Zoo Logo">
    </div>
    <div class="header-text">
        <h1>About Shah Alam Zoo</h1>
        <p>Explore. Learn. Conserve.</p>
    </div>
    </header>
    <nav>
        <a href="homepage.jsp">Home</a>
        <a href="login.jsp">Login</a>
        <a href="register.jsp">Register</a>
    </nav>
    <div class="container">
        <h2>Our Mission</h2>
        <p>
            Shah Alam Zoo is dedicated to wildlife conservation, education, and recreation. 
            Our goal is to provide a safe haven for animals while creating awareness 
            about the importance of preserving their habitats.
        </p>
		<br>
                <h2>Additional Information</h2>
        <table>
            <thead>
                <tr>
                    <th>Category</th>
                    <th>Details</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Zoo Capacity</td>
                    <td>1500 Visitors per day</td>
                </tr>
                <tr>
                    <td>Opening Hours</td>
                    <td>9:00 AM - 6:00 PM</td>
                </tr>
            </tbody>
        </table>
        <br>
        
        <h2>Contact Us</h2>
        <div class="contact">
        <p>
            Address: Shah Alam Zoo, Selangor, Malaysia<br>
            Phone: +60 18-35734821<br>
            Email: wildlifeconservation@shahalamzoo.my
        </p>
        </div>
    </div>
    <footer>
        <p>&copy; 2024 Shah Alam Zoo. All Rights Reserved.</p>
    </footer>
</body>
</html>
