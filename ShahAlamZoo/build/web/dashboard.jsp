<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Shah Alam Zoo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to top, rgba(0,0,0,0.25)50%, rgba(0,0,0,0.25)50%),url(Downloads/loll.png);
            background-size: cover;
        }
        header {
            
            color: white;
            padding: 10px 20px;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }
        header img {
            margin-top: 30px;
            width: 12%; /* Adjust to fit container */
            height: auto;
            border-radius: 10px;
        }
        header h1 {
            background-color: #454B1B;
            color: white;
            text-align: center;
            font-size: 48px;
            font-weight: bold;
            margin-bottom: 5px;
            font-family: Lucida Console,Monospace;
        }
        
        header h2 {
            margin-top: 5px; /* Reduce space above Welcome */
            font-size: 20px; /* Adjust size if needed */
            font-family: Lucida Console,Monospace;
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
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table th, table td {
            border: 5px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        table th {
            background-color: rgba(69, 75, 27, 0.7);
            color: white;
        }
        .btn {
            display: inline-block;
            margin: 15px auto;
            padding: 10px 20px;
            background-color: #40826D;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            text-align: center;
        }
        .btn:hover {
            background-color: #4CBB17;
        }
        .image-container {
            text-align: center;
            margin-top: 20px;
        }
        .image-container img {
            width: 35%; /* Adjust to fit container */
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
            margin-top: -80px;
        }
        .header-text p {
             /* Align text properly */
            font-family: Lucida Console,Monospace;
            font-size: 20px;
            margin-top: -30px;
        }
        .map h1{
            font-size: 30px;
            color: white;
            text-align: center;
            background-color: rgba(69, 75, 27, 0.7);
            padding: 8px;
            margin-top: -30px;
        }
    </style>
</head>
<body>
    <header>
        <img src="Downloads/logoo.png" alt="Zoo Logo" class="logo">
        <nav>
            <a href="logout.jsp">Log Out</a>
        </nav>
    </header>
    <div class="header-text">
        <h1>Dashboard</h1>
        <p>Welcome to Shah Alam Zoo Staff Management System</p>
    </div>
    <div class="map">
        <h1>Shah Alam Zoo Map</h1>
    </div>
    <div class="image-container">
        <img src="Downloads/map zooo.png" alt="Zoo Animals Image"> 
    </div>
    <div class="container">
        <div style="display: flex; align-items: center;">
            <h2 style="flex-grow: 1;">Animals</h2>
            <a href="animalmanagement.jsp" class="btn" style="margin-left: auto;">Go to Animal Management</a>
        </div>
        <table>
            <thead>
                <tr>
                    <th>Species</th>
                    <th>Location</th>
                    <th>View Animals</th>
                </tr>
            </thead>
            <tbody>
                <!-- Dynamic rows will be filled with data from the database -->
                <tr>
                    <td>Birds</td>
                    <td>Location 1</td>
                    <td><a href="bird.jsp" class="btn">Peacock</a></td>
                </tr>
                <tr>
                    <td>Reptiles</td>
                    <td>Location 2</td>
                    <td><a href="reptile.jsp" class="btn">Crocodile</a></td>
                </tr>
                <tr>
                    <td>Fish & Marine</td>
                    <td>Location 3</td>
                    <td><a href="turtle.jsp" class="btn">Turtle</a></td>
                </tr>
                <tr>
                    <td>Amphibia</td>
                    <td>Location 4</td>
                    <td><a href="amphibia.jsp" class="btn">Axolotl</a></td>
                </tr>
                <tr>
                    <td>Mammals</td>
                    <td>Location 5</td>
                    <td><a href="panda.jsp" class="btn">Panda</a></td>
                </tr>
            </tbody>
        </table>
        
        <table>
            <thead>
                <tr>
                    <th>LOCATION</th>
                    <th>DETAILS</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Location 1</td>
                    <td>Birds</td>
                </tr>
                <tr>
                    <td>Location 2</td>
                    <td>Reptilia</td>
                </tr>
                <tr>
                    <td>Location 3</td>
                    <td>Fish & Marine Animals</td>
                </tr>
                <tr>
                    <td>Location 4</td>
                    <td>Amphibia</td>
                </tr>
                <tr>
                    <td>Location 5</td>
                    <td>Mammals</td>
                </tr>
            </tbody>
        </table>
        
    </div>
    
</body>
</html>
