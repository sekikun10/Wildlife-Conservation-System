
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
            position: relative;
        }
        header nav {
            position: absolute;
            top: 20px;
            right: 20px;
        }
        header nav a {
            color: white;
            text-decoration: none;
            margin-left: 15px;
            font-size: 16px;
            background-color: #8A9A5B;
            padding: 8px 15px;
            border-radius: 4px;
        }
        header nav a:hover {
            background-color: #1f3e1f;
        }
        .container {
            max-width: 900px;
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
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        table th {
            background-color: #3a753c;
            color: white;
        }
        form {
            margin-top: 20px;
        }
        form div {
            margin-bottom: 15px;
        }
        label {
            display: inline-block;
            width: 150px;
            font-weight: bold;
        }
        input, select {
            width: calc(100% - 160px);
            padding: 8px;
        }
        .btn { 
            padding: 10px 20px;
            background-color: #808000;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .btn:hover {
            background-color: #2c5a2b;
        }
/*        merah*/
        .buton {
            padding: 10px 20px;
            background-color: #d9534f;
            color: white;
            text-decoration: none;
            border-radius: 4px;
        }
        .buton:hover {
            background-color: #FF0000; 
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
        <h2>Update Animal Information</h2>
        <form action="EditAnimalServlet" method="POST">
            <div>
                <label for="date">Entry Date:</label>
                <input type="date" name="date" required>
            </div>
            <div>
                <label for="animalid">Animal ID:</label>
                <input type="text" name="animalid" required>
            </div>
            <div>
                <label for="species">Species:</label>
                <br>
                <select name="species">
                    <option value="Mammals">Mammals</option>
                    <option value="Birds">Birds</option>
                    <option value="Reptiles">Reptiles</option>
                    <option value="Amphibians">Amphibians</option>
                    <option value="Fish and Marine Animals">Fish and Marine Animals</option>
                </select>
            </div>
            <div>
                <label for="animalname">Animal Name:</label>
                <br>
                <select name="animalname">
                <option value="Panda">Panda</option>
                <option value="Peacock">Peacock</option>
                <option value="Crocodile">Crocodile</option>
                <option value="Axolotl">Axolotl</option>
                <option value="Turtle">Turtle</option>
            </select>
            </div>
            <div> 
        <label for="age">Age:</label>
        <input type="number" name="age" required>
         </div>
            <div>
                <label for="gender">Gender:</label>
                <br>
                <select name="gender">
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                </select>
            </div>
            <div>
                <label for="habitat">Habitat:</label>
                <input type="text" name="habitat" required>
            </div>
            <div>
                <label for="location">Location:</label>
                <br>
                <select name="location">
                    <option value="Location 1">Location 1</option>
                    <option value="Location 2">Location 2</option>
                    <option value="Location 3">Location 3</option>
                    <option value="Location 4">Location 4</option>
                    <option value="Location 5">Location 5</option>
                </select>
            </div>
            <button type="submit" class="btn">Update</button>
        </form>
  
        </table>
    </div>
</body>
</html>