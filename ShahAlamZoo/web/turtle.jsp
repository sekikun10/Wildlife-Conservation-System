<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Peacock Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            text-align: center;
            background-color: #008080;
        }
        .intro {
            max-width: 800px;
            margin: 0 auto;
            text-align: justify;
        }
        .gallery {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 10px;
            margin-top: 20px;
            justify-content: center;
        }
        .gallery img {
            width: 100%;
            height: 350px; /* Set a fixed height */
            object-fit: cover; /* Ensure images fill the space properly */
            border-radius: 5px;
        }
        h1,h2 {
            color: white;
            font-family: Lucida Console,Monospace;
        }
        p {
            color: white;
            font-family: Times New Roman, serif;
        }
        header {
            
            color: white;
            padding: 10px 20px;
            display: flex;
            align-items: center;
            justify-content: space-between;
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
    </style>
</head>
<body>
    <header>
        <nav>
            <a href="dashboard.jsp">Back</a>
        </nav>
    </header>
    
    <h1>Turtle - The Strong Marine</h1>
    <div class="intro">
        <p>Turtles are remarkable reptiles that have roamed the Earth for over 200 million years. Found in oceans, rivers, and forests, they play a vital role in maintaining healthy ecosystems by controlling jellyfish populations, dispersing seeds, and keeping aquatic environments balanced. 
            However, many turtle species are endangered due to habitat destruction, pollution, climate change, and illegal poaching. Conservation efforts such as protected nesting sites, anti-poaching laws, and reducing plastic waste are essential to their survival.
            By supporting wildlife conservation, we can help protect turtles and ensure they continue to thrive in their natural habitats.</p>
    </div>
    <br>

    <h2>Turtle  Image Gallery</h2>
    <div class="gallery">
        <% for (int i = 1; i <= 15; i++) { %>
            <img src="Downloads/turtle.<%= i %>.png" alt="Turtle Image <%= i %>">
        <% } %>
    </div>
</body>
</html>