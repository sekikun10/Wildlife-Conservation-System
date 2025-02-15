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
    
    <h1>Crocodile - The Wild Reptile</h1>
    <div class="intro">
        <p>Crocodiles are large, semi-aquatic reptiles known for their powerful jaws, armored bodies, and exceptional survival instincts. As apex predators, they play a crucial role in maintaining the balance of aquatic ecosystems by controlling fish and other prey populations.
            However, many crocodile species are facing threats due to habitat destruction, illegal hunting, and climate change. Conservation efforts, including habitat protection, breeding programs, and strict anti-poaching laws, are essential to ensure their survival.
            By supporting wildlife conservation, we can help protect crocodiles and preserve biodiversity for future generations.</p>
    </div>
    <br>
    
    <h2>Crocodile Image Gallery</h2>
    <div class="gallery">
        <% for (int i = 1; i <= 15; i++) { %>
            <img src="Downloads/croc<%= i %>.jpg" alt="Crocodile Image <%= i %>">
        <% } %>
    </div>
</body>
</html>
