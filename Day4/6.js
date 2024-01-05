const fs = require("fs");

const filePath = "6.txt";

fs.readFile(filePath, "utf-8", (err, data) => {
  if (err) {
    console.error("Error reading file:", err);
    return;
  }

  var words = data.split(/\s+/);
  console.log(words)
  const charIndices = {};

  for (let j = 0; j < words.length; j++) {
    let word = words[j];
    for (let i = 0; i < word.length; i++) {
      const char = word[i];

      if (charIndices.hasOwnProperty(char)) {
        console.log([char], ":", [charIndices[char]-1, i]);
        break
      } else { 
        charIndices[char] = i + 1; 
      }
    }
  }
});
