<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Interactive Story Creator</title>
</head>
<body>
<h1>Interactive Story Creator</h1>
<p>Enter words as prompted and create your own story!</p>
    <label for="noun">Enter a noun:</label>
    <input type="text" id="noun" placeholder="e.g., dog"><br>
    <label for="verb">Enter a verb:</label>
    <input type="text" id="verb" placeholder="e.g., run"><br>
    <label for="adjective">Enter an adjective:</label>
    <input type="text" id="adjective" placeholder="e.g., blue"><br>
    <label for="place">Enter a place:</label>
    <input type="text" id="place" placeholder="e.g., park"><br>
    <button onclick="generateStory()">Generate Story</button>
    <p id="story"></p>

<script>
function generateStory() {
    // Retrieving input values
    var noun = document.getElementById('noun').value;
    var verb = document.getElementById('verb').value;
    var adjective = document.getElementById('adjective').value;
    var place = document.getElementById('place').value;

    // Constructing the story
    var story = `Once upon a time, in a very ${adjective} ${place}, there was a ${noun} that loved to ${verb}.`;

    // Displaying the story
    document.getElementById('story').textContent = story;
}
    </script>
</body>
</html>