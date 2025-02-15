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

    <h1>Panda - The Cute Mammals</h1>
    <div class="intro">
        <p>Pandas are beloved for their black-and-white fur and playful nature, but they are also a vital part of their ecosystem. Native to China, these gentle giants primarily feed on bamboo and help maintain forests by spreading seeds and promoting plant growth.
            However, pandas have faced severe threats due to habitat loss and low reproduction rates. Thanks to conservation efforts, including habitat protection and breeding programs, their population has started to recover. Despite this progress, continued efforts are needed to ensure their long-term survival.
            By supporting wildlife conservation, we can help protect pandas and preserve their natural habitat for future generations.</p>
    </div>
    <br>

    <h2>Panda Image Gallery</h2>
    <div class="gallery">
        <% for (int i = 1; i <= 15; i++) { %>
            <img src="Downloads/panda.<%= i %>.png" alt="Panda Image <%= i %>">
        <% } %>
    </div>
</body>
</html>
