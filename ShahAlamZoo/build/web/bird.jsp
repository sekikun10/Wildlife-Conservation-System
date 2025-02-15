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
    
    <h1>Peacock - The Majestic Bird</h1>
    <div class="intro">
        <p>Peacocks are one of the most stunning birds in the animal kingdom, known for their vibrant plumage and mesmerizing courtship displays. These birds, native to South Asia and parts of Africa, play an important role in their ecosystems by controlling insect populations and spreading seeds through their diet.
            Despite their beauty, peacocks face threats such as habitat loss, poaching, and illegal pet trade. Conservation efforts, including habitat preservation and wildlife protection laws, are crucial to ensuring their survival in the wild.
            By supporting wildlife conservation, we can help protect these magnificent birds and maintain the balance of nature.</p>
    </div>
    <br>

    <h2>Peacock Image Gallery</h2>
    <div class="gallery">
        <% for (int i = 1; i <= 15; i++) { %>
            <img src="Downloads/pc<%= i %>.jpg" alt="Peacock Image <%= i %>">
        <% } %>
    </div>
</body>
</html>
