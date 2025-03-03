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
    
    <h1>Axolotl - The Unique Amphibia</h1>
    <div class="intro">
        <p>The axolotl is a unique amphibian known for its ability to regenerate limbs and retain its juvenile features throughout life. Native to the lakes of Mexico, this fascinating creature plays a vital role in its ecosystem by controlling insect populations and maintaining aquatic balance.
            Unfortunately, axolotls are critically endangered due to habitat destruction, pollution, and invasive species. Conservation efforts, such as habitat restoration and captive breeding programs, are essential to prevent their extinction.
            By supporting wildlife conservation, we can help protect axolotls and preserve the natural biodiversity of our planet.</p>
    </div>
    <br>

    <h2>Axolotl Image Gallery</h2>
    <div class="gallery">
        <% for (int i = 1; i <= 15; i++) { %>
            <img src="Downloads/x<%= i %>.jpg" alt="Axolotl Image <%= i %>">
        <% } %>
    </div>
</body>
</html>