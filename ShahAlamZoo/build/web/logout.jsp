<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout - Shah Alam Zoo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #eaf4e3; /* Light green background */
            color: #2f4f2f; /* Dark green text */
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background: linear-gradient(to top, rgba(0,0,0,0.65)50%, rgba(0,0,0,0.65)50%),url(Downloads/haha.png);
            background-size: cover;
        }
        
        .container {
            background-color: rgba(255, 255, 255, 0.5); /* White with 50% opacity */
            padding: 30px;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
            max-width: 550px;
        }

        h1 {
            margin-top:-8px;
            color: #004d00; /* Deep green title */
        }

        p {
            font-size: 18px;
            color: #023020; /* Medium green text */
        }

        .btn-container {
            margin-top: 40px;
        }

        .btn {
            background-color: #006400; /* Forest green */
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 16px;
            border: none;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #228b22; /* Slightly lighter green */
        }

        .btn + .btn {
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
    <h1>You have successfully logged out!</h1>
    <p>Thank you for visiting the Shah Alam Zoo Staff Management System. Have a great day!</p>
    <div class="btn-container">
        <a href="homepage.jsp" class="btn">Home</a>
        <a href="login.jsp" class="btn">Login Again</a>
    </div>
    </div>
</body>
</html>
